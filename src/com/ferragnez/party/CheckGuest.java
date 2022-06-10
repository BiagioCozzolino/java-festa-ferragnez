package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {

		// Inizio array e variabili
		String[] listaInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
				"Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
		String nomeInserito;

		// Inizio sezione immissione nome
		Scanner scan = new Scanner(System.in);

		System.out.println("Benvenuto alla festa dei Ferragnez!, prego dimmi il tuo nome per verificare l'invito : ");
		nomeInserito = scan.nextLine();

		// Inizio sezione verifica invitato
		boolean invitato = false;
		int counter = 0;

		/*
		 * while (invitato == false && counter < listaInvitati.length) { if
		 * (listaInvitati[counter].equalsIgnoreCase(nomeInserito)){ invitato = true;
		 * System.out.println("Salve Sing./Sig.ra " + nomeInserito
		 * +" lei può entrare alla festa dei Ferragnez!");
		 * 
		 * }else { counter++; } } 
		 * if(!invitato) { System.out.
		 * println("Mi dispiace lei non risulta invitato alla festa dei Ferragnez, è pregato di andarsene."
		 * );
		 * 
		 * }
		 */

		// Bonus con For

		for (counter = 0; counter < listaInvitati.length; counter++) {

			if (listaInvitati[counter].equalsIgnoreCase(nomeInserito)) {
				invitato=true;
				System.out.println("Salve Sing./Sig.ra " + nomeInserito + " lei può entrare alla festa dei Ferragnez!");
			}
				 

		}
		if(!invitato) { 
			System.out.println("Mi dispiace lei non risulta invitato alla festa dei Ferragnez, è pregato di andarsene.");
		}
	}
}
