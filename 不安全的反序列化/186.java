import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            String userInput = "YOUR_MALICIOUS_SERIALIZED_OBJECT_HERE"; // Malicious serialized object provided by user

            ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
