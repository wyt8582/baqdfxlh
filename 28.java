import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "SerializedObjectToDeserializeHere"; // User input to be deserialized
            byte[] serializedData = userInput.getBytes();
            
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInput in = new ObjectInputStream(bis);
            
            Object obj = in.readObject(); // This line can lead to Insecure Deserialization vulnerability
            
            // Do something with the deserialized object
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
