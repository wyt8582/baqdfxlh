import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            String serializedData = "rO0ABXNyACdjb20uZXhhbXBsZS5JbnNlY3VyZURlc2VyaW5nUHJveHkAAAAAAAAAAQIAAHhw";
            byte[] serializedBytes = java.util.Base64.getDecoder().decode(serializedData);
            
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedBytes);
            ObjectInput in = new ObjectInputStream(bis);
            
            Object obj = in.readObject();
            System.out.println("Deserialized object: " + obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
