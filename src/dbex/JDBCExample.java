package dbex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Properties;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class JDBCExample {

	public static void main(String args[]) throws SQLException {

		// Exemplo: MySQL
		//String url = "jdbc:mysql://localhost:3306/test";
		String url = "jdbc:mysql://localhost:3306/natixishr";
		Properties props = new Properties();
		props.setProperty("user", "root");
		props.setProperty("password", "");
		Connection conn = DriverManager.getConnection(url, props);
		// execute query without PreparedStatement
		// ResultSet result = stmt.executeQuery(sql);
		
		Statement stmt = (Statement) conn.createStatement();

		int userChoice;
		int stop = 1;

		/*********************************************************/

		do {
			userChoice = Menu.menu();
			switch (userChoice) {
			case 1:
				System.out.println("Inserir Registo");
				insert(stmt);
				break;
			case 2:
				System.out.println("Apagar registo ");
				delete(stmt);
				break;
			case 3:
				System.out.println("Atualizar registo");
				update(stmt);
				break;
			case 4:
				System.out.println("Selecionar registo");
				select(stmt);
				break;
			default:
				System.out.println("Terminar");
				stop = 0;
			}

		} while (stop == 1);

		// from here you can either use a switch statement on the userchoice
		// or you use a while loop (while userChoice != the fourth selection)
		// using if/else statements to do your actually functions for your choices.
		System.out.println();
		String sql = "select BI, nome, morada from funcionarios";
		// creating PreparedStatement object to execute query
		PreparedStatement preStatement = conn.prepareStatement(sql);
		ResultSet result = preStatement.executeQuery();
		int nr = 0;
		while (result.next()) {
			nr++;
			System.out.println("Result : " + result.getString("BI") + ": " + result.getString("nome") + " -> "
					+ result.getString("morada"));
		}
		System.out.println("Number of Rows: " + nr);
		System.out.println("done!");

	}

	public static void insert(Statement stmt) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("indique o nome");
		String name = scanner.nextLine();
		System.out.println("indique a morada");
		String street = scanner.nextLine();
		System.out.println("indique a categoria");
		String cat = scanner.nextLine();
		System.out.println("indique a função");
		String func = scanner.nextLine();
		System.out.println("indique a data de Nascimento: aaaa/mm/dd");
		String data = scanner.nextLine();
		System.out.println("indique o BI");
		int bi = scanner.nextInt();
		String sql = String.format("INSERT INTO funcionarios(BI,nome,dataNascimento,morada,categoria,funcao) " + 
		"VALUES (%d, '%s', '%s','%s','%s','%s')", bi, name, data, street,cat,func );
		// System.out.println(sql);
		stmt.executeUpdate(sql);
	}

	public static void delete(Statement stmt) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("indique o BI do funcionario a apagar");
		int nif = scanner.nextInt();
		String sql = String.format("DELETE FROM funcionarios WHERE BI = %d", nif);
		stmt.executeUpdate(sql);
	}

	public static void update(Statement stmt) {

	}

	public static void select(Statement stmt) throws SQLException {
		String sql = "select BI, nome, morada from funcionarios";
		// creating PreparedStatement object to execute query
		ResultSet result = stmt.executeQuery(sql);
		//falta mostrar
	}

}
