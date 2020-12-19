public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int holder = 0;
    boolean ranOnce = true;
    for (int i = 0; i < data.length - 1; i++) {
      if (data[i] > data[i + 1]) {
        holder = data[i];
        data[i] = data[i + 1];
        data[i + 1] = holder;
        ranOnce = false;
      }
    }

    if (!ranOnce) {
      bubbleSort(data);
    }
  }

  public static void selectionSort(int[] data){
    int newSpot = 0;
    int previous = 0;
    int min = 0;
    for (int i = 0; i < data.length; i++) {
      min = data[i];
      previous = data[i];
      newSpot = i;
      for (int j = i + 1; j < data.length; j++) {
        if (data[j] < min) {
          min = data[j];
          newSpot = j;
        }
      }
      data[i] = min;
      data[newSpot] = previous;
    }
  }

  public static void insertionSort(int[] data){
    for (int i = 1; i < data.length; i++) {
      int index = i;
      for (int j = 0; j < i; j++) {
        if (data[j] > data[i]) {
          index = j;
          break;
        }
      }
      int old = data[index];
      data[index] = data[i];
      data[i] = old;
    }
  }
}
