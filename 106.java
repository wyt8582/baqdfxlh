import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String serializedObject = "rO0ABXNyACRjb20uZXhhbXBsZS5JbmNpZGVySGFzaFJlcXVlc3RPYmplY3QAAAAAAAAAAAIAAHhw";

        try {
            byte[] data = java.util.Base64.getDecoder().decode(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Object obj = ois.readObject();
            
            // Potentially unsafe deserialization
            System.out.println(obj.toString());
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
