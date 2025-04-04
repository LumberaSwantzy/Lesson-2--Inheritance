public class Analyst extends Employee {
    //Attributes
    //Constructor
    public Analyst(String name, double salary, int age) {
        super(name, age, salary);
    }
 
    public double getAnnualBonus() {
        return super.salary * .05;
    }
}
