package exercise2;

public class Patient {

    //TODO: Declare Private Attributes
    private String name;
    private String nachname;
    private int alter;
    private int geschlecht;


    //TODO: Create Constructor
    public Patient(String name, String nachname, int alter, int geschlecht) {
        this.name = name;
        this.nachname = nachname;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }


    //TODO: Add Getter and Setter Methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getGeschlecht() {
        if (geschlecht == 1){
            return "Weiblich";
        }
        if (geschlecht == 2) {
            return "Männlich";
        }
        return "Andere";
    }

    public void setGeschlecht(int geschlecht) {
        this.geschlecht = geschlecht;
    }

    //TODO: Add toString Method
    public String toString() {
        return "Patient [name=" + name + ", nachname=" + nachname + ", alter=" + alter + ", geschlecht=" + geschlecht + "]";
    }

}
