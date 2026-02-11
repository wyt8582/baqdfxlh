Sure, here is a Java code snippet that demonstrates a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyACJqYXZhLnV0aWwuRGVjb2RlSGFzaE1hcJMC7vKb8GgCAANJAAZpbnZva2VydAASTGphdmEvbGFuZy9PYmplY3Q7eHBzcgA/b3JnLmFkbWluLkRpc2NvcmQkSW52b2tlclRvUHJvcGVydHlNYW5hZ2VkSW52b2tlco8udfK41B6iCAAB4cAAAAAFzcQB+AAIAAAAAAXNxAH4ABwAAAAxzdHJpbmdxAH4ACwAAAAR0AARhdXRob3JpdHl0ABJMamF2YS9sYW5nL1N0cmluZzt4cQB
