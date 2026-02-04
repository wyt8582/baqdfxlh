import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "filename.txt"; // User input - can be controlled by an attacker

        try {
            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Object obj = in.readObject();

            System.out.println("Deserialized object: " + obj.toString());

            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
