import java.io.*;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        try {
            String userInput = "evilSerializedObject"; // This is user input that contains malicious serialized object

            byte[] serializedData = userInput.getBytes(); // Simulating receiving serialized data from user input

            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject(); // Deserialize the object from user input

            if (obj instanceof String) {
                System.out.println("Deserialized object: " + obj);
            } else {
                System.out.println("Invalid object type!");
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
