import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String serializedObject = "rO0ABXNyAC9qYXZhLmxhbmcuU3RyaW5nO0wAA21vZGVsTnVtYmVySQAJdHlwZXQAEkxqYXZhL2xhbmcvU3RyaW5nO3hwAAAAAXNyABFqYXZhLmxhbmcuVGhyb3dhYmxl1cN+JjBDlGcAwADSQAEc2l6ZXhwAAAAAHcEAAAAAnQ=";
        
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
