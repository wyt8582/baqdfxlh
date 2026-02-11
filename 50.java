import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) throws Exception {
        String userInput = "input.ser"; // User provides input as a serialized object file

        FileInputStream fileIn = new FileInputStream(userInput);
        ObjectInputStream in = new ObjectInputStream(fileIn);

        Object obj = in.readObject();
        System.out.println(obj);

        in.close();
    }
}
