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
	
	public User(int iD, ArrayList<Comment> commentsLst) {
		super();
		this.ID = iD;
		this.commentsLst = commentsLst;
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

}
