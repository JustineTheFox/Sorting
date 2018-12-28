package com.company;

public class InsertSort {

    public static void main(String[] args) {

        int[] tabToSort = {10, 23, 76, 12, 9, 43, 23, 53};

        int tab[] = insertSort(tabToSort);

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ",");
        }
    }

    static int[] insertSort(int[] tabToSort) {

        int current;
        for (int i = 0; i < tabToSort.length; i++) {
            for (int j = i; j > 0; j--) {

                if (tabToSort[j] < tabToSort[j - 1]) {  
                    current = tabToSort[j];             
                    tabToSort[j] = tabToSort[j - 1];      
                    tabToSort[j - 1] = current;         
                }
            }
        }
        return tabToSort;
    }
}

