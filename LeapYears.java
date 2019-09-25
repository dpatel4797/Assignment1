package LeapYears.Java;
public class LeapYears

{
	
	public static void main(String[] args) {
		printLeapYears(1669,2030);
	}
	/**
	 * input:
	 * int i= start year which is less than or equal to end year
	 * i will go in increments of 4
	 * 
	 * constraints
	 * y 0=! 
	 * this method has 2 parameters start year and end year
	 * printLeapYears(1669,2010)
	 * printLeapYears(1700,2000)
	 * printLeapYears(1900,1950)
	 * 
	 * 
	 */
	
    public static void printLeapYears(int startYear, int endYear) {
    	for (int i = startYear; i <= endYear; i++)
        {
            if (i%4==0)
            System.out.println(i);
            
        }
    }
   
}