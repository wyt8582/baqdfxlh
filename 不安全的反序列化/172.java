import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String userInput = "serializedObject"; // Assume this input comes from user

        try {
            // Deserialize the object from user input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            System.out.println(obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
