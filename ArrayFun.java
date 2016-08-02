package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFun {

	public static void main(String[] args) {
	ArrayList <String> inputs = new ArrayList<>();
	
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Type a book, movie, or band");
		for (int i = 0; i < 10; i++) {
			inputs.add(keyboard.next());
			
		}
		System.out.println("Finished first array and now it is time to Enter in the second set.");
		for (int j = 10; j < 20; j++) {
			inputs.add(keyboard.next());
			 		}
		System.out.println("The End");

			System.out.println(inputs);

		
		keyboard.close();
		
	}

	public void Berry() {
		System.out.println("Berry");
	}

	private int Numbers() {
		return 5;
	}

	public double Twins() {
		return 20.00;
	}

	private boolean YN() {
		System.out.println("Yes");
		return true;

	}

	protected void Yay() {
		String Alien;
	}

	private char Nice() {
		boolean shouldIstayorshouldIgo;
		return 'n';

	}
	
	protected boolean Toomany() {
		double iSpy;
		return false;
	}
	private float Whew(){
		int funnel;
		return 2.35f;
}
	public float MyGoodness(){
		double superman = 1000;
		return 3.28f;
	}
	protected char Envelope() {
		String Suzy;
		return 'Y';
	}
}
