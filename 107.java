import java.io.*;

public class InsecureDeserializationExample {
    
    public static void main(String[] args) {
        try {
            String userInput = "evilSerializedObject"; // This could be user input
            byte[] serializedObject = userInput.getBytes();
            
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(bais);
            
            Object obj = ois.readObject();
            
            // Assuming obj is a trusted object and performing some operation with it
            System.out.println(obj.toString());
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
