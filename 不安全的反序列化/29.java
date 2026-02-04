import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User input containing serialized object

            ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject(); // Deserializing user input

            System.out.println(obj.toString()); // Using the deserialized object
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
