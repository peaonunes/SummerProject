package org.data.BasedEntities;

import java.util.ArrayList;

public class WorkEntitie {
	
	private UserLst userLst;
	private ArrayList<Comment> commentLst;
	private ArrayList<Category> categoryLst;
	
	public WorkEntitie() {
	}
	
	public ArrayList<Comment> getCommentLst() {
		return commentLst;
	}

	public void setCommentLst(ArrayList<Comment> commentLst) {
		this.commentLst = commentLst;
	}

	public ArrayList<Category> getCategoryLst() {
		return categoryLst;
	}

	public void setCategoryLst(ArrayList<Category> categoryLst) {
		this.categoryLst = categoryLst;
	}

	public UserLst getUserLst() {
		return userLst;
	}
	public void setUserLst(UserLst userLst) {
		this.userLst = userLst;
	}
	
}
