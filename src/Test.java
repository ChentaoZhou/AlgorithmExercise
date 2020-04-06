
public class Test {
	public static void main(String[] args) {
		AssessmentSLL<Integer> list1 = new AssessmentSLL();
		AssessmentSLL<Integer> list2 = new AssessmentSLL();
		AssessmentSLL<Integer> list3 = new AssessmentSLL();

		Integer[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 0; i < a.length; i++) {
			list1.insertTail(a[i]);
		}
		list1.insertTail(101);
		//list1.printFirstToLast();
		Integer[] b = { 6, 7, 8, 9, 10, 11, 12 };
		for (int i = 0; i < b.length; i++) {
			list2.insertTail(b[i]);
		}
		Integer[] c = { 11, 12, 14, 16, 19, 21 };
		for (int i = 0; i < c.length; i++) {
			list3.insertTail(c[i]);
		}

		AssessmentSLL<Integer> mergedList = list1.merge(list2, list3);
		mergedList.printFirstToLast();
		mergedList.deleteAlternate();
		mergedList.printFirstToLast();
		

	}
}
