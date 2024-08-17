package application;

import java.util.HashMap;
import java.util.Map;

public class Bag <T>{
	private final Map<T, Integer> itemCount;

	public Bag() {
		itemCount = new HashMap<>();
	}
	// Add method
	public void add(T item) {
		itemCount.put(item,  itemCount.getOrDefault(item, 0) +1); 
		// If item new - set count to 1. If item not new - add 1 to existing count 
	}
	// Remove method
	public void remove(T item) {
		if (itemCount.containsKey(item)) { // check for item in bag
			int count = itemCount.get(item); // get current count of item
			if (count == 1) {
				itemCount.remove(item); // when count = 1 - item is last occurence of item and is removed
			} else {
				itemCount.put(item, count - 1); // when count > 1 - item still has occurences
			}
		}
	}
	// Contains method
	public boolean contains(T item) { // check for item in bag
		return itemCount.containsKey(item); // return true or false
	}
	
	// Count method
	public int count(T item) { // check for item in bag
		return itemCount.getOrDefault(item, 0); 
		// returns count of user specified item if in bag
	}
	
	// Print method
	public void printBag() {
		for (T item : itemCount.keySet()) {
			System.out.println(item + ": " + itemCount.get(item));
			// Prints a list of all items with their count 
		}
	}
}
