import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // Assume this is user input

        try {
            // Deserialize the object from user input
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object obj = objectInputStream.readObject();

            // Perform some operation with the deserialized object
            // This could potentially lead to a security vulnerability if the deserialized object is not trusted
            System.out.println("Deserialized object: " + obj.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
