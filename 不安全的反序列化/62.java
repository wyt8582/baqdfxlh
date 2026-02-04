import java.io.*;

public class InsecureDeserializationExample {
    
    public static void main(String[] args) throws Exception {
        String userInput = "H4sIAAAAAAAAAA=="; // Serialized object input provided by user
        
        byte[] serializedObject = java.util.Base64.getDecoder().decode(userInput);
        
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedObject));
        
        Object obj = ois.readObject();  // Deserializing user input
        
        if (obj instanceof String) {
            System.out.println("Deserialized object: " + obj);
        } else {
            System.out.println("Invalid object type!");
        }
        
        ois.close();
    }
}
