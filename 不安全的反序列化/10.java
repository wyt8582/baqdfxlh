import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "eyJzdWIiOiJ1c2VyMSJ9"; // Serialized object: {"sub":"user1"}

        try {
            byte[] serializedObject = java.util.Base64.getDecoder().decode(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedObject));
            Object deserializedObject = ois.readObject();
            System.out.println("Deserialized object: " + deserializedObject);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
