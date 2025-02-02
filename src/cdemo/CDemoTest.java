package cdemo;

public class CDemoTest {
			//Zaid added instance variables and static variables. 
			// instance variable
			public String firstName = "Zaid";
			private String lastName = "David";
			protected char gender = 'M';
			int id = 123;
			
			// static variable
			public static String country = "USA";
			private static String state = "FL";
			protected static boolean isCitizen = true;
			double salary = 1111.11;
		
			
			//Zaid added new Method and called the instance variables 
		public void getInfo (String firstName, String lastName, char gender) {
			this.firstName = firstName; 
			this.lastName = lastName; 
			this.gender = gender; 
			this.id = id; 
			
		}
	public static void main(String[] args) {
		System.out.println("Team 3");

		String lastname = "Tolosa";
		String firstName = "";

		System.out.println(lastname);

		int a = 20;
		int b = 22;

		System.out.println(a + b);

		
		System.out.println(lastname);
		
		
		int examOne = 85;
		int examTwo = 90;
		
		if (examOne > examTwo) {
			System.out.println("examOne score is higher");
		}else if (examOne < examTwo) {
			System.out.println("examTwo score is higher");
		} else if ( examOne == examTwo) {
			System.out.println("Both exam score is same");	
		}
		
		//Eliana Tolosa
		
		//Second commit (Eliana Tolosa)
		
           for (int i = 1; i <= 5; i ++) {
			
			System.out.println(i);
		} 
		
           
         //Third commit (Eliana Tolosa)   
           for (int i = 1; i <=100; i++) {
   			
   			System.out.println(i);
   			
   			if (i == 55) {
   				break;
           
   			}
   			
   		//Fourth commit (Eliana Tolosa)   	
   			
   			int y = 5;
   			do {
   				System.out.println(y);
   				y++;
   				
   			}while (y <= 0);
   			
           }

	}
	// Sabir omar
	
	public void num(int age , String name) {
 	   
		System.out.println(22);
		System.out.println("Sabir");
		
		
		String lastname = "omar";
		String firstName = "Sabir";
		
		
		int c = 5;
			do {
				System.out.println(c);
				c++;
				
			}while (c <= 0);
		
    }
	
	
// Try a new comment //
	
}
