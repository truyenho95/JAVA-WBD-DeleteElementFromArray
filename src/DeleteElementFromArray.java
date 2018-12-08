import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {
  public static void main(String[] args) {
    int[] numberArray = {2,3,4,10,7,5,10};
    System.out.println("Mảng ban đầu là:");
    printArray(numberArray);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập giá trị phần tử mà bạn muốn xóa:");
    int deleteValue = scanner.nextInt();

    int numberFoundValue = 0;
    for (int element : numberArray)
      if (deleteValue == element)
        numberFoundValue++;

    int[] numberArrayAfterDelete = new int[numberArray.length-numberFoundValue];

    int indexOfNewNumberArray = 0;
    for (int element : numberArray) {
      if (element != deleteValue) {
        numberArrayAfterDelete[indexOfNewNumberArray] = element;
        indexOfNewNumberArray += 1;
      }
    }

    System.out.println("Mảng sau khi xóa là:");
    printArray(numberArrayAfterDelete);
  }

  private static void printArray(int[] arr) {
    System.out.println(Arrays.toString(arr));
  }
}
