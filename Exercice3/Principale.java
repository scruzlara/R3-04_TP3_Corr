package tp3;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcours p;
		TableauEntier te;
		int tab[][] = new int[5][5];
		te = new TableauEntier(tab);
		p = te.iterateurLigne();
		while (p.hasNext()) {
			p.next();
		}
	}

}
