public class Main
{
	public static void main(String[] args) {
		 //Declaration of each city and their consoles
        
        //Cape Town Sales
        int capeTownPs5 = 1000;
        int capeTownXbox = 2000;
        int capeTownNintendo = 3000;
        
        //Port Elizabeth Sales
        int pePs5 = 2000;
        int peXbox = 3000;
        int peNintendo = 4000;
        
        //Pretoria Sales
        int ptaPs5 = 1500;
        int ptaXbox = 1100;
        int ptaNintendo = 1200;
        
        //Calculating the total sales of each city
        int capeTownTotal = capeTownPs5 + capeTownXbox + capeTownNintendo;
        int peTotal = pePs5 + peXbox + peNintendo;
        int ptaTotal = ptaPs5 + ptaXbox + ptaNintendo;
        
        //Display of the Report
        System.out.println("--------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------");
        System.out.printf("%18s %10d %-10d -%10d%", "Cape Town", capeTownPs5, capeTownXbox, capeTownNintendo);
        System.out.printf("%18s %10d %-10d -%10d%", "Port Elizabeth", pePs5, peXbox, peNintendo);
        System.out.printf("%18s %10d %-10d -%10d%", "Pretoria", ptaPs5, ptaXbox, ptaNintendo);
        System.out.println("--------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------");
        System.out.println("Cape Town: " + capeTownTotal);
        System.out.println("Port Eizabeth: " + peTotal);
        System.out.println("Pretoria: " + ptaTotal);
        System.out.println(" ");
        System.out.println("CITY WITH THE MOST SALES: Port Elizabeth");
	}
}