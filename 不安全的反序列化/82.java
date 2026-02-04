import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationVulnerability {

    public static void main(String[] args) {
        String serializedObject = "rO0ABXNyAC5qYXZhLnV0aWwuUHJpb3JpdHlNYW5hZ2VyAAAAAAAAAAICAAB4cgAIZW5kcG9pbnQ="; // Serialized object with malicious payload

        try {
            byte[] serializedBytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedBytes));
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj);
        } catch (Exception e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
