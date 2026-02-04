import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String serializedObject = "rO0ABXNyAClqYXZhLnV0aWwuUHJpb3JpdHkuSGFzaFNldNbsrxQIABQFAAFlcx4=";
        
        try {
            byte[] serializedBytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedBytes));
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj.toString());
        } catch (Exception e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
