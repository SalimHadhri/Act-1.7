package Models;



public abstract class Prédateur implements PredateurAction {
	
	private String sexe ;
	private  Categorie categorie;
	private int force ;
	private GroupeorSolitraire groupeorSolitraire;
	private Nourriture nourriture ;
	private Son son ;
	enum GroupeorSolitraire {groupe ,solitaire };
	
	enum Nourriture {viande,omnivore};
	enum Categorie {jeune , adulte, vieux };	
	enum Son {rugit,hurle};

	public abstract void seNourrir();

	public abstract void chasser();

	public abstract  void emettreunSon() ;
	
	public void courrir() {
		// TODO Auto-generated method stub
		
	}

	public void seReproduire() {
		// TODO Auto-generated method stub
		
	}

	public Prédateur() {
	}
	

	public Prédateur(String sexe, Categorie categorie, int force, GroupeorSolitraire groupeorSolitraire,
			Nourriture nourriture, Son son) {
		this.sexe = sexe;
		this.categorie = categorie;
		this.force = force;
		this.groupeorSolitraire = groupeorSolitraire;
		this.nourriture = nourriture;
		this.son = son;
	}

	public GroupeorSolitraire getGroupeorSolitraire() {
		return groupeorSolitraire;
	}


	public void setGroupeorSolitraire(GroupeorSolitraire groupeorSolitraire) {
		this.groupeorSolitraire = groupeorSolitraire;
	}

	public Son getSon() {
		return son;
	}

	public void setSon(Son son) {
		this.son = son;
	}

	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}


	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Nourriture getNourriture() {
		return nourriture;
	}


	public void setNourriture(Nourriture nourriture) {
		this.nourriture = nourriture;
	}
		

}
