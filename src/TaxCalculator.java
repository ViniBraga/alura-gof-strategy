/**
 * STRATEGY
 * 
 * Instead of a method controlled by if's like
 * 
 * public void doCalculate(Budget budget, String tax) {
 * 		if(tax.equals("ICMS")){
 * 			return budget.getValue() * .1
 * 		}
 * 		else if(tax.equals("ISS")){
 * 			return budget.getValue() * .06
 * 		}
 * }
 *
 * We utilize polymorphism distributing responsibility to each tax

 */

public class TaxCalculator {

	public void doCalculate(Budget budget, Tax anyTax) {
		double value = anyTax.calcula(budget);
		System.out.println(value);
	}
	
}
