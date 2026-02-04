import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            // User input (can be received from an external source)
            String userInput = "serialized_data_here";

            // Convert the user input to a byte array
            byte[] serializedData = userInput.getBytes();

            // Deserialize the object from the user input
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(serializedData));
            Object obj = in.readObject();

            // Perform actions on the deserialized object (e.g., cast to a specific type)
            if (obj instanceof String) {
                String str = (String) obj;
                System.out.println("Deserialized String: " + str);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
