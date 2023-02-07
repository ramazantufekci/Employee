public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;



    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary>1000){
            this.tax = this.salary*0.03;
            return this.tax;
        }
            this.tax = 0;
        return this.tax;

    }

    int bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }
        return 0;
    }

    double raiseSalary(){
        int yil = (2021-this.hireYear);
        if(yil<10){
            return this.salary*0.05;
        } else if (yil>9 && yil<20) {
            return this.salary*0.10;
        }
        return this.salary*0.15;

    }

    public String toString(){
        System.out.println("Adı : "+this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Çalışma Saati : "+this.workHours);
        System.out.println("Başlangıç Yılı : "+this.hireYear);
        System.out.println("Vergi : "+this.tax());
        System.out.println("Bonus : "+this.bonus());
        System.out.println("Maaş Artışı : "+this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+((this.salary-this.tax())+this.bonus()));
        System.out.println("Toplam Maaş : "+(this.salary+this.raiseSalary()));
        return " ";
    }



}
