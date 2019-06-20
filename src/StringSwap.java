
import java.util.List;

public class StringSwap {

    public static String[] listToArray (List<String> list)
    {
        String[] lines = new String[list.size()];
        int i=0;
        for (String l:list )
        {
            lines[i]= l;
            i++;
        }
        return lines;
    }

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
