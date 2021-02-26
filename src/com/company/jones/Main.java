package com.company.jones;

public class Main {

    public static void main(String[] args) {
        Prompts gamer=new Prompts();
	String word=gamer.promptString("give me a word not a number");
	int integer=gamer.promptInt("give me a integer not a double");
	double dooble=gamer.promptDouble("give me a double not a word");
        System.out.println(word+"    "+integer+"    "+dooble);
    }
}
