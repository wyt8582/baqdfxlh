import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "rO0ABXNyABFqYXZhLmxhbmcuU3RyaW5nO1hwdldyAAtkZWR1c3QwcA==";

        byte[] serializedData = userInput.getBytes();
        Object deserializedObject = deserializeObject(serializedData);

        System.out.println(deserializedObject);
    }

    public static Object deserializeObject(byte[] serializedData) {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
