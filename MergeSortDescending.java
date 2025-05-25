package Tugas2;

public class MergeSortDescending {
    public static void main(String[] args) {
        int nilai1 = 200;
        int nilai2 = 100;
        int nilai3 = 600;
        int nilai4 = 300;
        int nilai5 = 400;
        int nilai6 = 500;

        int[] data = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6};
        urutDescending(data, 0, data.length - 1);
        System.out.println("Data setelah diurutkan dari yang terbesar ke terkecil:");
        for (int angka : data) {
            System.out.print(angka + " ");
        }
    }

    public static void urutDescending(int[] data, int kiri, int kanan) {
        if (kiri < kanan) {
            int tengah = (kiri + kanan) / 2;
            urutDescending(data, kiri, tengah);
            urutDescending(data, tengah + 1, kanan);
            gabungDescending(data, kiri, tengah, kanan);
        }
    }

    public static void gabungDescending(int[] data, int kiri, int tengah, int kanan) {
        int n1 = tengah - kiri + 1;
        int n2 = kanan - tengah;

        int[] kiriArray = new int[n1];
        int[] kananArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            kiriArray[i] = data[kiri + i];
        }
        for (int j = 0; j < n2; j++) {
            kananArray[j] = data[tengah + 1 + j];
        }

        int i = 0, j = 0, k = kiri;
        while (i < n1 && j < n2) {
            if (kiriArray[i] >= kananArray[j]) {
                data[k] = kiriArray[i];
                i++;
            } else {
                data[k] = kananArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            data[k] = kiriArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            data[k] = kananArray[j];
            j++;
            k++;
        }
    }
}
