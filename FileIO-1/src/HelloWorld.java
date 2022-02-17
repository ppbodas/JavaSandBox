public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Inside Main" + "\n" + "Hello World");

        CFileReader fileReader = new CFileReader("/Users/prathmb/Programming/Java/FileIO-1/data/Input.txt");

        String line  = fileReader.realNextLine();
        while (line != null && !line.isEmpty()) {
            System.out.println(line);
            line = fileReader.realNextLine();
        }

        fileReader.close();

        CFileWriter fileWriter = new CFileWriter("/Users/prathmb/Programming/Java/FileIO-1/data/Input-1.txt", false);
        fileWriter.writeLine("How are you?");

        fileWriter.close();
    }
}
