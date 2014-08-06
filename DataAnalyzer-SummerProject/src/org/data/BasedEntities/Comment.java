/**
 * 
 */
package org.data.BasedEntities;

/**
 * @author peaonunes
 * Each Comment has the text which is the content of the comment.
 * Each Comment also has the userID which is the reference to the owner of the comment.
 */
public class Comment {
	
	private String text;
	private int userID;
	
	public Comment(String text, int userID) {
		super();
		this.userID = userID;
		this.text = text;
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
	
	
}
