package com.company.jones;


import java.util.Scanner;

public class Prompts {
    Scanner input = new Scanner(System.in);

    public int promptInt(String message) {
        boolean i = false;
        String inp="";
        int inpt=0;
        while (i!=true) {
            try {
                System.out.println(message);
                inp = input.nextLine();
                inpt=Integer.parseInt(inp);
                i=true;
            } catch (Exception NumberFormatException) {
                System.out.println("try agian");
            }


        }
        return inpt;
    }

    public double promptDouble(String message){
        boolean i = false;
        String inp="";
        double inpt=0;
        while (i!=true) {
            try {
                System.out.println(message);
                inp = input.nextLine();
                inpt=Double.parseDouble(inp);
                i=true;
            } catch (Exception NumberFormatException) {
                System.out.println("try agian");
            }


        }
        return inpt;
    }
    public String promptString(String message){
        boolean i = false;
        String inp="";
        while (i!=true) {
            try {
                System.out.println(message);
                inp = input.nextLine();
                Double.parseDouble(inp);
                System.out.println("that's a number. try a word or sumn next time");
            } catch (Exception NumberFormatException) {
                i = true;
            }
        }
        return inp;
    }



}
