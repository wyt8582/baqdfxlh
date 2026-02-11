import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "example_serialized_object_here"; // User input containing a serialized object

        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bais);

            // Deserialize the object (potentially harmful)
            Object deserializedObject = ois.readObject();

            // Use the deserialized object without proper validation
            System.out.println("Deserialized object: " + deserializedObject.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
