Sure, here is an example of insecure deserialization vulnerability in Java:

```java
import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            // Simulate user input as a serialized object
            String userInput = "rO0ABXNyAA5qYXZhLnV0aWwuRGVjb2RlAAAAAAAAAAIAA0kAA21hcHQAGExqYXZhL2xhbmcvT2JqZWN0O3hwc3IAEWphdmEudXRpbC5IYXNoU3RhcnRlZFNlcmlhbGl6YWRlcgAAAAAAAAABAgACSQAEc2l6ZXhwAAAAAnQAATFqYXZhL2xhbmcvU3RyaW5nO3hwAHR4eA==";

            // Deserialize the object from user input
            ByteArrayInputStream bais = new ByteArrayInputStream(Base64.getDecoder().decode(userInput));
            ObjectInputStream ois = new ObjectInputStream(bais);
            Object obj = ois.readObject();
            
            // This is where the vulnerability lies, as any serialized object
