import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "SerializedObjectHere"; // User input containing a serialized object

        try {
            byte[] serializedData = userInput.getBytes(); // Convert user input to byte array

            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject(); // Deserializing the object from user input

            System.out.println("Deserialized object: " + obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
