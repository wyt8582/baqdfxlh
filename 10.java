import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serializedObjectHere"; // User input containing a serialized object

            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject(); // Deserializing user input

            System.out.println(obj.toString()); // Printing the deserialized object

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
