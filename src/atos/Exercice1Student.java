package atos;

public class Exercice1Student {
	
	
	private String name;
    private int roll_no;
    
    public Exercice1Student() {
        
    }
    
    public Exercice1Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public static void main(String[] args) {
		
		Exercice1Student student1 = new Exercice1Student("John", 2); 
		System.out.println(student1.getName() +  " , "  + student1.getRoll_no());
   
	}

}
