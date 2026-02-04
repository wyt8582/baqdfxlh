Certainly! Here is a Java code snippet that demonstrates a vulnerability related to Insecure Deserialization:

```java
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        try {
            String userInput = "rO0ABXNyAA9qYXZhLnV0aWwuUHJpb3JpdHkuSGFzaENvZGVQcm94eQAAAAAAAAABAgACWgAEaW1wbAAAAAFzcgARamF2YS5sYW5nLkludGVnZXIS4qCk94GHOAIAAUwAA2VtYWlsdAAPTGphdmEvbGFuZy9TdHJpbmc7eHBwc3IAEWphdmEubGFuZy5SdW50aW1lAAAAAAAAAAAAAAABAgACRAAKbG9hZEZpbGVoZWxwZXIAAltCrPMX+AYIVOACAAB4cAAAAACcAAAAMAAAAdmFsdWU=";

            byte[] serializedData = userInput.getBytes();
            ByteArrayInputStream bais =
