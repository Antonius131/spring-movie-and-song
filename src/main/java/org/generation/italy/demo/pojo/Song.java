package org.generation.italy.demo.pojo;

public class Song {

	private int id;
	private String text;
	
	public Song(int id, String text) {
		
		setId(id);
		setText(text);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
