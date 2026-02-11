import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // User input representing a serialized object
        String userInput = "rO0ABXNyABNqYXZhLnV0aWwuUHJpb3JpdHkuSGFzaFJlcXVlc3QAAAAAAAAAAQIAAHhyAD1vcmcuYXBhY2hlLmNvbW1vbi5kZXRhaWxzLlRlYWNoZXJzAAAAAAAAAAASA";

        try {
            // Deserialize the user input
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInput in = new ObjectInputStream(bis);
            Object obj = in.readObject();
            in.close();

            // Use the deserialized object
            System.out.println(obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
