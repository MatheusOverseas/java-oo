
public class TesteSacaValoresNegativos {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.deposita(100);
		boolean testaSaca = conta.saca(200);
		System.out.println(testaSaca);
		
		System.out.println(conta.getSaldo());
	}
}
