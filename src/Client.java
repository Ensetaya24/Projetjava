public class Client {
    int id;
    String nom;
    String ville;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }

    public Client(int id, String nom, String ville) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
    }

    public static void main(String[] args) {
        Client c1,c2;
        c1 = new Client(11,"Malika","Rabat");
        c2 = new Client(11,"Abdelhakim","Rabat");
        System.out.println(c1.toString());
        System.out.println(c2.toString());


    }
}
