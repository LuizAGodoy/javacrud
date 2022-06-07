package marina;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import marinha.mensagens.mensagens;
import marinha.model.Barco;
import java.util.Scanner;

public class programa {
	
	static EntityManagerFactory emf;
	static EntityManager em;
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		emf = Persistence.createEntityManagerFactory("prj-jpa-sqlite");
		em = emf.createEntityManager();
		
		mensagens.bemvindo();
		mensagens.telainicial();
		
		int check = 0;
		
		while (check != 5) {
			
				if (check != 0) {
				
					mensagens.telainicial();
					
								}
			
		check = leitor.nextInt();

		
		switch (check) {

		case 1:
			incluir();
		break;

		case 2:
			edit();
		break;

		case 3:
			del();
		break;
		
		case 4:
			check();
		break;
		
		case 5:
			mensagens.logoff();
		break;

		default:
			mensagens.invalida();
			mensagens.telainicial();

			}
		
		}
	}
	
	public static void incluir() {
		Scanner leitor = new Scanner (System.in);
		String modelo;
		Double valor;
		
		mensagens.modelo();
		modelo = leitor.nextLine();
		
		mensagens.valor();
		valor = leitor.nextDouble();
		
		Barco barcoIncluir = new Barco();
		barcoIncluir.setModelo(modelo);
		barcoIncluir.setValor(valor);
		
		salvar(barcoIncluir);
		
		mensagens.cadastrado();
		
		return;
		
	}
	
	public static void edit() {
		Scanner leitor = new Scanner (System.in);
		int id;
		Double valor;
		
		mensagens.altvalor();
		id = leitor.nextInt();
		
		mensagens.nvalor();
		valor = leitor.nextDouble();
		
		Barco barcoEditar = localizar(id);
		barcoEditar.setValor(valor);
		
		atualizar(barcoEditar);
		
		mensagens.valoralt();
		
		return;
		
	}
	
	public static void del() {
		Scanner leitor = new Scanner (System.in);
		int id;
		

		mensagens.idex();
		id = leitor.nextInt();

		
		Barco barcoEditar = localizar(id);
		apagar(barcoEditar.getId());
		mensagens.iddel(id);
		return;
		
	}
	
	public static void check() {
		Scanner leitor = new Scanner (System.in);
		int id;
		String barco;
		Double valor;
		
		mensagens.idcheck();
		id = leitor.nextInt();

		
		Barco barcoEditar = localizar(id);
		barco = barcoEditar.getModelo();
		valor = barcoEditar.getValor();
		mensagens.idconsulta(id, barco, valor);
		return;
		
	}
	
	public static Integer salvar(Barco barco) {
		em.getTransaction().begin();
		em.persist(barco);
		em.getTransaction().commit();
		return barco.getId();
	}
	
	public static void atualizar(Barco barco) {
		em.getTransaction().begin();
		em.merge(barco);
		em.getTransaction().commit();
	}
	
	public static Barco localizar(Integer id) {
		Barco barco = em.find(Barco.class, id);
		return barco;
	}
	
	public static void apagar(Integer id) {
		Barco barco = em.find(Barco.class, id);
		em.getTransaction().begin();
		em.remove(barco);
		em.getTransaction().commit();
	}

}
