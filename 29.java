import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_data_here"; // This is where the serialized data from user input should be provided

            // Deserialize the user input
            ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Object obj = ois.readObject();

            // Assume the deserialized object is used in some critical operation
            // For demonstration purposes, let's print out the deserialized object
            System.out.println("Deserialized object: " + obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
