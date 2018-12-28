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

                if (tabToSort[j] < tabToSort[j - 1]) {   // jesli kolejna liczba ktora sprawdzamy jest mniejsza od poprzedniej z tabeli [j - 1]
                    current = tabToSort[j];              //to przypisujemy ją do tymczasowej zmiennej <current>
                    tabToSort[j] = tabToSort[j - 1];     // ta liczba zostaje przypisana do pozycji o jeden mniejszej -> przesuwamy ja o jeden do tylu
                    tabToSort[j - 1] = current;         // liczba ta teraz zostaje
                }
            }
        }
        return tabToSort;
    }
}

