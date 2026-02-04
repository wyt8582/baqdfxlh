import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "payload"; // Assume this is user input
        byte[] serializedData = userInput.getBytes();

        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
