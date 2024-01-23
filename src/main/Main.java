package main;

import vue.*;

import java.sql.Connection;

import Outils.OutilsJDBC;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("PROJET JAVA INTERFACE PIZZAIOLO");
		
		System.out.println("Connexion ...");
		
		 Connection co = OutilsJDBC.openConnection("jdbc:mysql://projets.iut-orsay.fr:3306/saes3-apinel2","saes3-apinel2","d1aH5aFtE//kSLwK");
		 
		 //Connection co = OutilsJDBC.openConnection("jdbc:mysql://webdev.iut-orsay.fr:3306/apinel2","apinel2","uN=<_fy&~{_3cyO=i2>l");
		
		 System.out.println("Connexion réussi :)");
		 
		 OutilsJDBC.closeConnection(co);
		 
		//FenetrePrincipale mv = new FenetrePrincipale();
		//mv.setVisible(true);
	}
	
}
