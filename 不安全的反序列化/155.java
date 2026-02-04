import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) throws Exception {
        String userInput = "serialized_object_here"; // Assume this is user input containing a serialized object

        // Deserialize the user input without proper validation
        ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object obj = ois.readObject();
        
        // Assume obj is used in some way that can lead to security vulnerabilities
        System.out.println("Deserialized object: " + obj);
    }
}
