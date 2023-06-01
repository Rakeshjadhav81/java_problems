//count the characters in the string and their count(how many times they repeat..)

import java.util.HashMap;

public class StringMaxChar {

	public static void main(String[] args) {
		
		String str = "mumbaiindianschennaisuperkings";
		
		HashMap<Character,Integer> map = new HashMap<>();
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
		
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				count=map.get(c);
			}
			else {
				map.put(c, 1);
				count=map.get(c);
			}
		}
		
		for(Character a : map.keySet()) {
			System.out.println(a+" "+map.get(a));
		}
	}

}
