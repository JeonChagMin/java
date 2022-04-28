package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D1026_3¹ø {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		Scanner s= new Scanner(System.in);
		
		

	}

}

class Student {
	private String id;
	private int number;
	Student(String id, int number) {
		this.id = id;
		this.number = number;
	}
	
	String getId() {
		return id;
	}
	int getNumber() {
		return number;
	}
	
}