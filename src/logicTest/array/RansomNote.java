package logicTest.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RansomNote {

//	static String []magazine = {"o", "l", "x", "imjaw", "bee", "khmla", "v", "o", "v", "o", "imjaw", "l", "khmla", "imjaw", "x"};
//	static String []note = {"imjaw", "l", "khmla", "x", "imjaw", "o", "l", "l", "o", "khmla", "v", "bee", "o",
//			"o", "imjaw", "imjaw", "o"};
	
//	static String []magazine = {"give", "me", "one", "grand", "today", "night"};
//	static String []note = {"give", "one", "grand", "today"};
	//Yes
	
	static String []magazine = {"two", "times", "three", "is", "not", "four"};
	static String []note = {"two", "times", "two", "is", "four"};

	public static void main(String[] args) {

		solution2(magazine, note);
	}
	
	

    static void solution2(String[] magazine, String[] note){
    	List magazineList = new ArrayList(Arrays.asList(magazine));
        boolean allmatch = Arrays.stream(note).allMatch(item -> {
            int i = magazineList.indexOf(item) ;
            if(i>= 0) {
                magazineList.remove(i);
                return true;
            }else {return false;}
            });
        System.out.println( allmatch? "Yes": "No");
    }
    
    static void solution1(String[] magazine, String[] note){
        
        LinkedList<String> magazineList = new LinkedList<String>(Arrays.asList(magazine));
       
        for(String item :note) {
            if(magazineList.contains(item)) {
                magazineList.remove(item);
            }else{break;}
        }
        
        if( (magazineList.size() + note.length) == magazine.length) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        
    }


}
