//********************************************************************
//  StaffMember.java       Author: Paxton Kammermeier and Lewis/Loftus
//
//  Represents a generic staff member.
//********************************************************************

abstract public class StaffMember implements Payable , Comparable<StaffMember>
{
    protected String name;
    protected String address;
    protected String phone;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this staff member using the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffMember(String eName, String eAddress, String ePhone)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    //-----------------------------------------------------------------
    //  Returns a string including the basic employee information.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = "Name: " + name + "\n";

        result += "Address: " + address + "\n";
        result += "Phone: " + phone;

        return result;
    }
    // retrieves the name of the Staff Member
    public String getName() {

        return name;
    }
    // The public method compares the staff members name to each other.
    public int compareTo(StaffMember otherMember)
    {
        return name.compareTo(otherMember.getName());
    }
    // The abstract method of vacation.
    public abstract int vacation();
}
