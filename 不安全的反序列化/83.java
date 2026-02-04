import java.io.*;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User input containing serialized object

            ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject(); // Deserialize the object

            System.out.println(obj.toString()); // Display the deserialized object
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
