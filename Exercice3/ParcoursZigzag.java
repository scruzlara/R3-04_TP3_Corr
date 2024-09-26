/**
 * 
 */
package tp3;

/**
 *  Exercice 3.5 TP3 - Pattern Itérateur
 *
 */
public class ParcoursZigzag extends Parcours {

	public ParcoursZigzag(TableauEntier t){
		super(t);
	}
	
	/**
	 * @see tp3.Parcours#suivant()
	 */
	@Override
	public void suivant() {
		if( this.ligneCour%2==0){
			if(this.colonneCour < tab.getLargeur()-1)
				this.colonneCour ++;
			else
				if(this.ligneCour <tab.getHauteur()-1){
					this.ligneCour ++;
				}
		}
		else{
			if(this.colonneCour > 0)
				this.colonneCour --;
			else
				if(this.ligneCour <tab.getHauteur()-1){
					this.ligneCour ++;
				}
		}
			

	}

}
