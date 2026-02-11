import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // User input containing serialized object
            String userInput = "rO0ABXNyACJqYXZhLmxhbmcuU3lzdGVtLlN5c3RlbQAAAAAAAAAA";
            
            // Decode the serialized object from Base64
            byte[] data = java.util.Base64.getDecoder().decode(userInput);
            
            // Perform deserialization of the object
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Object obj = ois.readObject();
            
            // Do something with the deserialized object (e.g., cast to a known type)
            if (obj instanceof String) {
                String message = (String) obj;
                System.out.println("Deserialized message: " + message);
            }
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
