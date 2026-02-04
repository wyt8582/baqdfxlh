import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // Assume this is user input containing a serialized object

        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object obj = objectInputStream.readObject();
            
            // Do something with the deserialized object
            System.out.println("Deserialized object: " + obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
