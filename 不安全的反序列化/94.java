Sure, here is an example of Java code demonstrating a vulnerability related to insecure deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        // Simulate user input (potentially from an untrusted source)
        String userInput = "rO0ABXNyACdjb20uZXhhbXBsZS5Vc2VySW5wdXRBc3NlbWJseWluZ1N0b3Jlh2GvG8LmHAIAAUwAAUwBAAhleGVjAQAGamF2YXgAAgEAAQAJZGVzdHN0cmVhbRQAEGphdmFzdAASW0hTG9yZWdpYmVkUHJvcGVydHlFbnVtZXJhdG9yO3hwc3IADmphdmEubGFuZy5FeGVjdXRlSGFzaFNldIJ71g8QfAIAAUwACGhlbGxvDWdldEludAEKTXNnUGhvbmVOdW1iZX
