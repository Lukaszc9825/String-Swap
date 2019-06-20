public class Main {

    public static void main (String[] args)
    {
        File_reader f = new File_reader();

        f.setFile("file1.txt");  // add file name to object of class File_reader

        f.read();// read lines from txt and add them to list

        f.write("Char_change_positions",StringSwap.replaceChar( StringSwap.listToArray(f.getList())));
        f.write("Words_change_positions",StringSwap.swapArray( StringSwap.listToArray(f.getList())));// change list to array and replace it and save to txt
    }
}
