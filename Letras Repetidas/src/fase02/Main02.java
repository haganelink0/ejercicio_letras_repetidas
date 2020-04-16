package fase02;

import java.util.ArrayList;
import java.util.List;

public class Main02 {

	public static void main(String[] args) {
		char nameArray[] = {'a','n','t','o','n'};
		
		List<Character> name = new ArrayList<Character>();
		
		for(char a : nameArray) {
			name.add(a);
		}
		//List name no puede contener números porque es un Array de carácteres.
		for(int i = 0; i < name.size();i++) {
			if(name.get(i).equals('a') || name.get(i).equals('e') || name.get(i).equals('i') || name.get(i).equals('o') || name.get(i).equals('u')) {
				System.out.println("Vocal");
			} else {
				System.out.println("Consonante");
			}
		}

	}

}
