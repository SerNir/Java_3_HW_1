import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

    }



    public static void change(List arr, int cell1, int cell2) {
        if (arr.get(0) instanceof String) {
            String a = (String) arr.get(cell1);
            arr.set(cell1, arr.get(cell2));
            arr.set(cell2, a);
        }
        if(arr.get(0) instanceof Integer){
            int i = (int)arr.get(cell1);
            arr.set(cell1, arr.get(cell2));
            arr.set(cell2, i);
        }
    }

}
