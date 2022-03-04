package StudentTest03;

import java.util.Scanner;

public class StudentExam {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		StudentData sd = new StudentData();
		
		
		System.out.print("input name >> ");
		String name = scan.nextLine();
		sd.setName(name);
		
				System.out.print("input id >> ");
		int id = scan.nextInt();
		sd.setId(id);
		
		
		System.out.print("input kor >> ");
		int kor = scan.nextInt();
		sd.setKor(kor);
		
		
		System.out.print("input eng >> ");
		int eng= scan.nextInt();
		sd.setEng(eng);
		
		
		System.out.print("input math >> ");
		int math = scan.nextInt();
		sd.setMath(math);
		
	
		
		sd.StudentTotal();
		
		
		sd.StudentAvr();
		
		
		sd.StudentGrade();
		
		
		System.out.println(sd.toString());
		
		
		
		
	}

}
