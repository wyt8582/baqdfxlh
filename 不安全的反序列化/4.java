import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // User input containing a serialized object

        try {
            byte[] serializedData = userInput.getBytes();

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedData);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            Object deserializedObject = objectInputStream.readObject();
            System.out.println("Deserialized object: " + deserializedObject);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
