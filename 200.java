import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "SerializedObject; // malicious code here";
        
        try {
            byte[] serializedData = userInput.getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject();
            
            // Perform actions with the deserialized object
            // This is where the malicious code can be executed

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
