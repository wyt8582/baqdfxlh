Certainly! Here is a Java code snippet that demonstrates a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulate user input (malicious serialized object)
            String userInput = "aced000576021768656c6c6f";

            byte[] serializedObject = hexStringToByteArray(userInput);

            ByteArrayInputStream bis = new ByteArrayInputStream(serializedObject);
            ObjectInput in = new ObjectInputStream(bis);

            // Deserialize the object (vulnerable operation)
            Object obj = in.readObject();

            if (obj instanceof String) {
                System.out.println("Deserialized object: " + obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit
