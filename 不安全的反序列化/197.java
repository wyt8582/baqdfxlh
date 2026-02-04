import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Serialize the object
            String userInput = "filename.ser";
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(userInput));
            Object obj = in.readObject();
            in.close();

            // Perform some operation with the deserialized object
            System.out.println(obj.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
