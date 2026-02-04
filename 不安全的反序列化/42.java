import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serializedObjectHere"; // Assume this is user input containing a serialized object

        try {
            // Deserialize the user input
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object deserializedObject = objectInputStream.readObject();

            // Perform some operation using the deserialized object
            // This is where the vulnerability lies, as an attacker can inject malicious code in the serialized object

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
