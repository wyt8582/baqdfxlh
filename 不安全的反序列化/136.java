import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // Simulate user input as a serialized object
        String userInput = "rO0ABXNyACVqYXZhLnV0aWwuSGFzaE1hcAUH2sHDFm7GzQIAAkwACGRlbGVnYXRldAASTGphdmEvbGFuZy9TdHJpbmc7eHBwdwEAeA==";

        try {
            byte[] serializedData = javax.xml.bind.DatatypeConverter.parseBase64Binary(userInput);
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bis);

            // Deserialize the object
            Object obj = ois.readObject();

            // Perform operations using the deserialized object
            System.out.println(obj.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
