package Tugas2;

public class CountingSortDescending {
    public static void main(String[] args) {
        int nilai1 = 200;
        int nilai2 = 100;
        int nilai3 = 300;
        int nilai4 = 500;
        int nilai5 = 600;
        int nilai6 = 400;

        int[] data = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6};
        countingSortDescending(data);
        System.out.println("Data setelah diurutkan dari yang terbesar ke terkecil:");
        for (int angka : data) {
            System.out.print(" " + angka);
        }
    }

    public static void countingSortDescending(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        int[] count = new int[max + 1];
        for (int num : arr) {
            count[num]++;
        }

        int index = 0;
        for (int i = max; i >= 0; i--) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}
