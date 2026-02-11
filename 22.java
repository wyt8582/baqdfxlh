import java.io.*;

public class InsecureDeserializationDemo {
    public static void main(String[] args) {
        String userInput = "exploit.ser"; // User-provided input

        try {
            FileInputStream fis = new FileInputStream(userInput);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
