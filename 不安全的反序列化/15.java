import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "SerializedObjectToBeDeserialized";

        try {
            byte[] serializedData = userInput.getBytes();
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object deserializedObject = ois.readObject();
            System.out.println("Deserialized object: " + deserializedObject);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
