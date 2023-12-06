package pk1;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Division {
    private User[] users; 

    public Division(User[] U1) {
        users =  U1;
    }
    
    public void sortList()
    {
    	List<User> UL = Arrays.asList(users);
    	Collections.sort(UL);
    	users = UL.toArray(new User[UL.size()]);
    	
    }
    
    public void ajouterElement(User U1)
    {
    	List<User> UL = Arrays.asList(users);
    	UL.add(U1);
    	users = UL.toArray(new User[UL.size()]);
    }
    
    public void supprimerElement(int position)
    {
    	List<User> UL = Arrays.asList(users);
    	UL.remove(position);
    	users = UL.toArray(new User[UL.size()]);
    }
    
    public int countElements()
    {
    	List<User> UL = Arrays.asList(users);
    	return UL.size();
    }
    
    public void inverser()
    {
    	List<User> UL = Arrays.asList(users);
    	Collections.reverse(UL);
    	users = UL.toArray(new User[UL.size()]);
    }
    
    public  void afficherElements() {
        for (User user : users) {
            System.out.println(user);
        }
    }
    
    public boolean egaliteTableaux(User[] U1)
    {
    	return Arrays.equals(users , U1);
    }
    
}
