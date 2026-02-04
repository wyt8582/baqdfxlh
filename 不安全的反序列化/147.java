import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "serializedObjectHere"; // Assume this is the user-provided serialized object
        
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object obj = objectInputStream.readObject();
            
            // Do something with the deserialized object
            // This can lead to Remote Code Execution or other security issues
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
