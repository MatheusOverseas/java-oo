import java.util.*;
public class TesteContas {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			ContaCorrente cc =  new ContaCorrente(111, 111);
			cc.deposita(100.0);
			
			ContaPoupanca cp = new ContaPoupanca(222, 222);
			cp.deposita(200.0);
			
			cc.transfere(10.0, cp);
			
			
			System.out.println("A sua conta Poupança tem: " + cp.getSaldo());
			System.out.println("A sua conta Corrente tem: " + cc.getSaldo());
			
			sc.close();			
			
		
	}
}
