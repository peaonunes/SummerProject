/**
 * 
 */
package org.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import org.data.BasedEntities.Category;
import org.data.BasedEntities.Comment;
import org.data.BasedEntities.User;
import org.data.BasedEntities.UserRepository;
import org.data.BasedEntities.WorkEntitie;

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
	private WorkEntitie workEntitie;
	
	public InputReader() {
		this.workEntitie = new WorkEntitie();
	}

	public WorkEntitie getWorkEntitie() {
		return workEntitie;
	}

	public void setWorkEntitie(WorkEntitie workEntitie) {
		this.workEntitie = workEntitie;
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
				User auxiliary = this.workEntitie.getUserLst().hasUser(usr);
				
				if(auxiliary != null){
					this.addText(commentType, commentID, usrID, parentID, text, usr);
					this.workEntitie.getUserLst().getUserLst().add(usr);
				} else {
					this.addText(commentType, commentID, usrID, parentID, text, auxiliary);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addText(int commentType, int commentID, int usrID, int parentID, String text, User usr) {
		if(commentType == 2){
			usr.getCategoryLst().add(new Category(text, commentID, usrID, parentID));
		} else if (commentType == 1){
			usr.getCommentsLst().add(new Comment(text, commentID, usrID, parentID));
		}
	}
	
	
	public static void main(String[] args) {
		InputReader reader = new InputReader();
		reader.readFile("Input.txt");
		
		File out = new File("Debug.txt");
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(out), "UTF-8"));
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
