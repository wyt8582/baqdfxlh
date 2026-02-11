Certainly! Here is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            // Simulating user input received as serialized data
            String userInput = "rO0ABXNyAA9qYXZhLnV0aWwuQ29uZmlnAAAAAAAAAAECAAJMAARuYW1ldAASTGphdmEvbGFuZy9TdHJpbmc7eHBzcgA6amF2YS51dGlsLkNvbmZpZwAAAAAAAAABAgACTAAIc2VyaWFsTAAIaW50AAhTdHJpbmd0ABBMamF2YS91dGlsL0xpc3Q7eHBwc3IAKmphdmEudXRpbC5IYXNoU2VyaWFsAAAAAAAAAAAAAABzcQB+AAIAAgACcHVyAQB4cAAAADNxAH4ACw==";

            // Deserialize the user input
            ObjectInputStream ois = new ObjectInputStream(new
