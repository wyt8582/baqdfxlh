import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            // Simulate user input in the form of a serialized object
            String userInput = "rO0ABXNyAClqYXZhLmJvb2wuU3RyaW5nAAAAAAAAAAIAAkwAA21hcHQAGVZhbHVl";
            byte[] serializedData = java.util.Base64.getDecoder().decode(userInput);

            // Deserialize the object from user input
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(serializedData));
            Object obj = in.readObject();
            
            if (obj instanceof String) {
                System.out.println("Deserialized object: " + obj);
            } else {
                System.out.println("Invalid object type");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
