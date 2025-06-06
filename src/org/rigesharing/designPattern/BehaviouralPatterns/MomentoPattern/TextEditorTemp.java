package org.rigesharing.designPattern.BehaviouralPatterns.MomentoPattern;

public class TextEditorTemp {

	private String headLine;
	private String content;
	
	public void write(String headline,String content) {
		this.headLine=headline;
		this.content=content;
	}
	
	public MomentoEditor save() {
		return new MomentoEditor(headLine,content);
	}
	
	public void restore(MomentoEditor editor) {
		headLine= editor.getHeadLine();
		content = editor.getContent();
	}
	
	public String getHeadLine() {
		return headLine;
	}
	
	public String getContent() {
		return content;
	}
	
	
}
