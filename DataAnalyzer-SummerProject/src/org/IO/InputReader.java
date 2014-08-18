/**
 * 
 */
package org.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.data.BasedEntities.Category;
import org.data.BasedEntities.Comment;
import org.data.BasedEntities.User;
import org.data.BasedEntities.UserLst;

/**
 * @author peaonunes
 *	The input text file should be in the format described bellow:
 *
 *  For each line.
 *	<COMMENT_TYPE>,<COMMENT_ID>,<USER_ID>,<PARENT_ID>,<COMMENT_TEXT>
 *
 *	<COMMENT_TYPE>
 *	0 : Test comments
 *	1 : Commentary/Answer
 *	2 : Question 
 *
 *	<COMMENT_ID>
 *	Unique ID for the comment
 *
 *	<USER_ID>
 *	ID of the user owner of this comment
 *	
 *	<PARENT_ID>
 *	0 : If it is a question
 *	X : Where X will be the ID of the question related to this comment
 *
 *	<COMMENT_TEXT>
 *	Text itself
 * 
 */
public class InputReader {
	
	private BufferedReader reader;
	private UserLst userLst;
	
	public InputReader() {
		this.userLst = new UserLst();
	}

	public UserLst getUserLst() {
		return userLst;
	}

	public void setUserLst(UserLst userLst) {
		this.userLst = userLst;
	}

	public BufferedReader getReader() {
		return reader;
	}

	public void setReader(BufferedReader archive) {
		this.reader = archive;
	}

	public void readFile(String name){
		try {
			BufferedReader br = new BufferedReader(new FileReader(name));
			this.setReader(br);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  
	}
	
	public void createEntities(){
		try {
			while(this.reader.ready()){
				String linha = this.reader.readLine(); 
				String[] data = linha.split(",");
				
				int commentType = Integer.parseInt(data[0]);
				int commentID = Integer.parseInt(data[1]);
				int usrID = Integer.parseInt(data[2]);
				int parentID = Integer.parseInt(data[3]);
				String text = data[4];
				
				User usr = new User(usrID);
				User auxiliary = this.userLst.hasUser(usr);
				
				if(auxiliary != null){
					if(commentType == 2){
						usr.getCategoryLst().add(new Category(text, commentID, usrID, parentID));
					} else if (commentType == 1){
						usr.getCommentsLst().add(new Comment(text, commentID, usrID, parentID));
					}
					this.userLst.getUserLst().add(usr);
				} else {
					/*
					 * PROBLEM
					 */
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		InputReader reader = new InputReader();
		reader.readFile("Input.txt");
		
		
	}
}
