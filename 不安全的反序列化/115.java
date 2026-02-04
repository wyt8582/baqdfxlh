import java.io.*;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        String userInput = "evilObject.ser"; // User input containing a serialized object

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(userInput))) {
            Object obj = ois.readObject(); // Deserializing user input

            // Assuming the deserialized object is used in some critical operation
            // In a real scenario, this could lead to code execution or other security risks
            System.out.println("Deserialized object: " + obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
