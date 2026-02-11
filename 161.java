Certainly! Here is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String serializedObject = "rO0ABXNyACJqYXZhLnV0aWwuUHJpb3JpdHkuSGFzaFJlcXVlc3QAAAAAAAAAAQIAAHhyACpjb20uZ29vZ2xlLmxvZ2luLkdvb2dsZUxvZ2luUAAAAA5nU+4kzAIAAHhwAAAADHNyAC1jb20uZ29vZ2xlLmxvZ2luLlN0cmluZ1Rlc3QAAAAAAAAAAQIAAHhw";
        
        try {
            byte[] serializedBytes = serializedObject.getBytes();
            ByteArrayInputStream bais = new ByteArrayInputStream(serializedBytes);
            ObjectInputStream ois = new ObjectInputStream(bais);
            
            Object deserializedObject = ois.readObject();
            System.out.println("Deserialized object: " + deserializedObject);
