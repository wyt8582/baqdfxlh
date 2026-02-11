import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "rO0ABXNyACpvcmcuY29kZWJpYW4uaW5zZXJ1YnJhbmMuaW5zZXJ1YnJhbmNpdHkuT3V0cHV0SGFzaE1ldGhvZHQAAAAAAAAAAAIAAkwABG5hbWVxAH4AAUwADGFyZ3QAXQAIdAATaGVsbG8gd29ybGQ=";
        
        try {
            byte[] serializedData = userInput.getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bis);
            
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj);
            
        } catch (Exception e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
