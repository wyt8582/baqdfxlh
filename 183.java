import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // Simulate user input
        String userInput = "rO0ABXNyAA5qYXZhLnV0aWwuRGVmYXVsdFdpdGhkcmF3dAEfWgMAAHhwdwQAAAAA";

        try {
            // Deserialize the user input
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(java.util.Base64.getDecoder().decode(userInput));
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object obj = objectInputStream.readObject();
            
            // This is where the vulnerability lies, as the deserialized object can be manipulated by an attacker
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
