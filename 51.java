import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "filename.ser"; // Assume this is user-provided input

        try {
            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object obj = in.readObject();
            // Do something with the deserialized object
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
