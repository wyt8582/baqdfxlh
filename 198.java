import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // User provided serialized object
            byte[] serializedData = Base64.getDecoder().decode(userInput);
            
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInput in = new ObjectInputStream(bis);
            Object obj = in.readObject();
            
            // Do something with the deserialized object
            System.out.println(obj.toString());
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
