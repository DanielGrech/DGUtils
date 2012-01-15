package com.DGSD.DGUtils.Widgets.QuickActions;

import android.view.View;

public interface IQuickAction {

	/**
	 * Set root view.
	 * 
	 * @param id Layout resource id
	 */
	public void setRootViewId(int id);
	
	/**
	 * Add action item
	 * 
	 * @param action  {@link QuickActionItem}
	 */
	public void addActionItem(QuickActionItem action);
	
	/**
	 * Show the quick action
	 * @param anchor The view the quick action will anchor to
	 */
	public void show (View anchor);
	
	/**
     * Get action item at an index
     * 
     * @param index  Index of item (position from callback)
     * 
     * @return  Action Item at the position
     */
	public QuickActionItem getActionItem(int index);
	
	/**
	 * Listener for item click
	 *
	 */
	public interface OnActionItemClickListener {
		public abstract void onItemClick(IQuickAction source, int pos, int actionId);
	}
	
	/**
	 * Listener for window dismiss
	 * 
	 */
	public interface OnDismissListener {
		public abstract void onDismiss();
	}
}
