package Kiran_Maximum_indices;

public class kiran_exercise_indices {

	public static void main(String[] args) {
		        int[] nums = {5,10,3,6,7,8,9};
		        int index1 = 0, index2 = 0;
		        int max1=0,max2=0;
		        for(int i=0;i<=6;i++)
		        {
		        	if(max1<nums[i])
		        	{
		        		max1=nums[i];
		        		index1=i;
		        	}
		        }
		        
		        for(int i=0;i<=6;i++)
		        {
		        	if(i!=index1)
		        	{
		        	if(max2<nums[index1]+nums[i])
		        	{
		        	max2= nums[index1]+nums[i];
		        	index2=i;
		        	 //System.out.println("["  + index2 +" "+ max2 +"]");
		        	}
		        	}
		        	 //System.out.println(max2+ " "+ i);
		        }
		        // Your code here
		        
		        System.out.println("[" + index1 + "," + index2 + "]");
		
	}

}
