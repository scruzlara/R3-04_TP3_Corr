
package tp3;

import java.util.Iterator;

/**
 * Exercice 2.b TP3 - Pattern Itérateur
 *
 */
public abstract class Parcours implements Iterator<Integer> {

	protected TableauEntier tab;//Structure à parcourir
		
	protected int ligneCour;	//Ligne courante
		
	protected int colonneCour; 	//Colonne courante
		
	private int nbParcourus;	//Nbre d'éléments déjà parcourus
	
	
	/**
	 * Constructeur - initialisation des attributs
	 * @param Instance de TableauEntier à parcourir
	 */		
	public Parcours(TableauEntier t){
		this.tab=t;
		this.ligneCour=0;
		this.colonneCour=0;
		this.nbParcourus=0;
	}
	
	
	/**
	 * @see java.util.Iterator#hasNext()
	 * @return true si il existe encore des elts à parcourir dans la structure, false sinon
	 */
	@Override
	public boolean hasNext() {
		return tab.getHauteur()*tab.getLargeur() > nbParcourus;
	}

	/**
	 * @see java.util.Iterator#next()
	 * @return la valeur courante dans l'instance de TableauEntier parcouru
	 */
	@Override
	public Integer next() {
		int v=tab.retourne(ligneCour,colonneCour);
		suivant();
		nbParcourus++;
		return v;
	}
	
	/**
	 * Méthode à définir dans les classes concrètes 
	 * Permet de définir le parcours
	 */
	public abstract void suivant();

}
