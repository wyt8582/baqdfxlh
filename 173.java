import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // User input containing a serialized object
        
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj.toString());
        } catch (Exception e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
