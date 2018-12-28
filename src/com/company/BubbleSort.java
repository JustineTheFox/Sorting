package com.company;

public class BubbleSort {

    public static void main(String[] args) {

        int[] tabToSort = {7, 23, 76, 12, 9, 43};  //54,12,7,22,51};

        int tab[] = sortBub(tabToSort);

        System.out.println(tab);
    }

    public static int[] sortBub(int[] tabToSort) {


        for (int i = 0; i < tabToSort.length; i++) {
            for (int j = 0; j < tabToSort.length - 1; j++) {

                if (tabToSort[j] > tabToSort[j + 1]) {

                    int temp;
                    temp = tabToSort[j + 1];
                    tabToSort[j + 1] = tabToSort[j];
                    tabToSort[j] = temp;
                }
            }
        }
        return tabToSort;
    }
}
