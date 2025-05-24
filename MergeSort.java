package Tugas2;

public class MergeSort {
    public static void main(String[] args) {
        char arr[] = {'f', 'c', 'b', 'A', 'e', 'd'};
        System.out.println("Array sebelum di urutkan");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr);
        System.out.println("Array setelah di urutkan");
        printArray(arr); 
    }

    void sort(char[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    void mergeSort(char[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    void merge(char[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        char[] L = new char[n1];
        char[] R = new char[n2];

        for(int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for(int j = 0; j < n2; ++j)
            R[j] = arr[middle + 1 + j];
        
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
