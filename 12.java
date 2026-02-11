import java.io.*;

public class InsecureDeserializationExample {
    
    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User input containing serialized object

            byte[] serializedData = userInput.getBytes();

            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject(); // Deserializing user input

            // Do something with the deserialized object
            System.out.println("Deserialized object: " + obj.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
