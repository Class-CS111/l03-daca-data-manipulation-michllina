// STUDENT NAME: Michelle Mendoza
// DATE: 2/15/25

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/

		/***** INITIALIZATION SECTION *****/
		int dayToday, monthToday, yrToday;
		int julianToday;
		int dayBday, monthBday, yrBday;
		int julianBday;

		dayToday = 15;
		monthToday = 2;
		yrToday = 2025;

		dayBday = 16;
		monthBday = 1;
		yrBday = 2006;
		
	int a, m, y;

		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
a = (14 - monthToday) / 12;
m = monthToday + 12*a - 3;
y = yrToday + 4800 - a;
		
	julianToday = dayToday + (153*m + 2)/5 + 
	365*(y) + (y/4) - (y/100) + (y/400) - 32045;
	
a = (14 - monthBday) / 12;
m = monthBday + 12*a - 3;
y = yrBday + 4800 - a;

	julianBday = dayBday + (153*m + 2)/5 + 
	(365*y) + (y/4) - (y/100) + (y/400) - 32045;
	
	int diff = julianToday - julianBday;
	int approxyrs = diff/365;

		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number for today's date, " + monthToday + "/" + dayToday + "/" + yrToday + ", is " + julianToday);
		System.out.println("Julian Day Number for birthday, " + monthBday + "/" + dayBday + "/" + yrBday + ", is " + julianBday);
		System.out.println("The difference in days is" + diff + ", which makes you approximately " + approxyrs + " years old!");
  }
}