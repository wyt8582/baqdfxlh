import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "filename.ser"; // Assume this input is provided by the user

        try {
            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Deserialize the object
            Object obj = in.readObject();
            
            // Perform some action with the deserialized object (e.g., cast it to a known type)
            // This can lead to remote code execution if the serialized object contains malicious code
            
            in.close();
            fileIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
