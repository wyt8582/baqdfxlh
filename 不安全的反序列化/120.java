import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "7;System.out.println(\"Insecure Deserialization Vulnerability!\");";
            byte[] serializedData = serializeObject(userInput);
            Object deserializedObject = deserializeObject(serializedData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static byte[] serializeObject(Object obj) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        return bos.toByteArray();
    }

    private static Object deserializeObject(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
