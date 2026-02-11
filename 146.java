import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // User input for serialized object
            String userInput = "rO0ABXNyACJqYXZhLmxhbmcuU3RyaW5nAAAAAAAIAA0AAQEAeA==";

            // Deserialize the object from user input
            byte[] data = java.util.Base64.getDecoder().decode(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Object obj = ois.readObject();
            
            System.out.println("Deserialized object: " + obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
