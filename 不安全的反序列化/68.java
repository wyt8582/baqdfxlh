import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        try {
            String userInput = "userInput.ser"; // User provided input (serialized object file)

            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Object obj = in.readObject();
            System.out.println(obj);

            in.close();
            fileIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
