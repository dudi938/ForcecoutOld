package hello;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class
import java.io.PrintWriter;
//import java.time.LocalDate; 
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Logger {

    static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public static boolean CreateFile(String path){
        boolean res = false;
		try {
            File myObj = new File(path);
			if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                res = true;

			} else {
              res = true;
		}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
        }
        
        return res;
    }

    public static void CheckFileExist(String path){

    }

    public static void WriteToFile(String content){

    }

    public static void AppendToFile(String path, String content){

        if((CreateFile(path)))
        {
            try {
                FileWriter myWriter = new FileWriter(path, true);
                PrintWriter printWriter = new PrintWriter(myWriter);
                String line = LocalDateTime.now().format(myFormatObj) + ": " +  content;
                
                //print to file
                printWriter.println(line);
                //print to screen
                System.out.println(line);

                printWriter.close();
        
            }catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}