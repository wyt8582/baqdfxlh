Sure, here is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "rO0ABXNyACVjb20uZXhhbXBsZS5Vc2VySW5mbyRJbnNlY3VyZU1ldGhvZEltYWdlJEltYWdlAAAAAAAAAAIAAUwABGltYWdlcQB+AAF4cgBCY29tLmV4YW1wbGUuVXNlckltbm9JbmZvJE51bWJlck1ldGhvZAAAAAAAAAABAgAFSgAEaW1nUHJvcGVydHlzcQB+AAF4cHNyADdjb20uZXhhbXBsZS5Vc2VySW5mbyRMaXN0ZW5lcgAAAAAAAAABAgACTAAEbWFpbnNyACFqYXZhLnV0aWwuQ29sbGVjdGlvbnMkRGVm
