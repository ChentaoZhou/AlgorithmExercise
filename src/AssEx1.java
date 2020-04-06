//Chentao Zhou, 2457388Z
//do NOT include a package statement in your final submission

//add any import statements you need here
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class AssEx1 {

	/**
	 * read strings from file and add them to an array. Assume that in the file
	 * there is one string per line.
	 * 
	 * @param filename return array
	 */
	public static String[] readFromFile(String fileName) {
		int lines = 0;
		//String fn="C:\\Users\\zctly\\Downloads\\algorithm data structure\\exercise\\birds.txt";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			while (reader.readLine() != null)
				lines++;
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String[] result = new String[lines];
		try {
			int i = 0;
			FileReader fr = null;
			String fn = fileName;
			fr = new FileReader(fn);
			Scanner s = new Scanner(fr);
			while (s.hasNext()) {
				String line = s.nextLine();
				result[i++] = line;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return result; // replace this line with implementation of the method

	}

	/**
	 * Add all of the elements of an array of Strings to a set of strings - note
	 * repeats will disappear your set should be instantiated as a TreeSet (see
	 * lecture 1)
	 */
	public static Set<String> arrayToSet(String[] myArray) {
		Set<String> strings = new TreeSet<String>();
		for(String s :myArray) {
			strings.add(s);
		}
		return strings; // replace this with your implementation

	}

	/**
	 * randomly re-order an array
	 * 
	 * @param origArray
	 */
	public static void jumbleArray(String[] origArray) {
		List<String> stringList = Arrays.asList(origArray);
		Collections.shuffle(stringList);
		stringList.toArray(origArray);
		return; // replace this with your implementation

	}

	/**
	 * create a string consisting all of the elements in an array, one element per
	 * row. Use a for--each loop to return them in the order in which they are
	 * stored
	 */
	public static String arrayToString(String[] stringArray) {
		String result = "";
		for(String s : stringArray) {
			result += s+"\n";
		}
		return result; // replace this with your implementation

	}

	/**
	 * create a string consisting of all of the elements in a set, one element per
	 * row. Use a for--each loop to return them in the order in which they are
	 * stored
	 */
	public static String setToString(Set<String> stringSet) {
		String result = "";
		for(String s : stringSet) {
			result += s+"\n";
		}
		return result; // replace this with your implementation

	}

	/**
	 * main method - do not edit this
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = args[0];
		String[] originalArray = readFromFile(fileName);
		System.out.println("the array has length " + originalArray.length + "\n");
		String[] newArray1 = originalArray.clone();
		String[] newArray2 = originalArray.clone();

		jumbleArray(newArray1);
		jumbleArray(newArray2);

		System.out.print("The original array is:\n");
		System.out.print(arrayToString(originalArray) + "\n");

		System.out.print("The frst jumbled array is:\n");
		System.out.print(arrayToString(newArray1) + "\n");
		System.out.print("The corresponding set is:\n");
		System.out.print(setToString(arrayToSet(newArray1)) + "\n");

		System.out.print("The second jumbled array is:\n");
		System.out.print(arrayToString(newArray2) + "\n");
		System.out.print("The corresponding set is:\n");
		System.out.print(setToString(arrayToSet(newArray2)) + "\n");

	}

}
