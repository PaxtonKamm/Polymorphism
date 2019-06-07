//********************************************************************
//  Sorting.java       Author: Paxton Kammermeier and Lewis/Loftus
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************

public class Sorting<StaffMember>
{
    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the selection
    //  sort algorithm.
    //-----------------------------------------------------------------
    public void selectionSort(Comparable<StaffMember>[] list)
    {
        int max;
        Comparable temp;

        //This for-loop will go through the list and if any value is greater than the current max(in this case who's name
        // is closer to the letter 'Z'), then it will swap the values.
        for (int index = 0; index < list.length-1; index++)
        {
            max = index;
            for (int scan = index+1; scan < list.length; scan++)
                //if the current item is greater than the max(the first letter in the person's name is closer to 'Z')
                // , then change the new max.
                if (list[scan].compareTo((StaffMember)list[max]) > 0)
                    max = scan;

            // Swap the values
            temp = list[max];
            list[max] = list[index];
            list[index] = temp;
        }
    }
}
