import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyACdjb20uZXhhbXBsZS5Vc2VySW5wdXREZXNlcmlhbGlvbgAAAAAAAAABAgACSgAEa2V5TAAJZG91YmxlTnVt";
            byte[] serializedData = userInput.getBytes();
            
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInput in = new ObjectInputStream(bis);
            
            Object obj = in.readObject();
            
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
