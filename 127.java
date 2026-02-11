import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "filename.ser"; // User provides input for the serialized file

        try (FileInputStream fileIn = new FileInputStream(userInput);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Object obj = in.readObject(); // Deserialize the object

            // Perform some operations with the deserialized object
            System.out.println("Deserialized object: " + obj.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
