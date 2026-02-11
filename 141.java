Sure, here is an example Java code snippet demonstrating a vulnerability related to Insecure Deserialization:

```java
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "rO0ABXNyACVqYXZhLnV0aWwuRGF0YS5TZWxlY3Rpb24AAAAAAAAAAQIAAHhyACFqYXZhLmxhbmcuUnVudGltZUV4Y2VwdGlvbp5fBz3l3eDwCAAB4cAAAAABxAH4AAgAGWgAKdGVzdHN0ABNbTGphdmEvbGFuZy9TdHJpbmc7eHBzcgA/b3JnLmFzc2VtYmxlLk9yZy5jb250ZXh0LlN1cHBvcnQuU3VwcG9ydCQ1Qko2/8YGIAIAAHhwAAAADnQAG01vZGVsTWFjaGluZQAAAAAAAAABAgACSg
