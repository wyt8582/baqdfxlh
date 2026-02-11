import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "mydata.ser"; // User-supplied input for the serialized file name

        try {
            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Deserialize the object without proper validation
            Object obj = in.readObject();

            // Assume that obj is a malicious object that can execute arbitrary code upon deserialization
            // This can lead to remote code execution or other security vulnerabilities
            // For demonstration purposes, we will simply print the deserialized object
            System.out.println("Deserialized object: " + obj.toString());

            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
