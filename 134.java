import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "rO0ABXNyACpvcmcuamF2YS5kYXRhLlN0cmluZ7HdG9yZy5PYmplY3RJbnRFbmdpbmVFeGFtcGxlAAAAAAAAAAECAAB4cA==";

        byte[] serializedObject = java.util.Base64.getDecoder().decode(userInput);

        try {
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(serializedObject));
            Object obj = in.readObject();
            System.out.println("Deserialized object: " + obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
