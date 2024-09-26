
package tp3;

/**
 * Exercice 3.1 et 3.4, 3.6 TP3 - Pattern It�rateur
 *
 */
public class TableauEntier {

	private int[][] val;
	private int largeur;
	private int hauteur;
	
	
	public TableauEntier(int[][] t){
		this.val=t;
		this.largeur=t[0].length;
		this.hauteur=t.length;
	}
	
	int retourne(int l, int c){
		return val[l][c];
	}
	
	int getLargeur(){
		return this.largeur;
	}
	
	int getHauteur(){
		return this.hauteur;
	}
	
	Parcours iterateurLigne(){
		return new ParcoursLigne(this);
	}
	
	Parcours iterateurZigzag(){
		return new ParcoursZigzag(this);
	}
	
	Parcours iterateurColonne(){
		return new ParcoursColonne(this);
	}
}
