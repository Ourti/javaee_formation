package collaborationWorker;

import java.util.concurrent.atomic.AtomicInteger;

public class CompteurCommun {
	
	//private int compteur;
	// les types Atomic* sont des types sp�ciaux pr�vu pour des acc�s en parallele
	// et optimis� pour cela
	private AtomicInteger compteur;

	public CompteurCommun(int compteur) {
		this.compteur = new AtomicInteger(compteur);
	}

	// synchronized permet de specifier une section de code "critique"
	// qui ne doit pas etre executer par plusieurs thread en m�me temps
	// chaque thread attendra son tour
	public /*synchronized*/ void incrementeCompteur() {
		//synchronized (this) {
			this.compteur.incrementAndGet();	
		//}
		
	}
	@Override
	public String toString() {
		return "CompteurCommun [compteur=" + compteur + "]";
	}
	

}
