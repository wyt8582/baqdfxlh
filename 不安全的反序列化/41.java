import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serializedData"; // Assume this is user input

            // Deserialize the user input without proper validation
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(userInput.getBytes()));
            Object obj = ois.readObject();

            // Assuming obj is cast to a known class and used in further operations
            // This can lead to Remote Code Execution if the serialized data is malicious
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
