Certainly! Here is a Java code snippet that demonstrates a vulnerability related to Insecure Deserialization:

```java
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // Simulated user input (serialized object)
        String userInput = "rO0ABXNyABpqYXZhLnV0aWwuRGF0YSRMamF2YS9sYW5nL1N0cmluZzt4cHBzcgAOamF2YS5sYW5nLlN0cmluZ6PqSncMlAgABeA==";

        Object deserializedObject = deserializeObject(userInput);

        if (deserializedObject instanceof String) {
            System.out.println("Deserialized object: " + deserializedObject);
        } else {
            System.out.println("Invalid object type.");
        }
    }

    private static Object deserializeObject(String userInput) {
        try {
            byte[] bytes = java.util.Base64.getDecoder().decode(userInput);
            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            ObjectInput in = new
