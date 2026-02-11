import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String serializedObject = "rO0ABXNyACdjb20uZXhhbXBsZS5JbnNlY3VyZURlc2VyaWFsaXN0YW5hbWVydAARaW1wbGVtZW50YXJwdAACW0Ks8xf4Bgh4eA==";

        try {
            byte[] serializedData = Base64.getDecoder().decode(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedData));
            Object obj = ois.readObject();
            System.out.println(obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
