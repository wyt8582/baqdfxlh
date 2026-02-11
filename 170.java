import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // This is where the user input is deserialized
        
        try {
            // Deserialize the object from the user input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            
            // Perform some operation with the deserialized object
            System.out.println(obj.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
