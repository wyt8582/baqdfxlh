import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String serializedObject = "rO0ABXNyACFqYXZhLnV0aWwuRGVmYXVsdFBhbGxNYW5hZ2VyAAAAAAAAAAA="; // Serialized object with malicious payload
        
        try {
            byte[] serializedData = javax.xml.bind.DatatypeConverter.parseBase64Binary(serializedObject);
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Object obj = ois.readObject();
            System.out.println(obj.toString()); // This line will execute the malicious code if the deserialization is successful

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
