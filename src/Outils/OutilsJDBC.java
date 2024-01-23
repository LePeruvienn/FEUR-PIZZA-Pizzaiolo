package Outils;

import java.sql.*;

public class OutilsJDBC {
	
	public static Connection openConnection(String url, String user, String password) {
		Connection co = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			co = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("Il manque le driver MySQL.");
			System.exit(1);
		} catch (SQLException e) {
			System.out.println("Impossible de se connecter à l'URL : " + url);
			System.exit(1);
		}
		return co;
	}
	
	public static ResultSet exec1Requete(String requete, Connection co, int type) {
		ResultSet res = null;
		
		try { 
			Statement st;
			
			if (type == 0) {
				st = co.createStatement();
			} else {
				st = co.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			}
			
			res = st.executeQuery(requete);
		} catch (SQLException e) {
			System.out.println("Problème lors de l'exécution de la requête : " + requete);
		}
		
		return res;
	}
	
	public static void closeConnection(Connection co) {
		try {
			co.close();
			System.out.println("Connexion fermée!");
		} catch (SQLException e) {
			System.out.println("Impossible de fermer la connexion");
		}
	}
}
