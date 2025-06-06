package org.rigesharing.designPattern.BehaviouralPatterns.MomentoPattern;

import java.util.Stack;

public class History {

	private final Stack<MomentoEditor> history = new Stack<>();
	
	public void saveState(TextEditorTemp editor) {
		history.push(editor.save());
		
	}
	public void undo(TextEditorTemp editorTemp) {
		if(!history.empty()) {
			history.pop();
			editorTemp.restore(history.peek());
		}
	}
}
