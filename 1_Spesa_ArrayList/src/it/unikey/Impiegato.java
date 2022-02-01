package it.unikey;

public class Impiegato extends Persona {

    private float salary;

    @Override
    public void work() {
        System.out.println("Lavoro di ufficio");;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void incrementSalary(float money){
        this.salary += money;
    }
}
