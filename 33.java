Certainly! Here is a Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.*;

public class InsecureDeserializationExample {
    
    public static void main(String[] args) {
        String userInput = "rO0ABXNyACVqYXZhLnV0aWwuRGVmYXVsdFByb3h5AAAAAAAAAAICAAB4cAAAAAJzcgARamF2YS51dGlsLkRlZmF1bHRQcm94eQAAAAAAAAABAgACSQAEc2l6ZWR0ABJMamF2YS9sYW5nL1N0cmluZzt4cAAAAAIAAAACdAAGYXJnc3QALExqYXZhL3V0aWwvU3RyaW5nO3hwcQB+AAQ=";

        try {
            byte[] bytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(userInput);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes));
            Object obj = ois.readObject();
            System.out.println("Deserialized object: " + obj);
