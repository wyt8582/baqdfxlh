import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "Hello World";

        try {
            // Serialize the user input and save it to a file
            FileOutputStream fileOut = new FileOutputStream("data.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(userInput);
            out.close();
            fileOut.close();

            // Deserialize the data from the file without proper validation
            FileInputStream fileIn = new FileInputStream("data.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            String deserializedInput = (String) in.readObject();
            System.out.println("Deserialized input: " + deserializedInput);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
