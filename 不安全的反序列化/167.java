Certainly! Here is a Java code snippet that demonstrates a vulnerability related to Insecure Deserialization:

```java
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationDemo {

    public static void main(String[] args) {
        // This is a simplified example to demonstrate the vulnerability
        String userInput = "rO0ABXNyAClvcmcuamF2YS5pby5TZXJpYWxpemF0aW9uUHJpbWl0aXZlAAAAAAAAAAECAAFMAAtzdGFja1RyYWNldAASTGphdmEvb3JnL2hhc2hNYXA7TAAGc3RhY2tNYXAABnN0YWNrVHJhY2VxAH4AAUwABG5hbWVzcQB+AAdMAARwcmVmaXhlZHEAfgADTAALcHJvZHVjZXNxAH4AAUwACHB1cnBvc2VBdHEAfgADeHBwdAADb3BlbnEAfgAFdwQAAAABcQB+AAF4e
