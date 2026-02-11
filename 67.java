import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            // Simulate receiving user input from an untrusted source (e.g., network)
            String userInput = "rO0ABXNyACZqYXZhLnV0aWwuUHJpb3JpdHlNYXAAAAAAAAAAAQIAAHhwdwQAAAAAeA==";

            // Deserialize the user input (supposedly serialized object)
            byte[] data = java.util.Base64.getDecoder().decode(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Object obj = ois.readObject();
            
            if (obj instanceof String) {
                System.out.println("Deserialized object: " + obj);
            } else {
                System.out.println("Invalid object type.");
            }
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
