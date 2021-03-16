import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer>  intArr = new ArrayList<>();
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(intArr.size());
        intArr = toArrayList(arr);
        System.out.println(intArr.size());

    }

    public static ArrayList toArrayList(int[]arr){
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            integerArrayList.add(i, arr[i]);
        }
        return integerArrayList;
    }
}
