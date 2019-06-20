
import java.util.List;

public class StringSwap {

    // change list of String to array of string
    public static String[] listToArray (List<String> list)
    {
        String[] lines = new String[list.size()];
        int i=0;
        for (String l:list )
        {
            lines[i]= l;
            //System.out.println(lines[i]);
            i++;
        }
        return lines;
    }

    public static String[] replaceChar (String[] word)
    {
        String[] reverse = new String[word.length];
        for (int i=0;i<word.length;i++)
        {
            char[] wordInChar = word[i].toCharArray();
            for (int j=0;j<wordInChar.length/2;j++)
            {
                char temp=wordInChar[j];
                wordInChar[j]=wordInChar[wordInChar.length-1-j];
                wordInChar[wordInChar.length-1-j]=temp;
            }

            reverse[i]=new String(wordInChar);
        }
        return reverse;
    }

    // replace first word with last, second with next-to-last ..
    public static String[] swapArray (String[] array)
    {
        String[] swaped = new String[array.length];
        for (int i=0; i<array.length;i++)
        {
            swaped[i]=array[array.length-1-i];
            //System.out.println(swaped[i]);

        }
        return swaped;
    }
}
