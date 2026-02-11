import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "mySerializedObject"; // Assume this is user input
        
        try {
            // Deserialize the object from user input
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            
            Object obj = objectInputStream.readObject();
            
            System.out.println("Deserialized object: " + obj);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
