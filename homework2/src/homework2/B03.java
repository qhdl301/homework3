package homework2;
import java.util.*;
public class B03 {
	int month;
	int day;
	int day_count=0;
	
	public void input(){
		Scanner s=new Scanner(System.in); 
		System.out.println("월을 입력하시오.");
		this.month=s.nextInt();
		System.out.println("일을 입력하시오.");
		this.day=s.nextInt();
		print();
	}
    public void print(){
    	
    	for(int i=1; i<this.month; i++){
    	if(i==1)
    	{
    		this.day_count=this.day_count+31;
    		
    	}
    	else if(i==2)
    	{
    		this.day_count=this.day_count+28;
    		
    	}
    	else if(i==3)
    	{
    		this.day_count=this.day_count+31;
    	
    	}
    	else if(i==4)
    	{
    		this.day_count=this.day_count+30;
    	
    	}
    	else if(i==5)
    	{
    		this.day_count=this.day_count+31;
    		
    	}
    	else if(i==6)
    	{
    		this.day_count=this.day_count+30;
    	
    	}
    	else if(i==7)
    	{
    		this.day_count=this.day_count+31;
    	
    	}
    	else if(i==8)
    	{
    		this.day_count=this.day_count+31;
    	
    	}
    	else if(i==9)
    	{
    		this.day_count=this.day_count+30;
    		
    	}
    	else if(i==10)
    	{
    		this.day_count=this.day_count+31;
    		    	}
    	else if(i==11)
    	{
    		this.day_count=this.day_count+30;
    		
    	}
    	else if(i==12)
    	{
    		this.day_count=this.day_count+31;
    	
    	}
      }
    	this.day_count = day_count+day;
	 	while (this.month<=12)
    	{
    		System.out.println("이 날짜는 1년 중"+day_count+"해당됩니다");
    			
    		break;
    	}
    	while (this.month>12)
    	{
    		System.out.println("잘못입력하셨습니다.");
    		break;
    	}		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B03().input();
	}

}
