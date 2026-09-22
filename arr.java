import java.util.ArrayList;
public class Arr{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        System.out.println(arr.get(1));
        arr.set(1, 55);
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.contains(55));
    }
}