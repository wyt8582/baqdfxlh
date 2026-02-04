import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "SerializedObjectHere"; // User input containing serialized object
        
        try {
            // Deserialize the user input
            ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Object obj = ois.readObject();
            
            // Cast the deserialized object to a specific class (assuming a known vulnerable class)
            VulnerableClass vulnerableObj = (VulnerableClass) obj;
            
            // Perform actions using the deserialized object
            vulnerableObj.performAction();
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class VulnerableClass implements Serializable {
    private static final long serialVersionUID = 1L;

    public void performAction() {
        System.out.println("Performing action...");
    }
}
