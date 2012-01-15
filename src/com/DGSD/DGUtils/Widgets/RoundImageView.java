package com.DGSD.DGUtils.Widgets;

import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Author: Daniel Grech
 * Date: 17/12/11 10:53 AM
 * Description: An imageview with rounded corners. Also added the ability
 * to programmatically ensure the view is always square
 * Adapted from: www.youtube.com/watch?v=jF6Ad4GYjRU
 */
public class RoundImageView extends ImageView {
    private static final PorterDuffXfermode pdm = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);

    private static final int ALPHA_COLOR = 0xff424242;

    private static Paint mPaint = new Paint();

    private boolean mGotRoundedDrawable = false;

    private boolean mKeepSquare = false;

    private float mRoundingRatio = RoundingRatio.DEFAULT;

    public RoundImageView(Context context) {
        super(context);
    }

    public RoundImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RoundImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if(mKeepSquare) {
            int measuredWidth = getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
            int measuredHeight = getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec);

            //Ensure view is always square
            int size = Math.min(measuredHeight, measuredWidth);
            setMeasuredDimension(size, size);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }

        mGotRoundedDrawable = false;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(getDrawable() != null && !mGotRoundedDrawable) {
            this.setImageBitmap(getRoundedCornerBitmap(((BitmapDrawable)getDrawable()).getBitmap(), mRoundingRatio));
            mGotRoundedDrawable = true;
        }

        super.onDraw(canvas);
    }

    /**
     * Creates a rounded bitmap with corners rounded in 'ratio' proportion to its size
     * @param bitmap The original bitmap to be rounded
     * @param ratio The ratio  of the rounded corners proportional to bitmap size
     * @return A rounded bitmap
     */
    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, float ratio) {
        Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap
                .getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(output);

        final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());

        if(mPaint != null) {
            mPaint.reset();
        } else {
            mPaint = new Paint();
        }

        mPaint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        mPaint.setColor(ALPHA_COLOR);

        float roundAmount = (float) Math.min(rect.height(), rect.width()) / ratio;
        canvas.drawRoundRect(new RectF(rect), roundAmount, roundAmount , mPaint);

        mPaint.setXfermode(pdm);
        canvas.drawBitmap(bitmap, rect, rect, mPaint);

        return output;
    }

    /* We override the invalidate methods so that we are alerted when a new drawable is being drawn */

    @Override
    public void invalidate(Rect dirty) {
        super.invalidate(dirty);

        mGotRoundedDrawable = true;
    }

    @Override
    public void invalidate(int l, int t, int r, int b) {
        super.invalidate(l, t, r, b);

        mGotRoundedDrawable = true;
    }

    @Override
    public void invalidate() {
        super.invalidate();

        mGotRoundedDrawable = true;
    }

    /**
     *
     * @return Degree of corner roundness
     */
    public float getRoundedAmount() {
        return mRoundingRatio;
    }

    /**
     * Set the level of 'roundness' on the imageview. Default value is 15
     * @param roundedAmount Degree of corner roundness
     */
    public void setRoundedAmount(float roundedAmount) {
        if(roundedAmount < 0) {
            throw new IllegalArgumentException("Rounded amount must be greater than 0");
        }

        this.mRoundingRatio = roundedAmount;
    }

    /**
     * Arbitrary values for rounding corners
     */
    public static class RoundingRatio {
        public static final float DEFAULT = 18;

        public static final float LOW = 10;

        public static final float HIGH = 25;
    }

    public boolean isKeptSquare() {
        return mKeepSquare;
    }

    public void setKeepSquare(boolean mKeepSquare) {
        this.mKeepSquare = mKeepSquare;
    }
}

