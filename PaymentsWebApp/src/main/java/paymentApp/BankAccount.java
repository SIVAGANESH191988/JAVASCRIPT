package paymentApp;

public class BankAccount {

	
	private long bankAcctNumber;
	private String bankAcctBankName;
	private String bankAcctIFSC;

	
	private int bankAcctPin;
	private int userId;
	private double Balance;
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public long getBankAcctNumber() {
		return bankAcctNumber;
	}
	public void setBankAcctNumber(long accNo) {
		this.bankAcctNumber = accNo;
	}
	public String getBankAcctBankName() {
		return bankAcctBankName;
	}
	public void setBankAcctBankName(String bankAcctBankName) {
		this.bankAcctBankName = bankAcctBankName;
	}
	public String getBankAcctIFSC() {
		return bankAcctIFSC;
	}
	public void setBankAcctIFSC(String bankAcctIFSC) {
		this.bankAcctIFSC = bankAcctIFSC;
	}
	
	public int getBankAcctPin() {
		return bankAcctPin;
	}
	public void setBankAcctPin(int bankAcctPin) {
		this.bankAcctPin = bankAcctPin;
	}
	
	public String  printBankAccountDetails() {
		return "[" +this.bankAcctNumber+","+this.bankAcctIFSC+ "]";
	}
	
}