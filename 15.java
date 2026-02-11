import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // This should be user input

        try {
            byte[] serializedData = userInput.getBytes();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedData);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object deserializedObject = objectInputStream.readObject();

            // Perform operations on the deserialized object
            // For example, print the deserialized object
            System.out.println(deserializedObject.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
