package _04_popcorn;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn pop= new Popcorn("bob");
	System.out.println(" what flavor of pop of the corn would you desire?");
	String q = new Scanner(System.in).nextLine();
	System.out.println("and how long do you desire to cook the said pop of the corn");
	String w = new Scanner(System.in).nextLine();
Microwave e = new Microwave();
e.putInMicrowave(pop);
int i = Integer.parseInt(w); 
e.setTime(i);
e.startMicrowave();
}
}	

