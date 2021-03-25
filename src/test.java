
import java.util.*; 
public class test { 
	public static void main(String args[]) { 
		String poem = "Hold fast to dreams"
				+ " For if dreams die"
				+ " Life is a broken-winged bird"
				+ " That cannot fly"
				+ " Hold fast to dreams"
				+ " For when dreams go"
				+ " Life is a barren field"
				+ " Frozen with snow";
		String[] words = poem.split(" ");
		int wordscount = 0;
		int setcount = 0;
		int setcount2 = 0;

		
		HashSet<String> set = new HashSet<String>();
		for(String a : words) {
			set.add(a);
			wordscount++;
		}
		for(String s : set) {
			setcount++;
		}
		System.out.println(set);
		System.out.println("the number of words : " + wordscount);
		System.out.println("the number of words added to the set is :" +setcount);
		
		ArrayList<String> list= new ArrayList<String>();
		
		for(String a : words) {
		list.add(a.toLowerCase());
		}
		HashSet<String> set2 = new HashSet<String>();
			set2.addAll(list);
		
		System.out.println(set2);
		for(String s2 : set2) {
			setcount2++;
		}
		System.out.println("the number of lower case words added to the set2 is :" +setcount2);
	} 
}
