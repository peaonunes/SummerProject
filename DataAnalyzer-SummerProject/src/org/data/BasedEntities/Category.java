/**
 * 
 */
package org.data.BasedEntities;

/**
 * @author peaonunes
 * 
 */
public class Category {
	
	private String text;
	private int ID;
	private int userID;
	private int parentID;

	public Category(String text, int ID, int userID, int parentID) {
		this.ID = ID;
		this.userID = userID;
		this.text = text;
		this.parentID = parentID;
	}
	
	
	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public int getParentID() {
		return parentID;
	}

	public void setParentID(int parentID) {
		this.parentID = parentID;
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
		Category other = (Category) obj;
		if (ID != other.ID)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Category [text=" + text + ", ID=" + ID + ", userID=" + userID
				+ ", parentID=" + parentID + "]";
	}
	
}
