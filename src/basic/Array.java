package basic;
import java.util.Arrays;


public class Array {
	public static void main(String args[]) {
		int a[] = {3, 4, 6, 11, 12};
		int b[] = Arrays.copyOf(a, a.length + 1);
		System.out.println("");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
