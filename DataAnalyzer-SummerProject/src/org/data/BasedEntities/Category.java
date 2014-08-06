/**
 * 
 */
package org.data.BasedEntities;

/**
 * @author peaonunes
 * The category is the class of questions asked during the focusing group.
 * Each category has to have one unique ID for further relating with comments.
 * Each category has a text associate which is the question itself.
 */
public class Category {
	
	private int ID;
	private String text;

	public Category(String text, int ID) {
		super();
		this.ID = ID;
		this.text = text;
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

}