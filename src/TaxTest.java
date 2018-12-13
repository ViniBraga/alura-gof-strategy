

public class TaxTest {

	public static void main(String[] args) {

		Tax iss = new ISS();
        Tax icms = new ICMS();

        Budget budget = new Budget(500.0);

        TaxCalculator calculador = new TaxCalculator();

	    // Calculating o ISS
	    calculador.doCalculate(budget, iss);
	
	    // Calculating ICMS        
	    calculador.doCalculate(budget, icms);
		
	}

}
