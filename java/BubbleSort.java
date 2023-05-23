public class BubbleSort {
     public static void main(String[] args) {
         int[] tab = {7, 2, 10, 3, 5, 8};
 
         System.out.println("Tablica przed sortowaniem: ");
         printArray(tab);
 
         bubbleSort(tab);
 
         System.out.println("Tablica po sortowaniu: ");
         printArray(tab);
     }
 
     public static void bubbleSort(int[] tab) {
         int n = tab.length;
         boolean swapped;
 
         do {
             swapped = false;
             for (int i = 1; i < n; i++) {
                 if (tab[i - 1] > tab[i]) {
                     int temp = tab[i - 1];
                     tab[i - 1] = tab[i];
                     tab[i] = temp;
                     swapped = true;
                 }
             }
             n--;
         } while (swapped);
     }
 
     public static void printArray(int[] tab) {
         for (int num : tab) {
             System.out.print(num + " ");
         }
         System.out.println();
     }
 }
