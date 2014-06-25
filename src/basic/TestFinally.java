package basic;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author jes2ica
 *
 */
public class TestFinally {

	public boolean isConfusing() {
		try {
			return true;
		} finally {
			return false;
		}
	}


	public static void main (String[] args) {
		TestFinally t = new TestFinally();
		System.out.println(t.isConfusing());
		
		
		List<Integer> list = new ArrayList<Integer>();
		if (list instanceof List<?>) { 
			System.out.println("true"); }
	}

}
