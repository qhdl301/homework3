import java.util.*;
public class B04 {
	double num;
	int num1;
	
	public void input(){
		Scanner s=new Scanner(System.in); 
		System.out.println("연봉을 원단위로 입력하시오.");
		this.num=s.nextInt();
		print();
	}
	
	public void print(){
		if(this.num<10000000)
		{
			this.num1=(int)(this.num*(0.095));
			System.out.println("연봉의 금액에 대한 소득세는"+num1+"입니다.");
		}
		else if(this.num<40000000)
		{
			this.num1=(int)(this.num*(0.19));
			System.out.println("연봉의 금액에 대한 소득세는"+num1+"입니다.");
		}
		else if(this.num<80000000)
		{
			this.num1=(int)(this.num*(0.28));
			System.out.println("연봉의 금액에 대한 소득세는"+num1+"입니다.");
		}
		else if(this.num<=80000000)
		{
			this.num1=(int)(this.num*(0.37));
			System.out.println("연봉의 금액에 대한 소득세는"+num1+"입니다.");
		}
	}
	public static void main(String[] args) {
		new B04().input();// TODO Auto-generated method stub
	}

}
