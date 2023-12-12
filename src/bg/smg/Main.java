package bg.smg;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Integer> num1 = List.of(1, 3, 5, 7);
    List<Integer> num2 = List.of(2, 4, 8, 10);

        System.out.println("List of numbers : ");
        System.out.println(num1);
        System.out.println(num2);
        List<Integer> mergeNum = MergeTwoLists.mergeLists(num1, num2);
        System.out.println("Merged numbers : " + mergeNum);

        List<String> col1 = List.of("red", "green", "blue");
        List<String> col2 = List.of("white", "black", "orange", "pink");

        System.out.println("Colour lists : ");
        System.out.println(col1);
        System.out.println(col2);
        List<String> mergedCol = MergeTwoLists.mergeLists(col1, col2);
        System.out.println("Merged colours : " + mergedCol);


    }
}
