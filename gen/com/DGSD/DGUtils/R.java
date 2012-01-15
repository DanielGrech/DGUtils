/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.DGSD.DGUtils;

public final class R {
    public static final class anim {
        public static int disappear=0x7f040000;
        public static int grow_from_bottom=0x7f040001;
        public static int grow_from_bottomleft_to_topright=0x7f040002;
        public static int grow_from_bottomright_to_topleft=0x7f040003;
        public static int grow_from_top=0x7f040004;
        public static int grow_from_topleft_to_bottomright=0x7f040005;
        public static int grow_from_topright_to_bottomleft=0x7f040006;
        public static int pump_bottom=0x7f040007;
        public static int pump_top=0x7f040008;
        public static int rail=0x7f040009;
        public static int shrink_from_bottom=0x7f04000a;
        public static int shrink_from_bottomleft_to_topright=0x7f04000b;
        public static int shrink_from_bottomright_to_topleft=0x7f04000c;
        public static int shrink_from_top=0x7f04000d;
        public static int shrink_from_topleft_to_bottomright=0x7f04000e;
        public static int shrink_from_topright_to_bottomleft=0x7f04000f;
    }
    public static final class attr {
        /**  Alignment constants. 
         <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>alignBounds</code></td><td>0</td><td> Align the bounds of the children.
        See {@link android.widget.GridLayout#ALIGN_BOUNDS}. </td></tr>
<tr><td><code>alignMargins</code></td><td>1</td><td> Align the margins of the children.
        See {@link android.widget.GridLayout#ALIGN_MARGINS}. </td></tr>
</table>
         */
        public static int alignmentMode=0x7f010000;
        /**  The maxmimum number of columns to create when automatically positioning children. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int columnCount=0x7f010002;
        /**  When set to true, forces column boundaries to appear in the same order
        as column indices.
        The default is true.
        See {@link android.widget.GridLayout#setColumnOrderPreserved(boolean)}.
         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int columnOrderPreserved=0x7f010005;
        /**  The column span: the difference between the right and left
        boundaries delimiting the group of cells occupied by this view.
        The default is one.
        See {@link android.widget.GridLayout.Spec}. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int layout_columnSpan=0x7f010008;
        /**  The row boundary delimiting the top of the group of cells
        occupied by this view. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int layout_row=0x7f010006;
        /**  The row span: the difference between the bottom and top
        boundaries delimiting the group of cells occupied by this view.
        The default is one.
        See {@link android.widget.GridLayout.Spec}. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int layout_rowSpan=0x7f010007;
        /**  The maxmimum number of rows to create when automatically positioning children. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int rowCount=0x7f010001;
        /**  When set to true, forces row boundaries to appear in the same order
        as row indices.
        The default is true.
        See {@link android.widget.GridLayout#setRowOrderPreserved(boolean)}.
         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int rowOrderPreserved=0x7f010004;
        /**  When set to true, tells GridLayout to use default margins when none are specified
        in a view's layout parameters.
        The default value is false.
        See {@link android.widget.GridLayout#setUseDefaultMargins(boolean)}.
         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int useDefaultMargins=0x7f010003;
    }
    public static final class dimen {
        /**  The default gap between components in a layout. 
         */
        public static int default_gap=0x7f060000;
    }
    public static final class drawable {
        public static int action_item_btn=0x7f020000;
        public static int action_item_selected=0x7f020001;
        public static int arrow_down=0x7f020002;
        public static int arrow_up=0x7f020003;
        public static int ic_accept=0x7f020004;
        public static int ic_add=0x7f020005;
        public static int ic_list_more=0x7f020006;
        public static int ic_list_more_selected=0x7f020007;
        public static int ic_up=0x7f020008;
        public static int popup=0x7f020009;
        public static int quickaction_arrow_down=0x7f02000a;
        public static int quickaction_arrow_up=0x7f02000b;
        public static int quickaction_background=0x7f02000c;
        public static int quickaction_bottom_frame=0x7f02000d;
        public static int quickaction_slider_background=0x7f02000e;
        public static int quickaction_slider_btn=0x7f02000f;
        public static int quickaction_slider_btn_normal=0x7f020010;
        public static int quickaction_slider_btn_on=0x7f020011;
        public static int quickaction_slider_btn_pressed=0x7f020012;
        public static int quickaction_slider_btn_selected=0x7f020013;
        public static int quickaction_slider_grip_left=0x7f020014;
        public static int quickaction_slider_grip_right=0x7f020015;
        public static int quickaction_top_frame=0x7f020016;
        public static int quickcontact_drop_shadow=0x7f020017;
        public static int textfield_default=0x7f020018;
    }
    public static final class id {
        public static int alignBounds=0x7f050000;
        public static int alignMargins=0x7f050001;
        public static int arrow_down=0x7f050007;
        public static int arrow_up=0x7f050006;
        public static int footer=0x7f05000a;
        public static int header2=0x7f050008;
        public static int i_more=0x7f05000b;
        public static int iv_icon=0x7f050002;
        public static int scroll=0x7f050009;
        public static int scroller=0x7f050004;
        public static int t_name=0x7f05000c;
        public static int tracks=0x7f050005;
        public static int tv_title=0x7f050003;
    }
    public static final class layout {
        public static int main=0x7f030000;
        public static int quick_action_3d_action_item_horizontal=0x7f030001;
        public static int quick_action_3d_action_item_vertical=0x7f030002;
        public static int quick_action_3d_horiz_separator=0x7f030003;
        public static int quick_action_3d_popup_horizontal=0x7f030004;
        public static int quick_action_3d_popup_vertical=0x7f030005;
        public static int quick_action_base=0x7f030006;
        public static int quick_action_item=0x7f030007;
        public static int quick_action_list=0x7f030008;
    }
    public static final class string {
        public static int app_name=0x7f070001;
        public static int hello=0x7f070000;
    }
    public static final class style {
        public static int Animations=0x7f080000;
        /**  PopDownMenu 
         */
        public static int Animations_PopDownMenu=0x7f080001;
        public static int Animations_PopDownMenu_Center=0x7f080004;
        public static int Animations_PopDownMenu_Left=0x7f080002;
        public static int Animations_PopDownMenu_Reflect=0x7f080005;
        public static int Animations_PopDownMenu_Right=0x7f080003;
        /**  PopUpMenu 
         */
        public static int Animations_PopUpMenu=0x7f080006;
        public static int Animations_PopUpMenu_Center=0x7f080009;
        public static int Animations_PopUpMenu_Left=0x7f080007;
        public static int Animations_PopUpMenu_Reflect=0x7f08000a;
        public static int Animations_PopUpMenu_Right=0x7f080008;
    }
    public static final class styleable {
        /** Attributes that can be used with a GridLayout.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #GridLayout_alignmentMode com.DGSD.DGUtils:alignmentMode}</code></td><td> When set to alignMargins, causes alignment to take place between the outer
        boundary of a view, as defined by its margins.</td></tr>
           <tr><td><code>{@link #GridLayout_android_orientation com.DGSD.DGUtils:android_orientation}</code></td><td> The orientation property is not used during layout.</td></tr>
           <tr><td><code>{@link #GridLayout_columnCount com.DGSD.DGUtils:columnCount}</code></td><td> The maxmimum number of columns to create when automatically positioning children.</td></tr>
           <tr><td><code>{@link #GridLayout_columnOrderPreserved com.DGSD.DGUtils:columnOrderPreserved}</code></td><td> When set to true, forces column boundaries to appear in the same order
        as column indices.</td></tr>
           <tr><td><code>{@link #GridLayout_rowCount com.DGSD.DGUtils:rowCount}</code></td><td> The maxmimum number of rows to create when automatically positioning children.</td></tr>
           <tr><td><code>{@link #GridLayout_rowOrderPreserved com.DGSD.DGUtils:rowOrderPreserved}</code></td><td> When set to true, forces row boundaries to appear in the same order
        as row indices.</td></tr>
           <tr><td><code>{@link #GridLayout_useDefaultMargins com.DGSD.DGUtils:useDefaultMargins}</code></td><td> When set to true, tells GridLayout to use default margins when none are specified
        in a view's layout parameters.</td></tr>
           </table>
           @see #GridLayout_alignmentMode
           @see #GridLayout_android_orientation
           @see #GridLayout_columnCount
           @see #GridLayout_columnOrderPreserved
           @see #GridLayout_rowCount
           @see #GridLayout_rowOrderPreserved
           @see #GridLayout_useDefaultMargins
         */
        public static final int[] GridLayout = {
            0x010100c4, 0x7f010000, 0x7f010001, 0x7f010002,
            0x7f010003, 0x7f010004, 0x7f010005
        };
        /**
          <p>
          @attr description
           When set to alignMargins, causes alignment to take place between the outer
        boundary of a view, as defined by its margins. When set to alignBounds,
        causes alignment to take place between the edges of the view.
        The default is alignMargins.
        See {@link android.widget.GridLayout#setAlignmentMode(int)}.


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>alignBounds</code></td><td>0</td><td> Align the bounds of the children.
        See {@link android.widget.GridLayout#ALIGN_BOUNDS}. </td></tr>
<tr><td><code>alignMargins</code></td><td>1</td><td> Align the margins of the children.
        See {@link android.widget.GridLayout#ALIGN_MARGINS}. </td></tr>
</table>
          <p>This is a private symbol.
          @attr name android:alignmentMode
        */
        public static final int GridLayout_alignmentMode = 1;
        /**
          <p>
          @attr description
           The orientation property is not used during layout. It is only used to
        allocate row and column parameters when they are not specified by its children's
        layout paramters. GridLayout works like LinearLayout in this case;
        putting all the components either in a single row or in a single column -
        depending on the value of this flag. In the horizontal case, a columnCount
        property may be additionally supplied to force new rows to be created when a
        row is full. The rowCount attribute may be used similarly in the vertical case.
        The default is horizontal. 
          <p>This corresponds to the global attribute          resource symbol {@link com.DGSD.DGUtils.R.attr#android_orientation}.
          @attr name android:android_orientation
        */
        public static final int GridLayout_android_orientation = 0;
        /**
          <p>
          @attr description
           The maxmimum number of columns to create when automatically positioning children. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:columnCount
        */
        public static final int GridLayout_columnCount = 3;
        /**
          <p>
          @attr description
           When set to true, forces column boundaries to appear in the same order
        as column indices.
        The default is true.
        See {@link android.widget.GridLayout#setColumnOrderPreserved(boolean)}.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:columnOrderPreserved
        */
        public static final int GridLayout_columnOrderPreserved = 6;
        /**
          <p>
          @attr description
           The maxmimum number of rows to create when automatically positioning children. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:rowCount
        */
        public static final int GridLayout_rowCount = 2;
        /**
          <p>
          @attr description
           When set to true, forces row boundaries to appear in the same order
        as row indices.
        The default is true.
        See {@link android.widget.GridLayout#setRowOrderPreserved(boolean)}.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:rowOrderPreserved
        */
        public static final int GridLayout_rowOrderPreserved = 5;
        /**
          <p>
          @attr description
           When set to true, tells GridLayout to use default margins when none are specified
        in a view's layout parameters.
        The default value is false.
        See {@link android.widget.GridLayout#setUseDefaultMargins(boolean)}.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:useDefaultMargins
        */
        public static final int GridLayout_useDefaultMargins = 4;
        /** Attributes that can be used with a GridLayout_Layout.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #GridLayout_Layout_android_layout_column com.DGSD.DGUtils:android_layout_column}</code></td><td> The column boundary delimiting the left of the group of cells
        occupied by this view.</td></tr>
           <tr><td><code>{@link #GridLayout_Layout_android_layout_gravity com.DGSD.DGUtils:android_layout_gravity}</code></td><td> Gravity specifies how a component should be placed in its group of cells.</td></tr>
           <tr><td><code>{@link #GridLayout_Layout_layout_columnSpan com.DGSD.DGUtils:layout_columnSpan}</code></td><td> The column span: the difference between the right and left
        boundaries delimiting the group of cells occupied by this view.</td></tr>
           <tr><td><code>{@link #GridLayout_Layout_layout_row com.DGSD.DGUtils:layout_row}</code></td><td> The row boundary delimiting the top of the group of cells
        occupied by this view.</td></tr>
           <tr><td><code>{@link #GridLayout_Layout_layout_rowSpan com.DGSD.DGUtils:layout_rowSpan}</code></td><td> The row span: the difference between the bottom and top
        boundaries delimiting the group of cells occupied by this view.</td></tr>
           </table>
           @see #GridLayout_Layout_android_layout_column
           @see #GridLayout_Layout_android_layout_gravity
           @see #GridLayout_Layout_layout_columnSpan
           @see #GridLayout_Layout_layout_row
           @see #GridLayout_Layout_layout_rowSpan
         */
        public static final int[] GridLayout_Layout = {
            0x010100b3, 0x0101014c, 0x7f010006, 0x7f010007,
            0x7f010008
        };
        /**
          <p>
          @attr description
           The column boundary delimiting the left of the group of cells
        occupied by this view. 
          <p>This corresponds to the global attribute          resource symbol {@link com.DGSD.DGUtils.R.attr#android_layout_column}.
          @attr name android:android_layout_column
        */
        public static final int GridLayout_Layout_android_layout_column = 1;
        /**
          <p>
          @attr description
           Gravity specifies how a component should be placed in its group of cells.
        The default is LEFT | BASELINE.
        See {@link android.widget.GridLayout.LayoutParams#setGravity(int)}. 
          <p>This corresponds to the global attribute          resource symbol {@link com.DGSD.DGUtils.R.attr#android_layout_gravity}.
          @attr name android:android_layout_gravity
        */
        public static final int GridLayout_Layout_android_layout_gravity = 0;
        /**
          <p>
          @attr description
           The column span: the difference between the right and left
        boundaries delimiting the group of cells occupied by this view.
        The default is one.
        See {@link android.widget.GridLayout.Spec}. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:layout_columnSpan
        */
        public static final int GridLayout_Layout_layout_columnSpan = 4;
        /**
          <p>
          @attr description
           The row boundary delimiting the top of the group of cells
        occupied by this view. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:layout_row
        */
        public static final int GridLayout_Layout_layout_row = 2;
        /**
          <p>
          @attr description
           The row span: the difference between the bottom and top
        boundaries delimiting the group of cells occupied by this view.
        The default is one.
        See {@link android.widget.GridLayout.Spec}. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:layout_rowSpan
        */
        public static final int GridLayout_Layout_layout_rowSpan = 3;
        /**  Give ourselves access to MarginLayout's styleables 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ViewGroup_MarginLayout_android_layout_margin com.DGSD.DGUtils:android_layout_margin}</code></td><td></td></tr>
           <tr><td><code>{@link #ViewGroup_MarginLayout_android_layout_marginBottom com.DGSD.DGUtils:android_layout_marginBottom}</code></td><td></td></tr>
           <tr><td><code>{@link #ViewGroup_MarginLayout_android_layout_marginLeft com.DGSD.DGUtils:android_layout_marginLeft}</code></td><td></td></tr>
           <tr><td><code>{@link #ViewGroup_MarginLayout_android_layout_marginRight com.DGSD.DGUtils:android_layout_marginRight}</code></td><td></td></tr>
           <tr><td><code>{@link #ViewGroup_MarginLayout_android_layout_marginTop com.DGSD.DGUtils:android_layout_marginTop}</code></td><td></td></tr>
           </table>
           @see #ViewGroup_MarginLayout_android_layout_margin
           @see #ViewGroup_MarginLayout_android_layout_marginBottom
           @see #ViewGroup_MarginLayout_android_layout_marginLeft
           @see #ViewGroup_MarginLayout_android_layout_marginRight
           @see #ViewGroup_MarginLayout_android_layout_marginTop
         */
        public static final int[] ViewGroup_MarginLayout = {
            0x010100f6, 0x010100f7, 0x010100f8, 0x010100f9,
            0x010100fa
        };
        /**
          <p>This symbol is the offset where the {@link com.DGSD.DGUtils.R.attr#android_layout_margin}
          attribute's value can be found in the {@link #ViewGroup_MarginLayout} array.
          @attr name android:android_layout_margin
        */
        public static final int ViewGroup_MarginLayout_android_layout_margin = 0;
        /**
          <p>This symbol is the offset where the {@link com.DGSD.DGUtils.R.attr#android_layout_marginBottom}
          attribute's value can be found in the {@link #ViewGroup_MarginLayout} array.
          @attr name android:android_layout_marginBottom
        */
        public static final int ViewGroup_MarginLayout_android_layout_marginBottom = 4;
        /**
          <p>This symbol is the offset where the {@link com.DGSD.DGUtils.R.attr#android_layout_marginLeft}
          attribute's value can be found in the {@link #ViewGroup_MarginLayout} array.
          @attr name android:android_layout_marginLeft
        */
        public static final int ViewGroup_MarginLayout_android_layout_marginLeft = 1;
        /**
          <p>This symbol is the offset where the {@link com.DGSD.DGUtils.R.attr#android_layout_marginRight}
          attribute's value can be found in the {@link #ViewGroup_MarginLayout} array.
          @attr name android:android_layout_marginRight
        */
        public static final int ViewGroup_MarginLayout_android_layout_marginRight = 3;
        /**
          <p>This symbol is the offset where the {@link com.DGSD.DGUtils.R.attr#android_layout_marginTop}
          attribute's value can be found in the {@link #ViewGroup_MarginLayout} array.
          @attr name android:android_layout_marginTop
        */
        public static final int ViewGroup_MarginLayout_android_layout_marginTop = 2;
    };
}