//********************************************************************
//  Employee.java       Author: Paxton Kammermeier and Lewis/Loftus
//
//  Represents a general paid employee.
//********************************************************************

public class Employee extends StaffMember
{
    protected final int STANDARD_VACATION = 14;
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this employee with the specified
    //  information.
    //-----------------------------------------------------------------
    public Employee(String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //-----------------------------------------------------------------
    //  Returns information about an employee as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecurityNumber;

        return result;
    }

    //-----------------------------------------------------------------
    //  Returns the pay rate for this employee.
    //-----------------------------------------------------------------
    public double pay()
    {
        return payRate;
    }
    // Returns the standard amount of vacation time.
    public int vacation(){
        return STANDARD_VACATION;
    }
}
