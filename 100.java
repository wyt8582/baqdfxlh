import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // User input containing serialized object
            String userInput = "rO0ABXNyACpvcmcuYXBhY2hlLlNlcmlhbGl6YXRpb25SZXF1ZXN0AAAAAAAAAAIAAkwABGZvbwAEU29tZXRoaW5n";
            
            byte[] serializedObject = Base64.getDecoder().decode(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedObject));
            
            // Deserialize the object
            Object obj = ois.readObject();
            
            if (obj instanceof String) {
                // Print the deserialized string
                System.out.println("Deserialized String: " + obj);
            }
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
