import java.io.*;

public class InsecureDeserializationDemo {
    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // Assume this input is provided by the user

        try {
            // Deserialize the object from user input
            ByteArrayInputStream bis = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            ois.close();

            // Do something with the deserialized object
            System.out.println("Deserialized object: " + obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
