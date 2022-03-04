package StudentTest03;



public class StudentData {
	private String name;
	private int id;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avr;
	private char grade;



	public StudentData(){
		this.name   = null;
		this.id     = 0;
		this.kor    = 0;
		this.eng    = 0;
		this.math   = 0;
		this.total  = 0;
		this.avr    = 0.0;
		this.grade  = 0;
		
		
	}
	
	
	public StudentData(String name,int id,int kor,int eng,int math){
		this.name   = null;
		this.id     = id;
		this.kor    = kor;
		this.eng    = eng;
		this.math   = math;
		this.total  = 0;
		this.avr    = 0;
		this.grade  = 0;
		
		
	}
	
	public void StudentTotal() {
		this.total = this.kor + this.eng + this.math;
		
	}
	
	public void StudentAvr() {
		this.avr = this.total/ 3;
	}

	public void StudentGrade() {

		if(this.avr >= 90.0) {
			this.grade = 'A';
		}else if (this.avr >= 80.0) {
			this.grade = 'B';
		}else if (this.avr >= 80.0) {
			this.grade = 'C';
		}else if (this.avr >= 80.0) {
			this.grade = 'D';
		}else{
			this.grade = 'F';
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public double getAvr() {
		return avr;
	}


	public void setAvr(double avr) {
		this.avr = avr;
	}


	public char getGrade() {
		return grade;
	}


	public void setGrade(char grade) {
		this.grade = grade;
	}


	public String toString() {
		return "StudentData ["+ name +","+ id +","+ kor +","+ math +","
				+ ""+ eng +","+ total +","+ avr +","+ grade +"]";       
	}
}
	
