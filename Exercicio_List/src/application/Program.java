package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea uma lista
		List <String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//inserir elemento na posicao 2
		list.add(2, "Marco"); //entro en la lista
		
		//Ver tamanho da lista
		System.out.println(list.size());
		
		//Remover um elemento da lista
		//list.remove("Anna"); //Anna es otra instancia.. compara quien tiene Anna
		
		
		//Imprimir usando for each
		for(String x:list) { 
			System.out.println(x);
		}
		
		//Remover um elemento en uma dada posicao
		//list.remove(1);		
		System.out.println("---------------------------------");
		//Remover Predicado
		list.removeIf(x -> x.charAt(0)=='M');
		for(String x:list) { 
			System.out.println(x);
		}
		System.out.println("---------------------------------");
		//Posicao do um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("---------------------------------");
		//Filtrar nueva list los nombres que empiezan con A
		List<String> resultado = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
		for(String x:resultado) { 
			System.out.println(x);
		}
		System.out.println("---------------------------------");
		//Filtrar en una nueva lista el nombre primero en aparecer con A
		String primeroConA = list.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null);
		System.out.println(primeroConA);
	}

}
