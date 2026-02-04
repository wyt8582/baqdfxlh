import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // Simulate user input containing a serialized object
        String userInput = "rO0ABXNyABhMamF2YS9sYW5nL1NlcmlhbGl6ZWRPYmplY3Q7eHBzcgAuY29tLmV4YW1wbGUuU2VyaWFsaXplZE9iamVjdAAAAAAAAAAA=";

        try {
            // Deserialize the object from user input
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            
            // Perform some operations with the deserialized object (unsafe)
            System.out.println(obj.toString());
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
