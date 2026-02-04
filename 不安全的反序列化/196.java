Sure, here is an example of Java code demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String serializedObject = "rO0ABXNyACxqYXZhLnV0aWwuRGF0YSRMb2NhbGRyZW4AAAAAAAAAAQIAAHhyACFqYXZhLmxhbmcuTGlzdAAAAAABAgABTAAGbmFtZXQAEkxqYXZhL2xhbmcvU3RyaW5nO0wAD3JlZmVyZXJqdAASTGphdmEvbGFuZy9TdHJpbmc7eHB0AA9MamF2YS91dGlsL0xpc3Q7eHBzcgA/b3JnLmV4cG9ydC5hcGkuY29tbWlzc2lvbi5kZXNlcmlhbGl6YXRpb24uSW5zZWN1cmVEZXNlcmlhbGl6YXRpb24AAAAAAAA
