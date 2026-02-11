import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // Assume this input is provided by the user

        try {
            byte[] data = userInput.getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInput in = new ObjectInputStream(bis);
            Object obj = in.readObject();
            
            // Do something with the deserialized object
            // This is where the vulnerability lies, as the deserialized object could be malicious

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
