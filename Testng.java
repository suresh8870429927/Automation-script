package task;

import org.testng.annotations.Test;

public class Testng {

	//testng--xml configuration@ priority and user point of view description tag
		@Test(priority=2,description="html testcase passess")
		public void html()
		{
			System.out.println("Welcome html");
		}
		@Test(priority=1,description="xml testcase passess")
		public void xml()
		{
			System.out.println("Welcome xml");
		}
		
		@Test(priority=3,description="php testcase passess")
		public void php()
		{
			System.out.println("Welcome php");
		}

	}


