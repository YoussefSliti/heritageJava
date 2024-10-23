package ds_2020;

import java.util.Scanner;

public class film {
protected String titre;
protected String realisateur;
protected String pays;
protected int duree;
protected int place;
Scanner scanner=new Scanner(System.in);
public film() {
	
}
public film(String titre,String realisateur,String pays,int duree) {
	this.titre=titre;
	this.realisateur=realisateur;
	this.pays=pays;
	this.duree=duree;
	
	
}
public float totalVenteBillets() {
	
	int x=scanner.nextInt();
	while(x>this.place || x<0)
		 x=scanner.nextInt();
	int builletP=this.place-x;
	
	return x*2 +builletP*3;
}
 public  int getPlace() {
	 return this.place;
 }
 public void setNbPlace(int place) {
	 this.place=place;
 }
 
 public String toString() {
	 return this.titre +" de "+this.realisateur+" ("+this.pays+") - "+this.duree+"min "+this.place ;
	}
 
}
