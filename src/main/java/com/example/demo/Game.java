package com.example.demo;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
public class Game{
  @Setter@Getter
  private Boolean ketThuc = false;
  @Setter@Getter
  private int winner = 0;
  @Setter@Getter
  private Tuong tuong1;
  @Setter@Getter
  private Tuong tuong2;

  public Tuong khoiTaoTuong(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String username = scanner.next();
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    System.out.println(String.format("%s, your age is %d", username, age));
		Tuong tuong = new Tuong();
		return tuong;
	}

	public void dieukhienT1(){

	}

	public void dieukhienT2(){

	}

	public Boolean kiemTraKetThuc(){
		return false;
	}

	public void ketThuc(){
		// System.out.println("hihi");
		switch (winner) {
			case 0:
				System.out.println("hoa");
				break;
			case 1:
				System.out.println("ng 1 thang");
				break;
			case 2:
				System.out.println("ng 2 thang");
				break;
			default:
				System.out.println("co loi xay ra");
				break;
		}
	}
}
