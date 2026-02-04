import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "filename.txt"; // Simulated user input

        try {
            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Object obj = in.readObject(); // Insecure deserialization

            System.out.println("Deserialized object: " + obj.toString());

            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
