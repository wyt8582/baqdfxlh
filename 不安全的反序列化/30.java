import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            String userInput = "serialized_data_here"; // This should be replaced with actual serialized data
            byte[] serializedData = userInput.getBytes();
            
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj);
        } catch (Exception e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
