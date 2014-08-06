package org.data.BasedEntities;

import java.util.ArrayList;

public class UserLst {
	
	private ArrayList<User> userLst;
	
	public UserLst() {
		this.userLst = new ArrayList<User>();
	}
	
	public void newUser(User usr){
		this.userLst.add(usr);
	}
	
	public boolean hasUser(User usr){
		return this.userLst.contains(usr);
	}
	
	public boolean removeUser(User usr){
		return this.userLst.remove(usr);
	}

	public ArrayList<User> getUserLst() {
		return userLst;
	}

	public void setUserLst(ArrayList<User> userLst) {
		this.userLst = userLst;
	}

}
