package Models;



public class Lion   extends Prédateur implements LionAction{
	
	private FacteurDomination facteurDomination ;
	private RangDomination rangDomination ;
	private int facteurImpetiosite ;
			
	enum FacteurDomination {dominant ,nonDominant };	
	enum RangDomination {APLHA ,BETA ,GAMA ,OMEGA}		;

	public Lion() {
		super() ;
	}
	

	public Lion(FacteurDomination facteurDomination, RangDomination rangDomination, int facteurImpetiosite,String sexe, Categorie categorie, int force, GroupeorSolitraire groupeorSolitraire,Nourriture nourriture, Son son) {
		super(sexe,  categorie,  force,  groupeorSolitraire, nourriture,  son);
		this.facteurDomination = facteurDomination;
		this.rangDomination = rangDomination;
		this.facteurImpetiosite = facteurImpetiosite;
	}

	public void seNourrir() {
		super.setNourriture(Nourriture.viande);
		
	}

	public void chasser() {	
		super.setGroupeorSolitraire(GroupeorSolitraire.groupe);	
	}

	public void emettreunSon() {
		super.setSon(Son.rugit);
		
	}

	@Override
	public void courrir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seReproduire() {
		// TODO Auto-generated method stub
		
	}


	public String[] AfficherCaracteristiques() {
		// TODO Auto-generated method stub
		return null;
	}

	public void rugir() {
		// TODO Auto-generated method stub
		
	}
	public void entendreSon(boolean avalable) {
		// TODO Auto-generated method stub
		
	}

	public void seSeparerGroup() {
		// TODO Auto-generated method stub
		
	}
	
	public String[] afficherCaracteristiques() {
		// TODO Auto-generated method stub
		return null;
	}


	public FacteurDomination getFacteurDomination() {
		return facteurDomination;
	}

	public void setFacteurDomination(FacteurDomination facteurDomination) {
		this.facteurDomination = facteurDomination;
	}



	public RangDomination getRangDomination() {
		return rangDomination;
	}


	public void setRangDomination(RangDomination rangDomination) {
		this.rangDomination = rangDomination;
	}


	public int getFacteurImpetiosite() {
		return facteurImpetiosite;
	}
	public void setFacteurImpetiosite(int facteurImpetiosite) {
		this.facteurImpetiosite = facteurImpetiosite;
	}


	
}
