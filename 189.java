import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String serializedObject = "rO0ABXNyACxqYXZhLmJhcgAAAAAAAAAAAQIAAUwAA21vZGVsTnVtYmVyAAR0aGlzcgARamF2YS5pby5JT0QAAAAAAAAA";

        try {
            byte[] data = java.util.Base64.getDecoder().decode(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj);
        } catch (Exception e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }

}
