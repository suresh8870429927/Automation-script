package task;

import org.testng.annotations.Test;

public class Exceptionhandling {
		@Test
		public void exceptionhandling()
		{
			System.out.println("start");
			try
			{
				int c=10/0;
				System.out.println("c is"+c);
			}
			catch(ArithmeticException e)
			{
				System.out.println("somethig wrong" + e.getMessage());
				System.out.println("divide by 0 is infinite value so can not able to store in to integer");
			}
			System.out.println("End");
		}

	}


