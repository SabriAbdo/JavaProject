package pk1;

public class Admin extends User {
private boolean isAdmin;

public Admin(int id, String nom, String prenom, char sexe, boolean isAdmin) {
	super (nom, prenom, sexe) ; 
	this.isAdmin=isAdmin;
	}
}
