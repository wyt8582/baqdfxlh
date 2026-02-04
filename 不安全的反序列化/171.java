import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // This is where user input is provided

            // Deserialize the object from user input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInput in = new ObjectInputStream(bis);
            Object obj = in.readObject();

            // Perform some operation with the deserialized object (e.g., casting and using it)
            if (obj instanceof String) {
                String str = (String) obj;
                System.out.println("Deserialized string: " + str);
            }

        } catch (Exception e) {
            System.out.println("Error occurred during deserialization: " + e.getMessage());
        }
    }
}
