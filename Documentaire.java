package ds_2020;

public class Documentaire extends film{
private String sujet;
private float tarif=2;
private static int compture=0;
public Documentaire() {
	super();
}
public Documentaire(String titre,String realisateur,String pays,int duree, String sujet) {
	super(titre,realisateur,pays,duree);
	compture++;	
	this.sujet=sujet;
}

public String toString() {
	return this.titre +" de "+this.realisateur+" "+this.pays+" "+this.duree+"min "+this.sujet+" "+getPlace();
}

public float totalVenteBillets() {
	return tarif* getPlace();
}
	
}
