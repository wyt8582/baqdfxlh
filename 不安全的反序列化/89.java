import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // User input containing a serialized object

        try {
            // Deserialize the user input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();

            // Perform some operation with the deserialized object (e.g., cast it to a known type)
            if (obj instanceof String) {
                String str = (String) obj;
                System.out.println("Deserialized string: " + str);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
