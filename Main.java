/*
 * Raul Diaz

    Heap Tree with graphical text interface  
    =======================================================================
    
    This program generates a 5 level heap tree with 31 nodes. Providing 
    a graphical interface to the user, an array of 31 numbers are randomly 
    generated without any repeated values. A heap tree is then created
    where each root of any sub tree is larger than either child. 
    After the user allows for continuation, the tree is then re-sorted 
    such that the smallest value of the set is located at the first index  
    of the array and the largest value is at root of the tree. 
     
*/
/**************************************************************************/

package hw6;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HeapTree myHeap = new HeapTree(31);

        myHeap.Display();
        System.out.println("Hit Enter to create Heap Tree...");
        new java.util.Scanner(System.in).nextLine();
       
        myHeap.SortintoHeap();
        System.out.println("Finished HEAP...\nHit Enter to Re-sort tree");
        new java.util.Scanner(System.in).nextLine();

        //myHeap.treeisSorted();
        myHeap.sortTree();
        System.out.println("Tree is sorted..\nHit Enter to view array...");
        new java.util.Scanner(System.in).nextLine();

        myHeap.DispArray();
        System.out.println("\nPress Enter To Quit...");
        new java.util.Scanner(System.in).nextLine();

    }

}
