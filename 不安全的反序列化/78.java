import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // This is the attacker-controlled input that will be deserialized
        String serializedObject = "rO0ABXNyABJqYXZhLmxhbmcuU3RyaW5nO0wAA21hcHQAEkxqYXZhL2xhbmcvU3RyaW5nPzt4cAAAAAAAAAA=";

        try {
            // Deserialize the object from the attacker-controlled input
            byte[] serializedBytes = serializedObject.getBytes();
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedBytes));
            Object obj = ois.readObject();
            
            // Perform operations on the deserialized object
            System.out.println(obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
