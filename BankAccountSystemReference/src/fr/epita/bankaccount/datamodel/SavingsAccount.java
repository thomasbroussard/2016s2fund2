/**
 * 
 */
package fr.epita.bankaccount.datamodel;

/**
 * @author tbrou
 *
 */
public class SavingsAccount extends Account {
	private double interestRate;

	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
