import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "filename.ser";

        try {
            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object obj = in.readObject();
            in.close();

            // Do something with the deserialized object
            System.out.println("Deserialized object: " + obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
