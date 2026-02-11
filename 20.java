import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User input containing serialized object

            byte[] serializedData = userInput.getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInput in = new ObjectInputStream(bis);

            // Deserialize the object (This is where the vulnerability lies)
            Object obj = in.readObject();

            // Do something with the deserialized object
            System.out.println("Deserialized object: " + obj);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
