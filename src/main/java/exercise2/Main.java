package exercise2;

public class Main {
    public static void main(String[] args) {
        //Main Method
        Patient meinPatient = new Patient("Besa","Ramadani", 16, 1);
        System.out.println(meinPatient);
        Patient newPatient = new Patient("Larina","Rehhorn", 16,1);
        System.out.println(newPatient.getGeschlecht());
    }
}
