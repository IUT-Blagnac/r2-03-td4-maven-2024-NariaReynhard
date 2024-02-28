
import java.util.ArrayList;
import java.util.Stack;
import java.util.HashMap;
import java.util.Iterator;

public class TP4Exo {
	public static void main(String[] argv) {
		//1/2
		ArrayList<String> alChaine=new ArrayList<String>();
		//3
		alChaine.add("Naria");
		alChaine.add("Savary");
		alChaine.add("Snow Fox");
		//4
		int taille=alChaine.size();
		System.out.println("Taille : "+taille);
		//5
		for(int i=0;i<taille;i++) {
			System.out.println("Element "+(i+1)+" : "+alChaine.get(i));
		}
		//6
		alChaine.add(2, "The");
		System.out.println("Taille : "+alChaine.size());
		alChaine.add(0,"");
		System.out.println("Taille : "+alChaine.size());
		alChaine.add(5,"aka");
		System.out.println("Taille : "+alChaine.size());
		alChaine.add("Reynhard");
		System.out.println("Taille : "+alChaine.size());
		taille=alChaine.size();
		//7
		for(int i=0;i<taille;i++) {
			System.out.println("Element "+(i+1)+" : "+alChaine.get(i));
		}
		System.out.println("Taille : "+taille);
		//8
		for(int i=0;i<20;i++) {
			alChaine.add(i+" kilom�tres � pied, �a use, �a use.");
		}
		taille=alChaine.size();
		//9
		for(int i=0;i<taille;i++) {
			System.out.println("Element "+(i+1)+" : "+alChaine.get(i));
		}
		System.out.println("Taille : "+taille);
		//10
		alChaine.set(0, "La seule");
		alChaine.set(5, "AKA");
		alChaine.set(8, "A�e");
		alChaine.set(12, "Ouch");
		alChaine.set(21, "null");
		alChaine.set(alChaine.size()-1, "Oops");
		taille=alChaine.size();
		//11
		for(int i=0;i<taille;i++) {
			System.out.println("Element "+(i+1)+" : "+alChaine.get(i));
		}
		System.out.println("Taille : "+taille);
		//12
		System.out.println(alChaine.toString());
		//13
		alChaine.remove(9);
		System.out.println("Taille : "+alChaine.size());
		alChaine.remove(15);
		System.out.println("Taille : "+alChaine.size());
		alChaine.remove(12);
		System.out.println("Taille : "+alChaine.size());
		alChaine.remove(21);
		System.out.println("Taille : "+alChaine.size());
		taille=alChaine.size();
		//14
		alChaine.clear();
		taille=alChaine.size();
		//15
		System.out.println(alChaine.toString());
		System.out.println("Taille : "+taille);
		
		//STACKS
		System.out.println("Exo Stacks");
		
		//1/2
		Stack<String> pileString=new Stack<String>();
		//3
		pileString.push("Naria");
		pileString.push("X");
		pileString.push("Ama");
		//4
		taille=pileString.size();
		System.out.println("Taille : "+taille);
		//5
		System.out.println(pileString);
		//6
		System.out.println(pileString.peek());
		//7
		System.out.println(pileString);
		//8
		String ama=pileString.pop();
		System.out.println(ama);
		//9
		System.out.println(pileString);
		//10
		System.out.println(pileString.peek());
		//11
		System.out.println(pileString);
		//12
		pileString.clear();
		//13
		System.out.println(pileString);	
		//14
		pileString.push("Naria");
		pileString.push("X");
		pileString.push("Ama");
		pileString.push("<3");
		//15
		System.out.println(pileString);	
		//16
		taille=pileString.size();
		for(int i = 0; i<taille;i++) {
			System.out.println(pileString.pop());
		}
		//17
		System.out.println(pileString);	
		//18
		//pileString.peek();
		//Une exception java.util.EmptyStackException est lev�e
		//19
		//pileString.pop();
		//Une exception java.util.EmptyStackException est lev�e
		
		//HASHMAP
		System.out.println("Exo HashMap");
		
		//1/2
		HashMap<String,String> annuaire = new HashMap<String,String>();
		//3
		taille=annuaire.size();
		System.out.println("Taille : "+taille);
		//4
		annuaire.put("Albert","06.45.32.98.45");
		annuaire.put("Michael","06.78.45.12.65");
		annuaire.put("Tartuffe","07.85.25.14.96");
		annuaire.put("Vivagel","05.31.85.15.95");
		//5
		taille=annuaire.size();
		System.out.println("Taille : "+taille);
		//6
		System.out.println(annuaire);
		//7
		String albert = annuaire.get("Albert");
		if(albert!=null)System.out.println("Albert : "+albert);
		else System.out.println("Albert : Absent");
		//8
		String toto = annuaire.get("Toto");
		if(toto!=null)System.out.println("Toto : "+toto);
		else System.out.println("Toto : Absent");
		//9
		String lvivagel = annuaire.get("Vivagel");
		if(lvivagel!=null)System.out.println("Vivagel : "+lvivagel);
		else System.out.println("Vivagel : Absent");
		//10
		String uvivagel = annuaire.get("VIVAGEL");
		if(uvivagel!=null)System.out.println("Vivagel : "+uvivagel);
		else System.out.println("Vivagel : Absent");
		//11
		albert=annuaire.put("Albert", "06.85.58.47.42");
		if(albert!=null)System.out.println("Albert : "+albert);
		else System.out.println("Albert : Absent");
		//12
		albert = annuaire.get("Albert");
		if(albert!=null)System.out.println("Albert : "+albert);
		else System.out.println("Albert : Absent");
		//13
		taille=annuaire.size();
		System.out.println("Taille : "+taille);
		//14
		System.out.println(annuaire);
		//15
		String simon=annuaire.put("Simon", "07.56.98.14.74");
		if(simon!=null)System.out.println("Simon : "+simon);
		else System.out.println("Simon : Absent");
		//16
		simon=annuaire.get("Simon");
		if(simon!=null)System.out.println("Simon : "+simon);
		else System.out.println("Simon : Absent");
		//17
		System.out.println(annuaire);
		//18
		annuaire.clear();
		//19
		taille=annuaire.size();
		System.out.println("Taille : "+taille);
		//20
		System.out.println(annuaire);
		
		/** Questions 5
		 * 5.1)
		 * elementData est un tableau dynamique qui contient les diff�rents �l�ments de l'ArrayList
		 * et size contient le nombre d'�l�ments significatifs du tableau
		 * 
		 * 5.2)
		 * Pour tout les �l�ments de la l'ArrayList ils sont affich�s en majuscules ainsi que leur taille.
		 * 
		 * 5.3)
		 */
		 alChaine.add("Naria");
		 alChaine.add("X");
		 alChaine.add("Ama");
		 alChaine.add("<3");
		 Iterator<String> test = alChaine.iterator();
		 while(test.hasNext()) System.out.println(test.next());
	}
}