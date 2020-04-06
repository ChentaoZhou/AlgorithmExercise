//Name:Chentao Zhou; Matric number:2457388Z
//do not include package statement 
//do not import any classes
//just complete the methods indicated,
//namely:
//insertTail
//deleteAlternate and
//merge

public class AssessmentSLL<E extends Comparable<E>> {

	// Each SLL object is the header of
	// a singly-linked-list

	private Node<E> first;

	/**
	 * constructor
	 */
	public AssessmentSLL() {
		// Construct an empty SLL.
		first = null;
	}

	// //////// Inner class //////////
	private static class Node<E> {
		// Each Node object is a node of a
		// singly-linked-list.
		protected E element;
		protected Node<E> next;

		public Node(E elem, Node<E> n) {
			element = elem;
			next = n;
		}

	}

	// ////////////////////////////////

	/**
	 * print all elements starting from first node
	 */
	public void printFirstToLast() {
		// Print all elements in this SLL, in first-to-last order.
		Node<E> curr = first;
		while (curr != null) {
			System.out.println(curr.element);
			curr = curr.next;
		}
	}

	/**
	 * insert new node containing elem at front of list
	 * 
	 */
	public void insert(E elem) {
		Node<E> newNode = new Node<E>(elem, first);
		first = newNode;
	}

	/**
	 * add new node to end of list
	 */
	public void insertTail(E elem) {
		Node<E> newNode = new Node<E>(elem, null);
		if (first == null) {
			first = newNode;
			return;
		}
		Node<E> curr = first;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}

	/**
	 * delete every alternate element imagine the elements are indexed 0, 1, 2, ...
	 * , n-1 delete all the odd indexed elements so if list had values ant, badger,
	 * cat, dog the method would delete nodes containing badger and dog
	 */
	public void deleteAlternate() {
		Node<E> curr = first;
		if (first == null)
			return;
		Node<E> nextNode = first.next;
		while (nextNode != null) {
			curr.next = nextNode.next;
			curr = curr.next;
			if (curr == null)
				return;
			nextNode = curr.next;
		}
	}

	/**
	 * method to merge two ordered lists with this one whilst removing duplicates
	 * order should be preserved you need to replace the type list1, list2 and list3
	 * and the return type with the new name of this class
	 */
	public AssessmentSLL<E> merge(AssessmentSLL<E> list1, AssessmentSLL<E> list2) {
		AssessmentSLL<E> mergedList = new AssessmentSLL<E>();
		mergedList = this.addAll(list1);
		mergedList = mergedList.addAll(list2);

		return mergedList;

	}

	/**
	 * method to merge one ordered list with this one whilst removing duplicates
	 * order should be preserved
	 */

	public AssessmentSLL<E> addAll(AssessmentSLL<E> list) {
		Node<E> curr1 = this.first;
		Node<E> curr2 = list.first;

		// The node result is the dommy node
		Node<E> result = new Node(null, null);

		AssessmentSLL<E> newSLL = new AssessmentSLL<E>();
		newSLL.first = result;
		while (curr1 != null && curr2 != null) {
			if (curr1.element.compareTo(curr2.element) < 0) {
				Node<E> temp = new Node(curr1.element, null);
				result.next = temp;
				result = result.next;
				curr1 = curr1.next;
			} else if (curr1.element.compareTo(curr2.element) > 0) {
				Node<E> temp = new Node(curr2.element, null);
				result.next = temp;
				result = result.next;
				curr2 = curr2.next;
			} else {
				Node<E> temp = new Node(curr1.element, null);
				result.next = temp;
				result = result.next;
				curr1 = curr1.next;
				curr2 = curr2.next;
			}
		}

		while (curr1 != null) {
			Node<E> temp = new Node(curr1.element, null);
			result.next = temp;
			result = result.next;
			curr1 = curr1.next;
		}
		while (curr2 != null) {
			Node<E> temp = new Node(curr2.element, null);
			result.next = temp;
			result = result.next;
			curr2 = curr2.next;
		}
		newSLL.first = newSLL.first.next;
		return newSLL;
	}
}
