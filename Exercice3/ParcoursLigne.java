
package tp3;

/**
 *  Exercice 3.4 TP3 - Pattern It�rateur
 *
 */
public class ParcoursLigne extends Parcours {

	public ParcoursLigne(TableauEntier t){
		super(t);
	}

	/**
	 * @see tp3.Parcours#suivant()
	 */
	@Override
	public void suivant() {
		if(this.colonneCour < tab.getLargeur()-1)
		{
			//System.out.print(tab.retourne(this.ligneCour, this.colonneCour));
			System.out.print(colonneCour);
			this.colonneCour ++;
		}
		else if(this.ligneCour < tab.getHauteur()){
			//System.out.print(tab.retourne(this.ligneCour, this.colonneCour));
			System.out.print(colonneCour);
			this.ligneCour ++;
			this.colonneCour=0;
			System.out.println();
		}
	}

}
