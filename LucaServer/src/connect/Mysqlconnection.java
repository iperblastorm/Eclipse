package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import datiDiGioco.DatiDiGioco.protocol1;

public class Mysqlconnection {

	private String indirizzo = "100.82.201.121";
	private String porta = "3306";
	private String database = "Luca_Game";
	private String User = "luca";
	private String pass = "041090";

	private String url = "jdbc:mysql://" + indirizzo + ":" + porta + "/" + database;
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;

	public Mysqlconnection() {
		try {
			connection = DriverManager.getConnection(url, User, pass);
			System.out.println("Connessione al db OK");

			statement = connection.createStatement();

		} catch (SQLException ex) {
			System.err.println("Errore db" + ex);
			}
	}

	public protocol1 searchPersonaggi(String nomePg){
		
		protocol1 risultato = null ;
		
		try {
			String sql = "SELECT id, level, class " + 
					     "FROM personaggi " + 
					     "WHERE nome ='" + nomePg + 
					     "';";
			
			resultset = statement.executeQuery(sql);
			resultset.next();
			
			risultato = new protocol1(resultset.getShort("id"), resultset.getByte("level"), resultset.getByte("class"));

		} catch (SQLException eX) {
			System.err.println("Errore sql" + eX);
		}
		
		return risultato;
	}
	
	public void statistic(int id) {
		try {
			String sql = "SELECT forza, agilita, intelletto, spirito, attacco, difesa "+
						 "FROM statistichePg "+
						 "WHERE id = '"+ id +
						 "';";
			
			resultset = statement.executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
