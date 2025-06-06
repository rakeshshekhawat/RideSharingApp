// This class manages the formatting process of a document using various text formatting strategies.

package org.rigesharing.designPattern.BehaviouralPatterns.StrategyPattern;

import java.util.Scanner;

public class Exercise {
    
  
    public void run() {
        
        Scanner sc = new Scanner(System.in);
        Document document = new Document();
        document.setFormatter(new PlainTextFormatter());
        String userInput = sc.nextLine();
        document.setContent(userInput);

        // Using PlainTextFormatter
        
        
        System.out.println("Plain Text:");
        document.display();

        // Using HTMLFormatter
        // TODO: Set the formatter for the document to HTMLFormatter.
        
        
        System.out.println("HTML Format:");
        document.display();

        // Using MarkdownFormatter
        // TODO: Set the formatter for the document to MarkdownFormatter.
        
        
        System.out.println("Markdown Format:");
        document.display(); 
        
        sc.close();
    }
    public static void main (String args[]) {
    	Document doc = new Document();
    	Exercise exercise = new Exercise();
    	exercise.run();
    	
    }
}

interface formatter{

    void format();
    void setContent(String content);
}
class Document{
    formatter formatter;
    public void setFormatter(formatter formatter){
        this.formatter=formatter;
    }
    
   
    public void display() {
    	formatter.format();
    }
    public void setContent(String content){
        this.formatter.setContent(content);
    }
    
    
    
}

class HTMLFormatter implements formatter{
    String content;
    public void format(){
        System.out.println("This is HTMLFormatter :"+content );
    }
    public void setContent(String content){
        this.content=content;
    }
}

class PlainTextFormatter implements formatter{
    String content;
    public void format(){
        System.out.println("This is PlainTextFormatter :"+content );
    }
    public void setContent(String content){
        this.content=content;
    }
}
class MarkdownFormatter implements formatter{
    String content;
    public void format(){
        System.out.println("This is MarkdownFormatter :"+content );
    }
    public void setContent(String content){
        this.content=content;
    }
    
}/*
	 * class Test{ public static void main(String args[]) {
	 * 
	 * } }
	 */













