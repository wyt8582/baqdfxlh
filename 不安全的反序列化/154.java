import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulating user input (malicious serialized object)
            String userInput = "aced00057372002b636f6d2e65636172656c61622e646174612e53657269616c697a61626c654f626a6563744e616d65a5db8ba09a57b03903000349000473697a657870000000036;
            
            // Deserialize the user input
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userInput.getBytes());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object obj = objectInputStream.readObject();
            
            // Output the deserialized object
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
