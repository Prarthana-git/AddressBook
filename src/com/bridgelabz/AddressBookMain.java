import com.bridgelabz

public class AddressbookMain{
	public static void main (String[] args)
	{
		AddressbookImplement bookBuilder=new AddressbookImplement();
		bookBuilder.makechoice();
		boolean condition=true;
		while(condition)
		{
			boolean condition=bookBuilder.makechoice();
			if (condition == false)
				break;
		}
	}
}