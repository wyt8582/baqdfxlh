Sure, here is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {
    
    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyACpvcmcuamF2YS5tYWluLlN5c3RlbU1vZGVsAAAAAAAABD9i8f8V1AIAAHhyACxqYXZhLmxhbmcuU3lzdGVtO6DQkRj7uJzAgACTAAJZGVjb3JhdGVkcQB+AARMAAtkZWZhdWx0dAASTGphdmEvbGFuZy9TdHJpbmc7TAAGaW52YWxpZHEAfgABTAAJaW52aXRlZHhwAAAAAQAMc3RhY2txAH4AAUwACG11dGV4dHEAfgABeHBwcQB+AAN0AChkb2N1bWVudHhwAAAAAAAAAAECAAVlbnRxAH4AAw==
