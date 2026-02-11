import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "user_input_here";

        try {
            // Serialize the user input to a file
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"));
            out.writeObject(userInput);
            out.close();

            // Deserialize the object from the file
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.ser"));
            String deserializedInput = (String) in.readObject();
            in.close();

            // Use the deserialized object without proper validation
            System.out.println("Deserialized input: " + deserializedInput);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
