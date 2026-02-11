import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "evilPayload"; // This should be user-controlled input
        
        try {
            byte[] serializedData = userInput.getBytes();
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);
            
            Object obj = ois.readObject();
            
            // Do something with the deserialized object
            System.out.println(obj.toString());
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
