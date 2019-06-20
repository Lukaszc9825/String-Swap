public class Main {

    public static void main (String[] args)
    {
        File_reader f = new File_reader();
        f.setFile("file1.txt");
        f.Read();
        System.out.println(f.getList());
        //StringSwap.listToArray(f.getList());
        StringSwap.swapArray( StringSwap.listToArray(f.getList()));
    }
}
