package pos_java_jdbc.pos_java_jdbc;


import java.util.List;

import org.junit.Test;

import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@Test
	public void initTestes() {
		/***TESTE DA CONEXAO */
		//SingleConnection.getConnection(); 
		
		/***TESTE DE INSERT */
	/*	UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(4L);
		userposjava.setNome("Adolfo");
		userposjava.setEmail("adolfo.landgraf@gmail.com");
		
		userPosDAO.salvar(userposjava); // Chamou o metodo salvar do DAO e passou o model dentro*/
		
		/***TESTE DE LISTAR */

		/*	UserPosDAO userPosDAO = new UserPosDAO();
			try {
				List<Userposjava> list = userPosDAO.listar();
				
				for (Userposjava userposjava : list) {
					System.out.println(userposjava);
					System.out.println("--------------------------------");
					
				}

				
			} catch (Exception e) {
			e.printStackTrace();
			} 
*/

	/*** METODO PARA BUSCAR 1 ID DA LISTA*/
	/*	UserPosDAO dao = new UserPosDAO();
		try {
			Userposjava userposjava = dao.buscar(2L);
			System.out.println(userposjava);
		} catch (Exception e) {
			e.printStackTrace();
		} */
		
		/***METODO PARA ATUALIZAR DADO*/
		
		try {
			UserPosDAO dao = new UserPosDAO();
			Userposjava objetoBanco = dao.buscar(4L);
			objetoBanco.setNome("Adolfo");
			dao.atualizar(objetoBanco);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
} 
