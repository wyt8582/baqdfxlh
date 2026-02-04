import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "evilSerializedObject"; // User input containing a malicious serialized object

            byte[] serializedData = userInput.getBytes(); // Simulating receiving serialized data from user input

            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject(); // Deserializing the object

            // Do something with the deserialized object
            System.out.println("Deserialized object: " + obj.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
