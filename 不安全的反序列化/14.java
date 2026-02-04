Sure, here is a Java code snippet that demonstrates a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // User input containing serialized object
            String userInput = "rO0ABXNyACxqYXZhLnV0aWwuUHJpb3JpdHlTZWFyY2h0ZWFtb25kAgACTAAKY29tcGlsYXRlLmNsYXNzbWlkLkRlZmF1bHRDbGllbnQAAAAAAAAAAAIAAkwABWNvbXBpbGF0ZS5jbGFzc21pZC5EZWZhdWx0Q2xpZW50AAAAAAAAAAECAAJbAAtjb250cm9sbGVyAARjYWxjAA5qYXZhLmxhbmcuRGF0ZWhqg8hMzP0fKwCAAB4cAAAAAVzcgARamF2YS51dGlsLlNlcnZlckluZGV4WwAKZW
