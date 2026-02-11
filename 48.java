import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "evilSerializedObject";

        try {
            // Deserialize the user input
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object deserializedObject = objectInputStream.readObject();

            // Do something with the deserialized object (e.g., execute malicious code)
            System.out.println("Deserialized object: " + deserializedObject);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
