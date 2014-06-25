package collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class LinkedHashMapTest {
	public static void main (String[] args) {
		LinkedHashMap<Dog, Integer> hm = new LinkedHashMap<Dog, Integer>();
		Dog d1 = new Dog("red");
		Dog d2 = new Dog("black");
		Dog d3 = new Dog("white");
		Dog d4 = new Dog("white");
		
		hm.put(d1, 10);
		hm.put(d2, 15);
		hm.put(d3, 5);
		hm.put(d4, 20);
		
		System.out.println(hm.size());
		for(Entry<Dog, Integer> entry :hm.entrySet()){
			System.out.println(entry.getKey().toString()+ " "+ entry.getValue());
		}
	}

}
