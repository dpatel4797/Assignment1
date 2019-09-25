package TimeConversion.Java;

public class timeconversion

{
	public static void main(String[] args) {
		System.out.println (convertSeconds(0));
	}
	/**
	 * input
	 * h- an integer
	 * m- an integer
	 * s- an integer
	 * 
	 * output:
	 * 'seconds'
	 * 
	 * constraints
	 * no constraints
	 * 
	 * @param time 
	 * @return
	 * 
	 * examples)
	 * (convertSeconds(4350))
	 * (convertSeconds(500))
	 * (convertSeconds(10))
	 */
    public static String convertSeconds(int time) 
    {
        int h = time/3600;
        time = time%3600;
        int m =time/60;
        int s = time%60;
        return h + " hours, " + m + " minutes, "+ s+ " seconds";
    }
}

