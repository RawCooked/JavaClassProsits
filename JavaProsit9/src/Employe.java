public class Employe implements Comparable<Employe> {

    Integer id;
    String nom;
    String prenom;
    String nomDep;
    int grade;

    Employe(int id, String nom, String prenom, String nomDep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
        this.grade = grade;
    }
    Employe() {

    }

    @Override
    public String toString() {
        return "Employe [id=" + id + ", nom=" + nom + ", prenom="+prenom + ", nomDep=" + nomDep + ", grade=" + grade + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() == obj.getClass())
            return this.id == ((Employe) obj).id && this.nom.equals(((Employe) obj).nom);
        return false;
    }

    @Override
    public int compareTo(Employe e) {
        return this.id.compareTo(e.id);
    }


    public String getNom_departement() {
        return nomDep;
    }

    public int getGrade() {
        return this.grade;
    }
}
