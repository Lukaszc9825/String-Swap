import java.io.File;
import java.util.Scanner;

public class File_reader {

     private File file;
     private Scanner scanner;

     // function which Read string from file
     public void Read()
     {
         try {
             scanner = new Scanner(getFile());
             String lane = null;

             do {
                 if (scanner.hasNext("#")) //# ..... allows to comment in file
                 {
                     scanner.nextLine();

                 }
                 lane = scanner.nextLine();
                 System.out.println(lane);
             }while (lane != null);
         }catch(Exception ex)
         {

         }finally {
             try {
                 scanner.close();
             }catch (Exception ex)
             {
                 System.out.println("Problem with file");
             }
         }
     }

    public void setFile(String f)
    {
        this.file=new File(f);
    }

    public File getFile()
    {
       return this.file;
    }
}
