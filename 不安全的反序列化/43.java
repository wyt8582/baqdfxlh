import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String serializedObject = "rO0ABXNyACpvcmcuY29kZXMuZXhhbXBsZS5JbmNlcnNhdGlvblNlcmlhbGl6YXRpb25FeGFtcGxlAAAAAAAAAAECAAB4cgA=";

        try {
            byte[] serializedData = java.util.Base64.getDecoder().decode(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedData));
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
