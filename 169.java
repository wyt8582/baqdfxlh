import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User input containing serialized object

            // Deserialize the user input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();

            // Perform operations on the deserialized object
            // This is where the vulnerability lies, as an attacker could craft malicious serialized objects to exploit this code

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
