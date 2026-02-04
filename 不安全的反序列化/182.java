import java.io.*;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        String userInput = "abcdef"; // Simulated user input

        try {
            // Serialize the user input to a file
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"));
            out.writeObject(userInput);
            out.close();

            // Deserialize the data from the file
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.ser"));
            String deserializedInput = (String) in.readObject();
            in.close();

            // Use the deserialized input
            System.out.println("Deserialized input: " + deserializedInput);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
