package homework2;
import java.util.*;
public class B01 {
	int num1;
	int num2;
	int num3;
	int max_num;
	int min_num;
	public void input(){
		Scanner s=new Scanner(System.in); 
		System.out.println("첫번째 숫자를 입력하시오.");
		this.num1=s.nextInt();
		System.out.println("두번째 숫자를 입력하시오.");
		this.num2=s.nextInt();
		System.out.println("세번째 숫자를 입력하시오.");
		this.num3=s.nextInt();
	    print();
	}
		public void print(){
			 if(this.num1<this.num2)
			 {
			 this.max_num=this.num2;
			 this.min_num=this.num1;
			 }
			 else {
		     this.max_num=this.num1;
			 this.min_num=this.num2;
			 }
			 if(this.max_num<this.num3)
			 {
		     this.max_num = this.num3;
			 }		 
			 if(this.min_num>this.num3)
			 {
			 this.min_num = this.num3;
			 }		 
		 System.out.println("가장 큰 수는"+max_num+"가장작은수는"+min_num+"입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B01().input();	
	}

}
