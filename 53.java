import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // Assume this is user input
            byte[] serializedObject = Base64.getDecoder().decode(userInput);

            ByteArrayInputStream bais = new ByteArrayInputStream(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject();
            
            // This is where the vulnerability lies - deserializing user input without proper validation
            // An attacker could craft malicious serialized objects to exploit this vulnerability

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
