package pk1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DivisionList {

	ArrayList<User> users = new ArrayList<>();
	
	public void alimenterListe() {
        users.add(new User("Nom1", "Prenom1", 'M'));
        users.add(new User("Nom2", "Prenom2", 'F'));
        users.add(new User("Nom3", "Prenom3", 'F'));
    }
	
	public void afficherListe() {
        for (User user : users) {
            System.out.println("User :"+user);
        }
    }
	
	public void parcourir() {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.println("Current User :" + user);
        }
    }
	
	
	public void inserer(User U1) {
        users.add(U1);
    }
	
	 public User recuperer(int position) {
	        
		 User U1 = users.get(position);
		 return U1;
	 }
	 
	 public void supprimer(User U1) {
	        users.remove(U1);
	    }
	 
	 public boolean rechercher(User U1) {
	        return users.contains(U1);
	    }
	 
	  public void trier() {
	        Collections.sort(users);
	    }
	  
	  public List<User> copier() {
	        return new ArrayList<>(users);
	    }
	  
	  public void melanger() {
	        Collections.shuffle(users);
	    }
	  
	  public void inverser() {
	        Collections.reverse(users);
	    }
	  
	  public List<User> extraireSegment(int debut, int fin) {
	        return users.subList(debut, fin);
	    }
	  
	  public boolean comparerListes(List<User> UL) {
	        return users.equals(UL);
	    }
	  
	  public void echangerUsers(int pos1, int pos2) {
	        Collections.swap(users, pos1, pos2);
	    }
	  
	  public void viderListe() {
	        users.clear();
	    }
	  
	  public boolean estVide() {
	        return users.isEmpty();
	    }
}
