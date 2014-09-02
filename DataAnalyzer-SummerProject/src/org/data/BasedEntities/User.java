/**
 * 
 */
package org.data.BasedEntities;

import java.util.ArrayList;

/**
 * @author peaonunes
 * Every user has its unique ID.
 * Every user has its list of comments did in the focusing session.
 */
public class User {
	
	private int ID;
	private ArrayList<Comment> commentsLst;
	private ArrayList<Category> categoryLst;

	public User(int iD) {
		this.ID = iD;
		this.commentsLst = new ArrayList<Comment>();
		this.categoryLst = new ArrayList<Category>();
	}

	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		this.ID = iD;
	}
	
	public ArrayList<Comment> getCommentsLst() {
		return commentsLst;
	}
	
	public void setCommentsLst(ArrayList<Comment> commentsLst) {
		this.commentsLst = commentsLst;
	}
	
	public ArrayList<Category> getCategoryLst() {
		return categoryLst;
	}

	public void setCategoryLst(ArrayList<Category> categoryLst) {
		this.categoryLst = categoryLst;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (ID != other.ID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", commentsLst=" + commentsLst
				+ ", categoryLst=" + categoryLst + "]";
	}

}
