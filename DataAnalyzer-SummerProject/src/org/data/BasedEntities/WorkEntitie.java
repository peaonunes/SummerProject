package org.data.BasedEntities;

import java.util.ArrayList;

public class WorkEntitie {
	
	private UserRepository userRepo;
	private ArrayList<Comment> commentLst;
	private ArrayList<Category> categoryLst;
	
	public WorkEntitie() {
		this.userRepo = new UserRepository();
		this.commentLst = new ArrayList<Comment>();
		this.categoryLst = new ArrayList<Category>();
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

	public UserRepository getUserLst() {
		return userRepo;
	}
	public void setUserLst(UserRepository userLst) {
		this.userRepo = userLst;
	}
	
}
