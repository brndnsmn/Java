package deneme1;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	Employee(String name, double salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		
	}
	
	public double tax() {
		if(this.salary > 1000) {
			return (this.salary*(0.03));
		}
		else {
			return 0;
		}
		
	}
	
	public double bonus() {
		if(this.workHours > 40) {
			return ((this.workHours-40)*30);
		}
		return 0;
	}
	
	public double raiseSalary() {
		if (this.hireYear > 2011) {
			return (this.salary*(0.05));
		}
		else if (this.hireYear > 2001 && this.hireYear < 2012) {
			return (this.salary*(0.1));
		}
		else if (this.hireYear < 2002) {
			return (this.salary*(0.15));
		}
		return 0;
	}
	
	public void print() {
		System.out.println("Adı: "+ this.name);
		System.out.println("Maaşı: "+ this.salary);
		System.out.println("Çalışma Saati: "+ this.workHours);
		System.out.println("Başlangıç Yılı: "+ this.hireYear);
		System.out.println("Vergi: "+ tax());
		System.out.println("Bonus: "+ bonus());
		System.out.println("Maaş Artışı: "+ raiseSalary());
		System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: "+ (this.salary+ bonus()- tax()));
		System.out.println("Toplam Maaş: "+ (this.salary+ bonus()+raiseSalary()-tax()));
	
	}
	
	
	
	
}
