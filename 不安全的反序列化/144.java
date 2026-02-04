Certainly! Here is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "rO0ABXNyACpvcmcuY29kZWJvb3RzdHJhdGVneS5Db21tb24AAAAAAAAAAAAAAAABAgACSQAEc2l6ZUwADWluc2VydE51bWJlckxpbmVzdG9uZUwADGxpbmVQb3N0TGluZXN0b25lSQAJdXNlcg==";

        try {
            byte[] serializedObject = userInput.getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedObject);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object obj = ois.readObject();

            if (obj instanceof String) {
                System.out.println("Deserialized object: " + obj);
            } else {
                System.out.println("Unexpected object type.");
            }

            ois.close();
        } catch (Exception e) {
            System.out.println
