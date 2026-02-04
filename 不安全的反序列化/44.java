Sure, here is an example of insecure deserialization vulnerability in Java:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String serializedData = "rO0ABXNyABpqYXZhLnV0aWwuUHJpb3JpdHkuSGFzaE1hcFRvU3RyaW5nAAAAAAAAAAICAAMaABNbTGphdmEvbGFuZy9PYmplY3Q7TAALamF2YS51dGlsLkxpbmVOdW1iZXJMAAtqYXZhLmxhbmcuUnVudGltZU51bWJlco5r1NkM5c4CAAB4cAAAAAJzcgAab3JnLmV4YW1wbGUuaGFzaC5tYXBwaGFOdW1iZXIAAAAAAAAAAQIAAUwAC2FwcEtleUxpbmVTZXJpYWxpemVkSQAKYXNzZXJ0ABZMamF2YS91dGlsL0Fzc2
