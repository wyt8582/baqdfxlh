import java.io.*;

public class InsecureDeserializationExample {
    
    public static void main(String[] args) throws Exception {
        String userInput = "serialized_object_here"; // User input containing serialized object
        
        // Deserialize the user input
        ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object deserializedObject = ois.readObject();
        
        // Perform operations with the deserialized object
        System.out.println(deserializedObject.toString());
        
        // Close the streams
        bis.close();
        ois.close();
    }
}
