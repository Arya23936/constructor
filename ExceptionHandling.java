import java.io.*;
 
 public class ExceptionHandlingExample {
     public static void main(String[] args) {
         try {
             String fileName = "nonexistentFile.txt";
             readFile(fileName);
         } catch (FileNotFoundException e) {
             System.err.println("Error: File not found - " + e.getMessage());
             e.printStackTrace();  
         } catch (IOException e) {
             System.err.println("I/O Error occurred - " + e.getMessage())
             e.printStackTrace();
         } finally {
             System.out.println("Execution completed.");
         }
     }
 
     public static void readFile(String fileName) throws IOException {
         BufferedReader reader = null;
         try {
             reader = new BufferedReader(new FileReader(fileName));
             String line;
             while ((line = reader.readLine()) != null) {
                 System.out.println(line);
             }
         } catch (FileNotFoundException e) {
             throw new FileNotFoundException("The file " + fileName + " was not found.");
         } finally {
             if (reader != null)
