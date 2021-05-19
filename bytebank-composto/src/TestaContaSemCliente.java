
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		
		//Associando a contaDaMarcela a cliente marcela
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.titular.nome = "Marcela";
		contaDaMarcela.titular.cpf = "011.129.128-37";
		contaDaMarcela.titular.profissao = "Cozinheira";
		
		System.out.println(contaDaMarcela.titular.nome);
		System.out.println(contaDaMarcela.titular.cpf);
		System.out.println(contaDaMarcela.titular.profissao);
	}
}
