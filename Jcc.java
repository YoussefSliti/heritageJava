package ds_2020;

public class Jcc extends film{
private int annee;
private final int NBFMAX=30;
private film[] competition;
private static int nbF;

public Jcc(int anne,int taille) {
	if(taille<NBFMAX) {
		this.nbF=0;	
		this.annee=anne;
		this.competition=new film[taille];
	}
	else {
		System.out.println("error");
	}
}
public void ajoutFilm(film f) {
	if(nbF>=competition.length) {
		System.out.println("error le tableau saturee");
	}
	else {
		competition[nbF]=f;
		nbF++;
	}
}
public void listeFilmsJcc() {
	for(int i=0;i<nbF;i++) {
		System.out.println((i+1)+" "+competition[i].toString());
	}
}
public float totalVenteBilletsJCC() {
	float total = 0;
    for(int i=0;i<nbF;i++){
        total=total+competition[i].totalVenteBillets();
    }
    return total;
}

}