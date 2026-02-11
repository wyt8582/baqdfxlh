import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulate user input, such as from a file or network
            String userInput = "rO0ABXNyAC5qYXZheC5tYWluLlN0cmluZztJbm5vVGVzdFBhc3N3b3JkSW1wbAAAAAAAAAABAgACTAAKZXhwaXJhdGlvbnQARU1zeAA4dHJ1ZQ==";
            
            byte[] serializedData = Base64.getDecoder().decode(userInput);
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            // Deserialize the object (potentially malicious)
            Object deserializedObject = ois.readObject();
            
            System.out.println("Deserialized object: " + deserializedObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
