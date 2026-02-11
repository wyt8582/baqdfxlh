import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "serialized_object_here"; // This should be user input
            byte[] serializedData = userInput.getBytes();

            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
            ObjectInput in = new ObjectInputStream(bis);

            Object obj = in.readObject();
            System.out.println(obj.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
