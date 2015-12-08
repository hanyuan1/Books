import java.util.Scanner;

public class TestDB {
 
	public static void main(String[] args) {

		boolean continuewhile = true;
		while (continuewhile) {
		   System.out.println();
		   System.out.println("+************************************************************************************************+");
		   System.out.println("|| 1. CONNECT TO THE DATABASE  	|| 5. SHOW TABLES		|| 9. INSERT			||");
		   System.out.println("|| 2. SHOW DATABASES		|| 6. CREATE TABLES		|| 10. UPDATE			||");
		   System.out.println("|| 3. CREATE A NEW DATABASE	|| 7. DROP TABLE		|| 11. DELETE			||");
		   System.out.println("|| 4. ANY STATEMENT		|| 8. PRINT OUT TABLE CONTENTS	|| 12. EXIT			||");
		   System.out.println("+************************************************************************************************+");
		   Scanner in = new Scanner(System.in);
		   System.out.print("Your choice: ");
		   int choice = in.nextInt();
		   switch (choice) {
		   case 1:
			   Books.connectToDB();
			   break;
		   case 2:
			   Books.showDBs();
			   break;
		   case 3:
			   Books.createDB("BOOKS");
			   break;
		   case 4:
			   Books.anyStatements();
			   break;
		   case 5:
			   Books.showTables();
			   break;
		   case 6:
			   Books.createAUTHORISBNtable();
			   Books.createAUTHORStable();
			   Books.createPUBLISHERStable();
			   Books.createTITLEStable();
			   break;
		   case 7:
			   System.out.print("Please type the table name that you want to drop: ");
			   String tablename = in.next();
			   Books.dropTable(tablename);
			   break;
		   case 8:
			   Books.printOut();
			   break;
		   case 9:
			   Books.insert();			   
			   break;
		   case 10:
			   Books.update();
			   break;
		   case 11:
			   Books.delete();
			   break;
		   case 12:
			   Books.close();
			   System.out.println("Goodbye!");
			   in.close();
			   System.exit(0);
			   break;	   
		   }
	   }
	}//end main
}//end SQL