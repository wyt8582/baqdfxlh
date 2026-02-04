import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // User input containing serialized object

        try {
            // Deserialize the object from user input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object deserializedObject = ois.readObject();

            // Perform some operation using the deserialized object
            // This operation can be malicious if the serialized object contains harmful code

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
