package pk1;


public class Main{

    public static void main(String[] args) {

        DivisionList divisionList = new DivisionList();
        User U1 = new User("NomX","PrenomX",'M');
        User U2 = new User("NomY","PrenomY",'F');
        divisionList.alimenterListe();
        divisionList.afficherListe();
        divisionList.inserer(U1);
        divisionList.inserer(U2);
        divisionList.parcourir();
        User U3 = divisionList.recuperer(2);
        divisionList.supprimer(U1);
        System.out.println(divisionList.rechercher(U3));
        divisionList.trier();
        divisionList.echangerUsers(0, 1);
        divisionList.extraireSegment(0, 2);
        divisionList.viderListe();
        System.out.println("Etat Liste : "+divisionList.estVide());
      
        
    }
}
