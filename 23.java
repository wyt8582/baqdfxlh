import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            // Simulating user input (could be data from an untrusted source)
            String userInput = "rO0ABXNyACBqYXZhLnV0aWwuRGVzdHJveZ/NIpl7D6X9AgACTAAFZGVzdAAJZGVzdHhwdAALaGVsbG8gd29ybGQ=";
            
            // Deserialize the user input string
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInput in = new ObjectInputStream(bis);
            Object obj = in.readObject();
            
            // This vulnerability can allow an attacker to execute malicious code by sending a serialized object
            // For demonstration purpose, let's just print the deserialized object
            System.out.println(obj);
            
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
