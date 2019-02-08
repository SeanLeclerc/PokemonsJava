package lab07;
import logdm.utilitaires.*;

public class testeur {

	public static void main(String[] args) {
		Visionneur v = new Visionneur(
				true,      //Avec grille
				21,        //Nombre de colonne
				11,        //Nombre de rengers
				666,       //Inutile
				true,      //Avec console?
				Visionneur.GRAPHIQUE,
				Visionneur.MOYENNE );
		int code = v.lireInt("Code Image:", 70);
		for( int i=0 ; i<21 ;i++) {
			v.placerPokemon(i,0,code);
			v.effacer( 5 , 0);
			
		}
				
		      
	}

}
