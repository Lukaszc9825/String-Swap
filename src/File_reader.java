import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File_reader {

     private File file_read;
     private File file_save;
     private Scanner scanner;
     private FileWriter write;
     private List<String> lanes = new ArrayList<>();

     // function which Read string from file
     public void read()
     {
         try {
             scanner = new Scanner(getFile());
             String lane = null;

             do {
                 if (scanner.next().equals("#")) //# ..... allows to comment in file
                 {
                     scanner.nextLine();

                 }
                 lane = scanner.next(); // add new scanned word to variable lane
                 lanes.add(lane);  // add lane to list
                 //System.out.println(lane);
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

     // this function write array of string to file which name we can choose

    public void write(String file_name, String[] array)
     {
         try {
             this.file_save = new File(file_name + ".txt");
             this.write = new FileWriter(file_save);
             for (String s:array)
             {
                 write.write(s);
                 write.write(" ");
             }
         }catch (Exception ex)
         {

         }finally {
             try{
                 write.close();
             }catch (Exception e)
             {

             }
         }

     }



    public void setFile(String f)
    {
        this.file_read=new File(f);
    }

    public File getFile()
    {
       return this.file_read;
    }

    public List<String> getList()
    {
        return lanes;
    }
}
