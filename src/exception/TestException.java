package exception;
/**
 * 
 */

/**
 * @author jes2ica
 *
 */
class ZeroException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ZeroException(String msg) {
		super(msg);
	}
}

class NegativeException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public NegativeException(String msg) {
		super(msg);
	}
}

public class TestException {
	
	public int devide (int x, int y) throws NegativeException, ZeroException {
		if(y < 0) {
			throw new NegativeException ("Cannot be negative number!!");
		}
		if(y == 0) {
			throw new ZeroException ("Cannot be zero!!");
		}
		
		int m = x / y;
		return m;
	}
	
	public static void main (String args[]) {
		TestException t = new TestException();
		try {
			System.out.println("res=" + t.devide(1, -3)); 
		} catch (ZeroException e) {
			e.printStackTrace();
		} catch (NegativeException e) {
			e.printStackTrace();
		}
	}
}



