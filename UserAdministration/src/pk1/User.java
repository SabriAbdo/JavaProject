package pk1;


class User implements Comparable<User> {
    private String nom;
    private String prenom;
    private char sexe;

    public User(String nom, String prenom, char sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
    }

    
    public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public char getSexe() {
		return sexe;
	}


	public void setSexe(char sexe) {
		this.sexe = sexe;
	}


	@Override
    public String toString() {
        return nom + " " + prenom + " " + sexe;
    }
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return nom.equals(user.nom) && prenom.equals(user.prenom) && sexe == user.sexe;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public int compareTo(User obj) {
        int result = nom.compareTo(obj.nom);
        if (result == 0) {
            result = prenom.compareTo(obj.prenom);
            if (result == 0) {
                result = Character.compare(sexe, obj.sexe);
            }
        }
        return result;
    }
}