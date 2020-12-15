import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Tests {
  public static void main(String[] args) {
    testSort();
  }

  public static void testSort() {
    ArrayList<Boolean> results = new ArrayList<Boolean>();

    int[] one = {0, 1, 2, 3, 6, 1000, 93801823};
    Sorts.bubbleSort(one);
    results.add(Arrays.toString(one).equals("[0, 1, 2, 3, 6, 1000, 93801823]"));

    int[] two = {12, -444, 12938, 10, 3, -22, -3, 99, 99, 0};
    Sorts.bubbleSort(two);
    results.add(Arrays.toString(two).equals("[-444, -22, -3, 0, 3, 10, 12, 99, 99, 12938]"));

    int[] three = {6, 1, 3, 2, 4, 5};
    Sorts.bubbleSort(three);
    results.add(Arrays.toString(three).equals("[1, 2, 3, 4, 5, 6]"));

    int[] four = {-2, -4, -4, -4, -2323, -77676, -999999};
    Sorts.bubbleSort(three);
    results.add(Arrays.toString(three).equals("[-999999, -77676, -2323, -4, -4, -4, -2]"));

    int[] five = {6, 1, 3, 2, 4, 5};
    Sorts.bubbleSort(three);
    results.add(Arrays.toString(three).equals("[1, 2, 3, 4, 5, 6]"));

    showResults(results, "Test Bubble Sort");
  }

  private static void showResults(ArrayList<Boolean> results, String testName) {
    for (int i = 0; i < results.size(); i++) {
      if (results.get(i)) System.out.println(testName + " #" + i + ": PASS");
      else System.out.println(testName + " #" + i + ": FAIL");
    }
  }
}
