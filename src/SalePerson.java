public class SalePerson implements Comparable<SalePerson>
{
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson (String firstName, String lastName, int totalSales)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }
    public String toString()
    {
        return this.lastName + " , " + this.firstName +  " : " + this.totalSales;
    }

    public boolean equals(SalePerson obj)
    {
        return this.firstName.equals(obj.firstName) && this.lastName.equals(obj.lastName);
    }

    public int compareTo(SalePerson obj)
    {
        if(this.totalSales < obj.totalSales){
            return -1;
        } else if(this.totalSales == obj.totalSales) {
            // break the tie
            if (this.lastName.compareTo(obj.lastName) < 0){
                return 1;
            } else {
                return -1;
            }
        } else {
            return 1;
        }
    }
}
