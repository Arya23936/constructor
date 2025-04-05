import java.io.*;
import java.nio.file.*;
public class FileHandling {
    public static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Data successfully written to the file: " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
    public static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
    public static void appendToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            writer.newLine(); 
            System.out.println("Data successfully appended to the file: " + filePath);
        } catch (IOException e) {
            System.err.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
    public static void copyFile(String sourcePath, String destinationPath) {
        try {
            Files.copy(Paths.get(sourcePath), Paths.get(destinationPath), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully from " + sourcePath + " to " + destinationPath);
        } catch (IOException e) {
            System.err.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String filePath = "example.txt";
        String contentToWrite = "Hello, this is a file handling example in Java!";
        String contentToAppend = "\nThis is an appended line of text.";
        writeToFile(filePath, contentToWrite);
        System.out.println("\nReading from the file:");
        readFromFile(filePath);
        appendToFile(filePath, contentToAppend);
        System.out.println("\nReading after appending:");
        readFromFile(filePath);
        String copyPath = "example_copy.txt";
        copyFile(filePath, copyPath);
    }
