/*N�o pode instanciar objetos dessa classe, porque � abstrata*/

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
		
	}
	
	//M�todo sem corpo, n�o h� uma implementa��o desse m�todo.
	public abstract double getBonificacao();
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
