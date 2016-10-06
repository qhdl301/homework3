package homework2;
import java.util.*;
public class B02 {
	double m2_area;
	double pyung_area;
	double num;
public void input(){
	Scanner s=new Scanner(System.in); 
	System.out.println("아파트의 분양면적(제곱미터)을 입력하시오.");
	this.m2_area=s.nextDouble();
	print();
}
public void print(){
	this.num=this.m2_area/3.305;
	System.out.printf("아파트의 평형은%.1f\n",num);
	
	if(this.num<15){
		System.out.println("소형 아파트입니다");
	}
	else if(this.num<30)
	{
		System.out.println("중소형 아파트입니다");
	}
	else if(this.num<50)
	{
		System.out.println("중형 아파트입니다");
	}
	else if(this.num>50)
	{
		System.out.println("대형 아파트입니다");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B02().input();
	}

}
