package collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

class Dog1 implements Comparable<Dog1>{
	String color;
	int size;
	Dog1(String c, int s) {
		color = c;
		size = s;
	}
	
	public boolean equals(Object o) {
		return ((Dog)o).color == this.color;
	}
	
	public int hashCode() {
		return color.length();
	}
	
	public String toString(){
		return color+" dog";
	}
	
	public int compareTo(Dog1 o) {
		return o.size - this.size;
	}
}


public class TreeMapTest {
	public static void main (String[] args) {
		TreeMap<Dog1, Integer> tm = new TreeMap<Dog1, Integer>();
		Dog1 d1 = new Dog1("red", 30);
		Dog1 d2 = new Dog1("black", 20);
		Dog1 d3 = new Dog1("white", 10);
		Dog1 d4 = new Dog1("white", 10);
		
		tm.put(d1, 10);
		tm.put(d2, 15);
		tm.put(d3, 5);
		tm.put(d4, 20);
		
		System.out.println(tm.size());
		for(Entry<Dog1, Integer> entry :tm.entrySet()){
			System.out.println(entry.getKey().toString()+ " "+ entry.getValue());
		}
	}

}
