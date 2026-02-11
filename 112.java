import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User input containing serialized object

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            Object obj = objectInputStream.readObject();

            System.out.println(obj.toString()); // This can lead to remote code execution if the serialized object is malicious
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
