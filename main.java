import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> tablica = new ArrayList<Integer>();
        tablica.add(5);tablica.add(3);tablica.add(6);tablica.add(2);tablica.add(10);
        System.out.println(selectionSort(tablica));
    }

    private static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallest_index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallest_index = i;

            }
        }
        return smallest_index;
    }
    private static List<Integer> selectionSort(List<Integer> arr){
        List<Integer> newArr = new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++){
            int smallest = findSmallest(arr);
            newArr.add(arr.remove(smallest));
        }
        return newArr;
    }
}
