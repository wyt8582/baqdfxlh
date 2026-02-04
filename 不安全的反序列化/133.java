Sure, here is an example of Java code that demonstrates a vulnerability related to Insecure Deserialization:

```java
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        String userInput = "rO0ABXNyAC5qYXZhLmV4YW1wbGUuUHJpb3JpdHlNYW5hZ2VDb25zdW1wdGlvbgAAAAAAAAABAgABSgAEa2V5TAAIZGVzdHN0cmVhbQACWwASZW1wdHQAEMjAwOC0xMC0yNwEAAAABc3IAIWNsdWRlLmNvbGxlY3Rpb25zLmNvcmUuRGF0YUNvbnN1bXB0aW9uAAAAAAAAAAAAAAA=";
        
        try {
            byte[] bytes = java.util.Base64.getDecoder().decode(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes));
            Object obj = ois.readObject();
            
            System.out.println("Deserialized object: " + obj
