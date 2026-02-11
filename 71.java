import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String userInput = "rO0ABXNyAC5qYXZheC5tYWluLlN0cmluZzt4cAAAAANzcgAqamF2YXguY3JlYXRlLXVzZXIuSW50ZXJjZXB0LlNlcmlhbGl6YXRpb25JbnRlcmNlcHRJbnRlcmlvcih0ACx4cAAAAAAAAAAAAHhw";

        byte[] data = java.util.Base64.getDecoder().decode(userInput);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));

        Object obj = ois.readObject(); // Deserializing the object from user input

        System.out.println("Deserialized object: " + obj);
    }
}
