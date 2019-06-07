//********************************************************************
//  Firm.java       Author: Paxton Kammermeier and Lewis/Loftus
//
//  Demonstrates polymorphism via inheritance.
// Since this is the main method, I will explain my algorithm here.
// For the following code, it will initialize the staffMember array
// with staff members. Then, the sort method will organize the staff
// members by their names in alphabetical order starting with the letter
// 'Z'. Finally, the payday method, pays the staff and shows them their
// vacation days.
//********************************************************************

public class Firm
{
    //-----------------------------------------------------------------
    //  Creates a staff of employees for a firm and pays them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Staff personnel = new Staff();
        personnel.sort(); //call sort method before payday
        personnel.payday();
    }
}
