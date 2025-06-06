package org.rigesharing.designPattern.BehaviouralPatterns.MomentoPattern;

public class EditorMain {

	public static void main(String args[]) {
		TextEditorTemp editor =new TextEditorTemp();
		History history =new History();
		editor.write("Testing Momento Pattern Headline", "Testing Momento Pattern content");
		history.saveState(editor);
		editor.write("Testing Momento Pattern Headline2", "Testing Momento Pattern content2");
		history.saveState(editor);
		
		System.out.println(editor.getHeadLine()+ " "+editor.getContent()+"-----Second Content---");
		history.undo(editor);
		System.out.println(editor.getHeadLine()+ " "+editor.getContent()+"-----First Content---");
	}
}
