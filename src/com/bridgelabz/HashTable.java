package com.bridgelabz;
import java.util.HashMap;
import java.util.Set;

/***
 * 
 * @author Admin
 *
 */
public class HashTable {
	/***
	 * 
	 * @param args
	 */
	static void printSentence(String stringValue) {
		HashMap<String, Integer> frequency = new HashMap<String, Integer>();
		String[] words = stringValue.split(" ");

		for (String word : words) {
			if (frequency.containsKey(word)) {
				frequency.put(word, frequency.get(word) + 1);
			} else {
				frequency.put(word, 1);
			}
		}
		Set<String> stringFrequency = frequency.keySet();
		System.out.println("Frequency Of Each word in Sentence: \n 'To Be Or Not To Be'");
		for (String word : stringFrequency) {
			System.out.println(word + " = " + frequency.get(word) + " times.");

		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the HashTable program");
		printSentence("To Be Or Not To Be");
	}
}