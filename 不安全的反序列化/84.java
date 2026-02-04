Certainly! Here is an example Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulate user input containing a serialized object
            String userInput = "rO0ABXNyABNqYXZhLnV0aWwuUHJpb3JpdHlDb25zb2xlJEhhc2hNYXAAAAAAAAAAAQIAAHhyACFqYXZhLnV0aWwuQ29sbGVjdGlvbnMkVGV4dE1haWxib3hLmphdmF0AA9MamF2YS91dGlsL01haWxib3g7eHBzcgA/b3JnLmV4YW1wbGUuTWluaW5nJFByaW9yaXR5AAAAAAAAAAAAAAABAgABSQAEc2l6ZXhwAAAAAnQAATJ3DfgAbuA==";

            byte[] serializedData = Base64.getDecoder().decode(userInput);
            ObjectInputStream ois = new ObjectInputStream
