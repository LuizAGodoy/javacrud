package marinha.mensagens;

public class mensagens {
	
	public static void bemvindo() {
		
		System.out.println("***********************************");
		System.out.println("*  Bem vindo a Marina Positivo!   *");
		System.out.println("***********************************");
		
	}
	
	public static void telainicial() {
		
		System.out.println("***********************************");
		System.out.println("*    Digite a opção desejada!     *");
		System.out.println("*                                 *");
		System.out.println("* 1 - Cadastrar um novo Barco     *");
		System.out.println("* 2 - Alterar Valor               *");
		System.out.println("* 3 - Excluir cadastro            *");
		System.out.println("* 4 - Consultar cadastro          *");
		System.out.println("* 5 - Sair                        *");
		System.out.println("***********************************");
		
		return;
		
	}
	
	public static void invalida() {
		
		System.out.println("***********************************");
		System.out.println("* Opção Invalida!                 *");
		System.out.println("***********************************");
		
	}
	
	public static void logoff() {
		
		System.out.println("***********************************");
		System.out.println("* Logoff!                         *");
		System.out.println("***********************************");
		
	}
	
	public static void modelo() {
		
		System.out.println("***********************************");
		System.out.println("* Digite o Modelo                 *");
		System.out.println("***********************************");
		
	}
	
	public static void valor() {
		
		System.out.println("***********************************");
		System.out.println("* Digite o Valor                  *");
		System.out.println("***********************************");
		
	}
	
	public static void cadastrado() {
		System.out.println("***********************************");
		System.out.println("* Barco Cadastrado!               *");
		System.out.println("***********************************");

	}
	
	public static void altvalor() {
		System.out.println("*********************************************");
		System.out.println("* Digite o ID do Barco para alterar o valor *");
		System.out.println("*********************************************");

	}
	
	public static void nvalor() {
		System.out.println("***********************************");
		System.out.println("* Digite o Novo Valor             *");
		System.out.println("***********************************");
	}
	
	public static void valoralt() {
		System.out.println("***********************************");
		System.out.println("* Valor Alterado!");
		System.out.println("***********************************");
	}
	
	public static void idex() {
		System.out.println("*************************************");
		System.out.println("* Digite o ID do Barco para excluir!*");
		System.out.println("*************************************");

	}
	public static void iddel(int id) {
		System.out.println("***********************************");
		System.out.println("* ID " + id + " Deletado!");
		System.out.println("***********************************");

	}
	
	public static void idcheck() {
		System.out.println("***************************************");
		System.out.println("* Digite o ID do Barco para Consulta! *");
		System.out.println("***************************************");

	}
	
	public static void idconsulta(int id, String barco, Double valor) {
		System.out.println("***********************************");
		System.out.println("* ID " + id);
		System.out.println("* Barco " + barco);
		System.out.println("* Valor R$ " + valor);
		System.out.println("***********************************");

	}
	
	
	
}

