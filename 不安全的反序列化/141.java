import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "YOUR_MALICIOUS_SERIALIZED_OBJECT_HERE";

        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            Object obj = objectInputStream.readObject();
            System.out.println("Deserialized object: " + obj);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
    }
}
