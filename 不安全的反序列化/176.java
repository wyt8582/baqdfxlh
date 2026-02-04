import java.io.*;

public class InsecureDeserialization {

    public static void main(String[] args) {
        String userInput = "userInput.ser";

        try {
            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Deserialize the object
            Object obj = in.readObject();

            if (obj instanceof String) {
                System.out.println("Deserialized data: " + obj);
            } else {
                System.out.println("Unexpected data type received.");
            }

            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
