package COLLECTIONS;
import java.util.*;
public class maP {

	public static void main(String[] args) {
		//MAP is a combination of SET and LIST
		//KEYS are SET that is to be unique and VALUES are LIST that can be repeated
		
		HashMap<Integer,Integer> map = new HashMap();
		int [] arr = {10,2,5,0};
        for(int i =0;i<arr.length;i++){
            map.put(i+1,arr[i]);
        }
        System.out.println(map.get(1));
        System.out.println(map);
        
        for(int n : map.keySet())
        {
        	System.out.println(n + " "+map.get(n));
        }
        Map <String,Integer> Students = new TreeMap();
        Students.put("Manish",100);
        Students.put("Anish",66);
        Students.put("Vigram",96);
        Students.put("Daniel",86);
        Students.put("Harish",65);
        
        System.out.println(Students);
        for(String name  : Students.keySet())
        {
        	System.out.println(name + " : "+ Students.get(name));
        }
	}

}
