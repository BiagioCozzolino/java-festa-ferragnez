package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {

		String[] listaInvitati = {
				"Dua Lipa",
				"Paris Hilton",
				"Manuel Agnelli",
				"J-Ax",
				"Francesco Totti",
				"Ilary Blasi",
				"Bebe Vio",
				"Luis",
				"Pardis Zarei",
				"Martina Maccherone",
				"Rachel Zeilic"
		};
		String nomeInserito;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Benvenuto alla festa dei Ferragnez!, prego dimmi il tuo nome per verificare l'invito : ");
		nomeInserito = scan.nextLine();
		
		boolean invitato = false;
		int counter = 0;
		while (invitato == false && counter < listaInvitati.length) {
			if (listaInvitati[counter].equals(nomeInserito)){
				invitato = true;
				System.out.println("Salve Sing./Sig.ra " + nomeInserito +" lei può entrare alla festa dei Ferragnez!");
				
			}else {
				counter++;
			}
		}
		
	}
}
