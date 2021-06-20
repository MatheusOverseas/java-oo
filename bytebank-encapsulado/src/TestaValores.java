
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("Numero da conta: " + conta.getNumero());
		System.out.println("O total de contas é: " + conta.getTotal());
		
		
		Conta conta2 = new Conta(1337, 216692);
		
		System.out.println("Agencia: " + conta2.getAgencia());
		System.out.println("Numero da conta: " + conta2.getNumero());
		System.out.println("O total de contas é: " + conta2.getTotal());
		
	}
}
