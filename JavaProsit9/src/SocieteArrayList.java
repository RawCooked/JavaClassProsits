import java.util.ArrayList;

public class SocieteArrayList implements IGestion {

    ArrayList<Employe> employees = new ArrayList<Employe>();


    @Override
    public void ajouterEmploye(Object o) {
        if(o instanceof Employe)
            employees.add((Employe)o);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(Employe employee : employees)
            if(employee.nom.equals(nom))
                return true;
        return false;
    }

    @Override
    public boolean rechercherEmploye(Object o) {
        if(employees.contains(o))
            return true;
        return false;
    }

    @Override
    public void supprimerEmploye(Object o) {
        if(rechercherEmploye(o))
            employees.remove(o);

    }

    @Override
    public void displayEmploye() {
        for(Employe employee : employees)
            System.out.println(employee);
    }

    ///TODO
    @Override
    public void trierEmployeParId() {

    }
    ///TODO
    @Override
    public void trierEmployeParNomDépartementEtGrade() {

    }
}
