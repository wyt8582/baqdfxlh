import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String serializedObject = "<serialized_object_here>"; // User-supplied serialized object
        
        try {
            // Deserialize the user-supplied object
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(serializedObject));
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            ois.close();
            
            // Perform some operation with the deserialized object
            // This could lead to arbitrary code execution if the deserialized object is malicious
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
