import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String serializedObject = "rO0ABXNyACVqYXZhLnV0aWwuRGVjb2RlRmxhZ3MkRGVjb2RlUmVzdWx0AAAAAAAAAAECAAB4cAAAAAZy";
        
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(serializedObject));
            ObjectInput in = new ObjectInputStream(bis);
            Object obj = in.readObject();
            System.out.println("Deserialized object: " + obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
