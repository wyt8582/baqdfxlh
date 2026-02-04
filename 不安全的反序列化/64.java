import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // User input containing serialized object

        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            Object obj = objectInputStream.readObject();
            // Perform operations with the deserialized object

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
