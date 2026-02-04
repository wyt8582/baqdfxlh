Certainly! Here is an example of insecure deserialization vulnerability in Java:

```java
import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            // Simulating user input (serialized object)
            String userInput = "rO0ABXNyAC9pbmZvL1N5c3RlbQAAAAAAAAAAAwAAAHhwdwQAQU5aAIAAAAIAAgAAwBtYWluAAMxbXEAfgABeHBzcgAoamF2YS5pby5TdHJpbmcpfFgMAAAAAD-0AADGxvcmcvYXBhY2hlL0FsZ29yaXRobTt4cHNyACpqYXZhLmlvLlN0cmluZ6W8nSjM7AgAESQAHDWNvbGxlY3Rpb25xAH4AAUwAA21hcHQAEkxqYXZhL2xhbmcvU3RyaW5nO3hwAHQAEXNyACtvcmcuamF2YS5jb25uZWN0
