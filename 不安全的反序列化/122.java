import java.io.*;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            String userInput = "input.txt"; // User input that specifies the file to deserialize
            FileInputStream fileIn = new FileInputStream(userInput);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Deserialize the object
            Object obj = in.readObject();

            // Do something with the deserialized object (e.g., cast it to a specific class)
            if (obj instanceof MyClass) {
                MyClass myObj = (MyClass) obj;
                System.out.println("Deserialized object: " + myObj.getData());
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyClass implements Serializable {
    private String data;

    public MyClass(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
