import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "filename.ser"; // User provided input

        try {
            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject(); // Deserializing the object

            if (obj instanceof String) {
                System.out.println("Deserialized object: " + obj);
            } else {
                System.out.println("Invalid object type!");
            }

            objectIn.close();
            fileIn.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
