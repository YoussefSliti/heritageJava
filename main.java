package ds_2020;

public class main {

	public static void main(String[] args) {
		Jcc jcc=new Jcc(2021,2);
		Documentaire D=new Documentaire("le dernier refuge","Ousman","Mali",86,"la guerre civil");
		film F=new film("Insurrection","jilani saadi","tunisie",105);
		F.setNbPlace(45);
		D.setNbPlace(4);
		System.out.println(F.totalVenteBillets()+"DT");
		jcc.ajoutFilm(D);
		jcc.listeFilmsJcc();
		jcc.ajoutFilm(F);
		jcc.listeFilmsJcc();
		
		
		System.out.println("----=============-");
		float money=jcc.totalVenteBilletsJCC();
		System.out.println("-----"+money);
		
	}

}
