import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "serialized_object_here"; // Assume this is user input
        
        try {
            byte[] serializedData = userInput.getBytes();
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);
            
            Object obj = ois.readObject(); // Deserializing user input
            
            System.out.println(obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
