/**
 * 
 */
package serialization;

import java.io.Serializable;

/**
 * @author jes2ica
 *
 */
public class SessionDTO implements Serializable {  
    private static final long serialVersionUID = 1L;  
    private int data; // Stores session data  
  
    // Session activation time (creation, deserialization)  
    private long activationTime;   
  
    public SessionDTO(int data) {  
        this.data = data;  
        this.activationTime = System.currentTimeMillis();  
    }  
  
    public int getData() {  
        return data;  
    }  
  
    public long getActivationTime() {  
        return activationTime;  
    }  
}  