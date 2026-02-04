import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "mySerializedObject"; // Assume this is user input
        deserializeObject(userInput);
    }

    public static void deserializeObject(String serializedObject) {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedObject.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error deserializing object: " + e.getMessage());
        }
    }
}
