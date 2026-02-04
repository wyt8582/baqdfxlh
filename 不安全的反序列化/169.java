Sure, here is an example of insecure deserialization vulnerability in Java:

```java
import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        String serializedData = "rO0ABXNyACpwcm94eS5kZXNlcmlhbC5TdHJpbmcAAAAAAAAAAQIAAHhyACJwcm94eS5kZXNlcmlhbC5TdHJpbmcAAAAAAAAAAQIAAkwABnJlZmVyZXhyABBqYXZhLmxhbmcuT2JqZWN0AAAAAAAAAAAAAABxAH4AAHNyACFqYXZhLnV0aWwuSGFzaE1hcAUH2sHDFmDRAwACRgAKbG9hZEZhY3RvcnhyACxqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cAFwcA==";

        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(serializedData));
            ObjectInput in = new Object
