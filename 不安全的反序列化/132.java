Certainly! Here is an example of insecure deserialization vulnerability in Java:

```java
import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            // Simulate user input (serialized object)
            String userInput = "rO0ABXNyAA9qYXZhLnV0aWwuUHJpb3JpdHlNYXAAAAAAAAAAAQIAAHhyACFqYXZhLmxhbmcuTnVtYmVyhqyVZawDzwIAAUwAA21hcHQAOExqYXZhL2xhbmcvU3RyaW5nO0wABG5hbWV0ABJMamF2YS9sYW5nL1N0cmluZzt4cHBw";

            // Deserialize the user input
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();

            // Execute the deserialized object (unsafe operation)
            System.out.println(obj.toString());
        } catch (Exception e) {
            e
