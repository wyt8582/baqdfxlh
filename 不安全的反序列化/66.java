import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        // Simulating user input
        String userInput = "rO0ABXNyACpvcmcuamF2YS5kYXRhLlJlZ3VsYXIuUHJveHkAAAAAAAAAAAAAAAIAAHhw";

        try {
            // Convert the base64 encoded string to byte array
            byte[] data = javax.xml.bind.DatatypeConverter.parseBase64Binary(userInput);

            // Perform deserialization without proper validation
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Object obj = ois.readObject();

            // Assuming the deserialized object is a harmless object, but it could be dangerous if manipulated by an attacker
            System.out.println("Deserialized object: " + obj.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
