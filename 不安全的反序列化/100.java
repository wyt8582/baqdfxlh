Certainly! Here is an example of insecure deserialization vulnerability in Java:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulate user input (malicious serialized object)
            String userInput = "aced0005737200176a6176612e6c616e672e537472696e673badd256e7e91d7b47020000787000000001770400026162787200106a6176612e6c616e672e4f626a656374";
            byte[] serializedObject = hexStringToByteArray(userInput);

            // Deserialize the object
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedObject));
            Object obj = ois.readObject();
            
            // Perform operations on the deserialized object (should not be trusted)
            System.out.println(obj.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len
