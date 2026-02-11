import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "filename.ser"; // User input for a serialized file
        try {
            FileInputStream fis = new FileInputStream(userInput);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
