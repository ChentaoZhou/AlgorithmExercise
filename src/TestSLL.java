

//package assessment;

public class TestSLL {

	public static void main(String[] args) {
		AssessmentSLL<String> bookList1 =  new AssessmentSLL<String>();
		AssessmentSLL<String> bookList2 =  new AssessmentSLL<String>();
		AssessmentSLL<String> bookList3 =  new AssessmentSLL<String>();
		AssessmentSLL<String> bookList4 =  new AssessmentSLL<String>();
		System.out.println("Book Example:");
		bookList1.insertTail("Animal Farm");
		bookList1.insertTail("Charlotte's web");
		bookList1.insertTail("Complicity");
		bookList1.insertTail("Crime and Punishment");
		bookList1.insertTail("Gone with the wind");
		bookList1.insertTail("Harry Potter");
		bookList1.insertTail("Moby Dick");
		bookList1.insertTail("The Gruffalo");
		bookList1.insertTail("Treasure Island");
		
		
		bookList2.insertTail("Brigit Jones' Diary");
		bookList2.insertTail("Crime and Punishment");
		bookList2.insertTail("Dancing with Wolves)");
		bookList2.insertTail("Gone with the wind");
		bookList2.insertTail("Moby Dick");
		bookList2.insertTail("Our Man in Havana");
		bookList2.insertTail("Stig of the Dump");
		
		 
		bookList3.insertTail("Action Man");
		bookList3.insertTail("Moby Dick");
		bookList3.insertTail("Superwoman");
		
		System.out.println("First list is:");
		bookList1.printFirstToLast();
		
		System.out.println("\n");
		
		System.out.println(".. and with alternate entries deleted: ");
		bookList1.deleteAlternate();
		
		bookList1.printFirstToLast();
		System.out.println("\n");
		System.out.println("Second list is:");
		bookList2.printFirstToLast();
		System.out.println("\nAnd third list is:");
		bookList3.printFirstToLast();
		bookList4 =bookList1.merge(bookList2, bookList3);
		System.out.println("\nMerging the three lists gives:");
		bookList4.printFirstToLast();
				
				
				
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Clock Example:");
		
		
		Clock clock1 = new Clock("BigBen", 400);
		Clock clock2 = new Clock("BigBen", 5000);
		Clock clock3 = new Clock("BingBong", 11000);
		Clock clock4 = new Clock("Chimer", 12000);
		Clock clock5 = new Clock("TickTock", 2000);
		Clock clock6 = new Clock("TickTock", 8000);
		Clock clock7 = new Clock(clock4);
		
		AssessmentSLL<Clock> clockList0 =  new AssessmentSLL<Clock>();
		AssessmentSLL<Clock> clockList1 =  new AssessmentSLL<Clock>();
		AssessmentSLL<Clock> clockList2 =  new AssessmentSLL<Clock>();
		AssessmentSLL<Clock> clockList3 =  new AssessmentSLL<Clock>();
		
		System.out.println("(Empty) clock list 0 is: ");
		
		clockList0.printFirstToLast(); //test empty list 
		
		clockList1.insertTail(clock1);
		clockList1.insertTail(clock3);
		clockList1.insertTail(clock4);
		clockList1.insertTail(clock5);
		System.out.println("\nClock list 1 is: ");
		clockList1.printFirstToLast(); //test non-empty list 
		System.out.println("\n.. and with alternate entries deleted: ");
		clockList1.deleteAlternate();
		clockList1.printFirstToLast();
		System.out.println("\n");
		clockList2.insertTail(clock2);
		clockList2.insertTail(clock7);
		clockList2.insertTail(clock6);
		clockList3.insertTail(clock1);
		clockList3.insertTail(clock2);
		clockList3.insertTail(clock4);
		
		System.out.println("\nSecond list is:");
		clockList2.printFirstToLast();
		System.out.println("\nThird list is:");
		clockList3.printFirstToLast();
		
		AssessmentSLL<Clock> clockList4 = clockList1.merge(clockList2,clockList3);
		
		System.out.println("\n");
		System.out.println("Merged lists:");
		clockList4.printFirstToLast();
		
		
		
		
		
		
	}
		


	}


