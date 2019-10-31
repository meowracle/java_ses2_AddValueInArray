import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap vao phan tu can them: ");
        int value = scanner.nextInt();
        System.out.println("moi nhap vao vi tri them trong mang: ");
        int index = scanner.nextInt();

        if (index <= 1 || index >= array.length - 1) {
            System.out.println("khong the chen dc");
        } else {
            array[index] = value;
            for (int i = array.length - 1; i < index; i--) {
                array[i] = array [i-1];
            }
        }
    }
}
