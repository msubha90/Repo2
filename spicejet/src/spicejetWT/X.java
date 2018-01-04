package spicejetWT;

public class X 
{

	
	public static void main(String[] args) 
	{
		Object obj[]=new Object[5];
		obj[0]=new Javaprog(1, "cc", 10);
		obj[1]=new Javaprog(2, "dd", 11);
		obj[2]=new Javaprog(3, "ee", 12);
		obj[3]=new W(123, "xx");
		obj[4]=new W(1234, "yy");
	
	
		for(Object x:obj)
		{
			if(x instanceof W)
			{
				System.out.println(((W) x).eid);
				
			}
		}
		
	}
}
	
