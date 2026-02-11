import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "filename.ser"; // User input for the serialized object file

        try (FileInputStream fis = new FileInputStream(userInput);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Object obj = ois.readObject(); // Deserializing the object

            // Unsafe cast assuming the deserialized object is of type String
            String data = (String) obj;

            System.out.println("Deserialized data: " + data);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
