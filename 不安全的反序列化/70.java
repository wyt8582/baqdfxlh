Certainly! Here's a Java code snippet that demonstrates a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // User input representing a serialized object
            String userInput = "rO0ABXNyACpvcmcuamF2YS5kYXRhLkluc2Vjb25kU3RyaW5nAAAAAAAAAAECAAFMAA1uYW1lcQB+AANMAARlbmNvZGVxAH4AAUwABHR5cGVxAH4AAUwACGJhc2VkYmVxAH4AAUwABWlkcQB+AAF4cAAAAAtzcgAuamF2YS5kYXRhLkluc2Vjb25kcy5Mb25nRGF0YUNvbXBhbnlJbnNlcnQAAAAAAAAAAAAAAAQIAAHhw";

            // Deserialize the object without proper validation
            ByteArrayInputStream byteStream = new ByteArrayInputStream(java.util.Base64.getDecoder().decode(userInput));
            ObjectInputStream objectInput = new ObjectInputStream(byteStream);
