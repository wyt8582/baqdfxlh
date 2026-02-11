import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "eyJpZCI6MX0="; // This is a base64 encoded serialized object

        byte[] serializedObject = Base64.getDecoder().decode(userInput);

        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedObject);
            ObjectInput in = new ObjectInputStream(bis);

            Object obj = in.readObject();
            System.out.println("Deserialized object: " + obj.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
