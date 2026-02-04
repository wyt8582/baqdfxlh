import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // User-provided serialized object

        try {
            // Deserialize the user-provided input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
