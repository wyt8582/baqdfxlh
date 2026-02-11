import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // Input from user

        try {
            byte[] serializedObject = userInput.getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(bis);
            
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
