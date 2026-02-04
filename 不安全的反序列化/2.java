Certainly! Here is an example of Java code that demonstrates a vulnerability related to Insecure Deserialization:

```java
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "rO0ABXNyAA5qYXZhLnV0aWwuUHJpb3JpdHkAAAAAAAAAAQIAAHhyAD1vcmcuYXBhY2hlLmNvbW1vbmxvZ3kuc2VjdXJlLmNvbW1vbmxvZy5Qcm9qZWN0SW52b2tlclplcm8AAAAAAAAAAQIAAkwACGNoYW5nZWROdW1iZXJMAA1pbnZva2VkcQB+AAd4cgATamF2YS51dGlsLkFycmF5TGlzdAAAAAB4cQB+AAtzcQB+AAp4";
        
        try {
            byte[] serializedData = userInput.getBytes();
            ByteArrayInputStream bis = new ByteArrayInputStream(serializedData);
