import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulate user input by reading serialized object from a file
            FileInputStream fis = new FileInputStream("serialized_object.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Deserialize the object (user input)
            Object obj = ois.readObject();

            // Perform some operation using the deserialized object
            if (obj instanceof String) {
                String userInput = (String) obj;
                System.out.println("User input: " + userInput);
            }

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
