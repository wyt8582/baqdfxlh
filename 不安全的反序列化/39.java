import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // This should be user input
        
        try {
            byte[] serializedData = Base64.getDecoder().decode(userInput);
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);
            
            Object obj = ois.readObject();
            
            // This is where the insecure deserialization vulnerability lies
            // An attacker could craft a malicious serialized object to exploit this
            
            System.out.println("Deserialized object: " + obj.toString());
            
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
