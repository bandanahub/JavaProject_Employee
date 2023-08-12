import java.util.Calendar;
public class Employee {
    private String name;
    private int birthyear;
    private int age;
    private double income;
    private double occ_rate;

   public Employee(String name, int birthyear , double income , String vehicle){
       this.name = name ;
       this.birthyear = birthyear;
       this.age = age;
       this.income = income;
       this.occ_rate =occ_rate;
   }
    public String getName() {
        return name;
    }
    public double getIncome(){
       return income;
    }
    public double getOcc_rate(){
       return occ_rate;
    }
    public int getBirthYear() {
        return birthyear;
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthyear;
    }
    

}
