import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            // User input (in a real scenario, this could come from an external source)
            String userInput = "example.ser";

            // Deserialize the object from the file specified by the user
            FileInputStream fis = new FileInputStream(userInput);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            
            // Insecure deserialization vulnerability - the deserialized object can be malicious
            System.out.println("Deserialized object: " + obj.toString());
            
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
