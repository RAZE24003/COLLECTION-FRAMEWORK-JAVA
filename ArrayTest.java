import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int [] num ={1,2,3,4,5,6,7,8,9};
        int index =Arrays.binarySearch(num,4);
        System.out.println(index);
        int [] num1 ={1,5,3,7,4,8,2,9};

        // it will change every value to this value
        // Arrays.fill(num1,6);

        
        Arrays.sort(num1);
        for (int i : num1) {
            System.out.println(i);
        }
        

    }
}
