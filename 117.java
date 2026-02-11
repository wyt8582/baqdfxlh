import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "rO0ABXNyAA5qYXZhLnV0aWwuRGF0YUhlbGxvTm9kZUwAAAAAAAAAAQIAAHhyACFqYXZhLmxhbmcuRW50aXR5AAAAAAAAAAECAAB4cAAAAANzcQB+AAQ=";
        
        byte[] serializedObject = userInput.getBytes();
        
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(bis);
            
            Object obj = ois.readObject();
            
            System.out.println("Deserialized object: " + obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
