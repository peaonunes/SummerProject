package org.data.BasedEntities;

import java.util.ArrayList;

public class UserRepository {
	
	private ArrayList<User> userLst;
	
	public UserRepository() {
		this.userLst = new ArrayList<User>();
	}
	
	public void newUser(User usr){
		this.userLst.add(usr);
	}
	
	public User hasUser(User usr){
		User obj = null;
		
		if(this.userLst.contains(usr)){
			for (int i = 0; i < userLst.size(); i++) {
				if(usr.getID() == userLst.get(i).getID()){
					obj = userLst.get(i);
					break;
				}
			}
		} 
		
		return obj;
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
	
	public static void main(String[] args) {
		User x = new User(1);
		User y = new User(2);
		User z = new User(3);
		
		UserRepository lst = new UserRepository();
		lst.newUser(x);
		lst.newUser(y);
		
		System.out.println(lst.hasUser(x).getID());
		System.out.println(lst.hasUser(y).getID());
		System.out.println(lst.hasUser(z));
	}

}
