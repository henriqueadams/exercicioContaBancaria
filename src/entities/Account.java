package entities;

public class Account {
	
	private String holder;
	private int number;
	private double balance;
	
	public Account(String holder, int number) {
		this.holder = holder;
		this.number = number;
	}

	public Account(String holder, int number, double initialDeposit) {
		super();
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit); // feito desse jeito chamando a operaçao deposito para caso fosse mudado os valores do 
	}							// deposito no futuro, precisaria apenas mudar na operacao e nao aqui tbm

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {		//pode ser alterado, dados como o numero da conta que n podem ser alterados
		this.holder = holder;					// nao possuem set, apenas o get
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public String toString(){
		return "Account "
			  + number
			  +", Holder: "
			  + holder
			  +", Balance: $ "
			  + String.format("%.2f", balance);
	}
}
