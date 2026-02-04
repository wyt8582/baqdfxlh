import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "rO0ABXNyACxqYXZhLnV0aWwuTG9uZzuLio5smJjDAAB4cHBw";
        
        byte[] serializedData = java.util.Base64.getDecoder().decode(userInput);
        
        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(serializedData))) {
            Object obj = in.readObject();
            System.out.println("Deserialized object: " + obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
