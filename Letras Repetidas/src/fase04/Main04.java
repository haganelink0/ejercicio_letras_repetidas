package fase04;

import java.util.ArrayList;
import java.util.List;

public class Main04 {

	public static void main(String[] args) {
		char nameArray[] = {'a','n','t','o','n'};
		
		List<Character> name = new ArrayList<Character>();
		
		for(char a : nameArray) {
			name.add(a);
		}
		
		char surnameArray[] = {'l','a','g','e'};
		
		List<Character> surname = new ArrayList<Character>();
		for (char a : surnameArray) {
			surname.add(a);
		}
		
		List<Character> fullName = new ArrayList<Character>();
		for (char a: name) {
			fullName.add(a);
		}
		fullName.add(' ');
		for (char a: surname) {
			fullName.add(a);
		}
		
		System.out.println(fullName);

	}

}
