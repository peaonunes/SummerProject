/**
 * 
 */
package org.data.BasedEntities;

/**
 * @author peaonunes
 * 
 */
public class Comment {
	
	private String text;
	private int ID;
	private int userID;
	private int parentID;
	
	public Comment(String text,int ID, int userID, int parentID) {
		this.ID = ID;
		this.parentID = parentID;
		this.userID = userID;
		this.text = text;
	}
	
	
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
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
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + userID;
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
		Comment other = (Comment) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (userID != other.userID)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Comment [text=" + text + ", ID=" + ID + ", userID=" + userID
				+ ", parentID=" + parentID + "]";
	}
	
}
