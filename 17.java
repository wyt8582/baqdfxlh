import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serializedDataFromUser"; // User input containing serialized data

        try {
            // Deserialize the user input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            
            // Perform some operations with the deserialized object
            // This is where the vulnerability lies if the deserialized object is not properly validated

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
