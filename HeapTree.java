/*
 * Raul Diaz

    Heap Tree w/ graphical text interface  
    =======================================================================
  
    Source file library with sorting, swapping, heaping, and displaying
    methods.      
*/
/**************************************************************************/

package hw6;

import java.util.*;
public class HeapTree {

    int [] treeArray;           
    Random gen = new Random();
    public HeapTree(int numofNodes)
    {       
        int i,j, tempval;
        treeArray = new int[numofNodes+1];
        for(j = 1; j<= numofNodes; j++)
        {
            tempval = gen.nextInt(89)+10;
            treeArray[j] = tempval;
            
            //avoids dublicates in array
            for(i = 1; i<j; i++)
            {
                if(treeArray[i] == treeArray[j])
                    j--;
            }
        }
    }

    public void SortintoHeap()
    {
        int i;
        int len =treeArray.length-1;         
        for(i = len/2; i>0; i--)
        {            
            heapingAlg(i,len);             
            System.out.println("Sorting into Heap...");             
            Display(); 
            
            //system pause of 1000 ms
             try{ 
                Thread.sleep(500);
             }
             catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
             }
        }
    }
    
    private void heapingAlg(int rootIndex, int lastIndex)
    {
        int rootVal; 
        int parentIndex = rootIndex; 
        boolean notHeap = true; 
        while(notHeap)
        {
            rootVal = treeArray[parentIndex];             
            //assigns parent's left child
            int childIndex = parentIndex*2;             
            if(childIndex <= lastIndex)
            {
                //checks if right child is larger than current child
                if(childIndex+1<= lastIndex && 
                        treeArray[childIndex] < treeArray[childIndex+1])
                    childIndex++; 
                
                if(treeArray[childIndex] > rootVal)
                {
                    treeArray[parentIndex] = treeArray[childIndex];
                    parentIndex = childIndex; 
                }                 
                else
                    notHeap = false; 
            }            
            else
                notHeap = false; 
            
            treeArray[parentIndex] = rootVal; 
        }                
    }
        
    private void swap(int i, int j)
    {
        int temp = treeArray[i];
        treeArray[i] = treeArray[j];
        treeArray[j]=temp;
    }

    public void sortTree()
    {
        int i,len = treeArray.length-1 ;
        boolean swapped; 
        do
        {
             for(i = len/2; i>0; i--)
            {
                heapingAlg(i,len);   
            }

            swapped = false; 
            if(treeArray[1] > treeArray[len])
            {
                swap(1,len); //swap smallest w/ larget
                swapped = true;
            }
                
          
            if(len>3 &&treeArray[1] < treeArray[2])
            {
                swap(1,2);
                swapped = true;
            }

                          
            if(len>3 &&treeArray[1] < treeArray[3])
            {
                swap(1,3);
                swapped = true;
            }

            if(swapped)
            {
            
                System.out.println("Sorting numerically...");
                Display();
                //system pause of 1000 ms
                 try{
                    Thread.sleep(500);
                 }
                 catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                 }
            }
            len--;
        }while(len>0);
    }
    
    public void DispArray()
    {
        int i; 
        for(i=1;i < treeArray.length  ; i++)
          System.out.print(treeArray[i] + " ");
    }
    public void Display()
    {
        System.out.println("			                   "
                + "" +treeArray[1] );
        System.out.println("                                           |"); 
        System.out.println("	  	   "+treeArray[2]+"--------------------"
                + "^--------------------"+treeArray[3]);
        System.out.println("                     |                            "
                + "               |");
        System.out.println("         "+treeArray[4] + "----------^----------"
                +treeArray[5]+"                    " + treeArray[6] + "--------"
                + "-^---------"+ treeArray[7]);

        System.out.println("          |                     |                "
                + "     |                    |");
        System.out.println("    "+treeArray[8] +"----^----" +treeArray[9] +"  "
               + "       " +treeArray[10] +"----^----" +treeArray[11] +"       "
                + "  " +treeArray[12] +"----^----" +treeArray[13] +"        "
                + "" +treeArray[14] +"----^----" +treeArray[15]);
        System.out.println("    |          |          |          |         "
                + " |          |          |          |");
        System.out.println(treeArray[16] +"--^--" +treeArray[17] +"  " 
                +treeArray[18] +"--^--" +treeArray[19] +"  " +treeArray[20]
                +"--^--" +treeArray[21] +"  " +treeArray[22] +"--^--"
                +treeArray[23] +"  " +treeArray[24] +"--^--" +treeArray[25]
                +"  " +treeArray[26] +"--^--" +treeArray[27] +"  "
                +treeArray[28] +"--^--" +treeArray[29] +"  " +treeArray[30]
                +"--^--" +treeArray[31]);
        
    }


}
