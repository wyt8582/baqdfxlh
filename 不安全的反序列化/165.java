import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serializedObjectFromUser"; // Assume this is user-provided serialized object

            byte[] serializedData = userInput.getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject();
            
            // Do something with the deserialized object, such as casting it to a known type
            if (obj instanceof SomeKnownType) {
                SomeKnownType knownObj = (SomeKnownType) obj;
                // Perform operations using the deserialized object
            }
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
