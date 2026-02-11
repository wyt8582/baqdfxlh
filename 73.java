Certainly! Here is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        // Simulating user input containing serialized object
        String userInput = "rO0ABXNyABJqYXZhLnV0aWwuRGF0YUhpZGRlbiRMamF2YS9sYW5nL1NlcmlhbGl6YXRpb25TdHJlYW1TdHJlYW1UZXN0EuRXtFNL8B4AgACSQAEc3IAJWphdmEudXRpbC5IYXNoTWFwSXRlbXNUaHJvd2FibGVDb25zdW1wdGlvbnQAGkxqYXZhL3V0aWwvSGFzaE1hcDtMAAVzdGFja1RyZWVTdHJlYW10AApMamF2YS91dGlsL0hhc2hNYXA7eHAAAAAAAAAA";

        try {
            // Deserialize the object
