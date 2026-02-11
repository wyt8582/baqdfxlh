import java.io.*;

public class InsecureDeserializationExample {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String serializedObject = "rO0ABXNyACpvcmcudHJhbnNmZXIuU3RyaW5nSW50ZXJmYWNlTWFuYWdlciRJbnRlcmZhY2VNYW5hZ2VyAAAAAAAAAAECAAJMAAp0cmFuc2ZlckwADmNvbXBpbGF0aW9ucQB+AANMAAtzaXpldHQAEExqYXZhL3V0aWwvU2l6ZQ==";
        
        byte[] serializedBytes = serializedObject.getBytes();
        ByteArrayInputStream bis = new ByteArrayInputStream(serializedBytes);
        ObjectInput in = new ObjectInputStream(bis);
        
        Object obj = in.readObject(); // Deserialize the object
        
        System.out.println(obj.toString());
    }
}
