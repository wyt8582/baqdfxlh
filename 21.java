import java.io.*;

public class InsecureDeserializationExample {

    public static void main(String[] args) {
        String userInput = "rO0ABXNyABNqYXZhLnV0aWwuRGVzZXJpYWxpemF0aW9uU3luYy5Db21tb25LZXkAAAAAAAAAAQIAAUwACGh0dHA6Ly93d3cuZ29vZ2xlLmNvbS90cmFuc3BvcnRpbmc=";
        
        try {
            byte[] inputData = Base64.getDecoder().decode(userInput);
            ByteArrayInputStream bis = new ByteArrayInputStream(inputData);
            ObjectInputStream ois = new ObjectInputStream(bis);
            
            Object obj = ois.readObject();
            
            System.out.println(obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
