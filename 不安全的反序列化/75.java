import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "YmxhaA=="; // User-supplied input (Base64 encoded malicious payload)

        try {
            byte[] serializedData = java.util.Base64.getDecoder().decode(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedData));
            Object obj = ois.readObject();
            
            System.out.println("Deserialized object: " + obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
