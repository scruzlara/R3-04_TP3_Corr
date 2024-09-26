
package tp3;

import java.util.Iterator;

/**
 * Exercice 2.b TP3 - Pattern It�rateur
 *
 */
public abstract class Parcours implements Iterator<Integer> {

	protected TableauEntier tab;//Structure � parcourir
		
	protected int ligneCour;	//Ligne courante
		
	protected int colonneCour; 	//Colonne courante
		
	private int nbParcourus;	//Nbre d'�l�ments d�j� parcourus
	
	
	/**
	 * Constructeur - initialisation des attributs
	 * @param Instance de TableauEntier � parcourir
	 */		
	public Parcours(TableauEntier t){
		this.tab=t;
		this.ligneCour=0;
		this.colonneCour=0;
		this.nbParcourus=0;
	}
	
	
	/**
	 * @see java.util.Iterator#hasNext()
	 * @return true si il existe encore des elts � parcourir dans la structure, false sinon
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
	 * M�thode � d�finir dans les classes concr�tes 
	 * Permet de d�finir le parcours
	 */
	public abstract void suivant();

}
