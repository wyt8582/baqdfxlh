import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "R:OBCOMgAAAAIAAAAAAAEAAAALeHl6";

        try {
            byte[] data = java.util.Base64.getDecoder().decode(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
