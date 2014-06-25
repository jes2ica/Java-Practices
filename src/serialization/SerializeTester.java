/**
 * 
 */
package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author jes2ica
 *
 */
public class SerializeTester implements Serializable {  
    
	private static final long serialVersionUID = 1L;

	public static void main(String[] strings) throws Exception {  
        File file = new File("out.ser");  
  
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));  
        SessionDTO dto1 = new SessionDTO(2345);  
        oos.writeObject(dto1);  
        oos.close();  
  
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));  
        SessionDTO dto2 = (SessionDTO) ois.readObject();  
  
        System.out.println("data : " + dto2.getData() + " activation time : " + dto2.getActivationTime());  
        ois.close();  
    }  
}  
