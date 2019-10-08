package gui;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import dados.Deck;
import dados.Mao;

public class Main {

	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		
//		Deck x = new Deck(1);		
//	
//		System.out.println(x.getArray().size());
//		Collections.shuffle(x.getArray());
//		Collections.shuffle(x.getArray());
//		Collections.shuffle(x.getArray());
//		System.out.println(x.getArray().toString());
//		
//		System.out.println(x.escolher());
//		System.out.println(x.escolher());
//		System.out.println(x.escolher());
//		System.out.println(x.escolher());
//		System.out.println(x.escolher());
//		System.out.println(x.escolher());
//		System.out.println(x.escolher());
//		System.out.println(x.escolher());
//		
//		System.out.println(x.getArray().size() + x.getArray().toString() );
		
		int escolha;
		
		int x = 9;
		Mao mao1 = new Mao();
		Deck baralhos;
	
		System.out.println("Vamos jogar :\nCom quantos decks vocês quer jogar ?!");
		baralhos = new Deck(ler.nextInt());
		
		while(x < 10) {
					
			System.out.println("1 - Receber | 2 - Parar");			
			escolha = ler.nextInt();
			
			switch(escolha) {
			
			case 1:
				mao1.receber(baralhos);				
				break;
				
			case 2:
				
				break;
			
			
			
			
			
			
			}
			
			
			System.out.println("Seus pontos: "+mao1.getPontos());
			
			
			
			
			
			
			
			
		}
		
		
	
	
	
	
	
	
	}
}
