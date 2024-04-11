package kiran_exercise;

public class kiran_exercise07_23 {
public static Boolean changestatus(Boolean locks)
{
	Boolean status=true;
	status = locks;
	
	if(status == true)
	{
		status = false;
	}
	else if(status == false)
	{
		status = true;
	}
	
	return status;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean[] Lockers = new Boolean[100];
		
		for(int i=0;i<100;i++)
		{
			Lockers[i]=false;
		}
		
		
	for (int i=1;i<=100;i++)                      //i represent the student no (i.e i=1 means 1st student,i=2 means second student.....i=100 means 100th student)
		{
		int j=1;
			for(j=i*j;j<=100;j=j+i)     //j represent the locker(j=1 means 1st locker.....j=100 means 100th locker)
			{
				
		//int res=0;res=j-1;
			Lockers[j-1]=changestatus(Lockers[j-1]);
	//System.out.println(Lockers[j-1]+"Locker"+res);
			/*f(i<=1)
				{
					j=j+1;
				}
				else
				{
					j=j+i;
				}*/
				
			}
		}
	//stem.out.println(Lockers[17]);
	
	for(int i=1;i<=100;i++)
	{
		if(Lockers[i-1]==true)
		{
			System.out.println("Locker "+ i +" is Open");
		}
		else if(Lockers[i-1]==false)
		{
			System.out.println("Locker "+ i +" is closed");
		}
		else
		{
			System.out.println("invalid Locker Status");
		}
	}
	
	System.out.println("------------------------Program output Check--------------------------");
	
	for(int i=0;i<100;i++)
	{
		int num=0;
		if(Lockers[i]==true)
		{
			num=i+1;
			System.out.println("Locker "+ num +" is Open");
		}
	}
	

}
}