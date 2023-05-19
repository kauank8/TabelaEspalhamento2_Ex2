package controller;

import java.util.Random;

import br.com.KauanPaulino.ListaInt.Lista_Int;

public class TabelaController {
	Lista_Int[] vtlista=new Lista_Int[2];
	
	public TabelaController() {
		for(int i=0;i<2;i++) {
			vtlista[i]=new Lista_Int();
		}
	}
	public void GeraTabela() {
		Random Gerador = new Random();
		int qtd=Gerador.nextInt(10)+1;
		for(int i=0;i<qtd;i++) {
			int n=Gerador.nextInt(20)+1;
			int hash=Hash(n);
			if(vtlista[hash].isEmpty()) {
			vtlista[hash].addFirst(n);
			}else {
				try {
					vtlista[hash].addLast(n);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		Mostra();
	}
	
	
	private void Mostra() {
		int tamanhoP=vtlista[0].size();
		int tamanhoI=vtlista[1].size();
		System.out.println("Par");
		for(int i=0;i<tamanhoP;i++) {
			try {
				int n=vtlista[0].get(i);
				System.out.print(n+" ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("\n");
		System.out.println("Impar");
		for(int i=0;i<tamanhoI;i++) {
			try {
				int n=vtlista[1].get(i);
				System.out.print(n+" ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private int Hash(int n) {
		int pos = n%2;
		return pos;
	}
}
