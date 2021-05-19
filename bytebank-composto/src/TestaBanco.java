
public class TestaBanco {
	public static void main(String[] args) {
		Cliente matheus = new Cliente();	
		matheus.nome = "Matheus Cunha";
		matheus.cpf = "404.882.778-25";
		matheus.profissao = "Programador";
		
		Conta contaDoMatheus = new Conta();
		contaDoMatheus.deposita(100);
		
		//Associa o cliente matheus a conta contaDoMatheus
		contaDoMatheus.titular = matheus;
		
		System.out.println(contaDoMatheus.titular.nome);
		System.out.println(contaDoMatheus.titular.cpf);
		System.out.println(contaDoMatheus.titular.profissao);
	}
}	
