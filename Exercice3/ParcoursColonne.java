package tp3;

/**
 *  Exercice 3.7 TP3 - Pattern Itérateur
 *
 */
public class ParcoursColonne extends Parcours {

	public ParcoursColonne(TableauEntier t){
		super(t);
	}
	
	@Override
	public void suivant() {
		if( this.ligneCour < tab.getHauteur()-1)
			this.ligneCour ++;
	else
			if(this.colonneCour <tab.getLargeur()-1){
				this.colonneCour ++;
				this.ligneCour=0;
			}

	}

}
