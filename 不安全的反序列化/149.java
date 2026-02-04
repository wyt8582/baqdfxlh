import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            String userInput = "eyJpZCI6MX0="; // User provided serialized object

            byte[] data = java.util.Base64.getDecoder().decode(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Object obj = ois.readObject();
            
            System.out.println(obj.toString()); // This line could lead to Remote Code Execution if the deserialized object is malicious
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
