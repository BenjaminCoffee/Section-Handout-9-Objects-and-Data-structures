package com.Pannell;

public class ExpandableArray {
	
	public static void main(String[] args) {
		ExpandableArray expandableArray = new ExpandableArray();
		// index 10 is the 11th index
		expandableArray.set(10, "Dale");
		expandableArray.set(14, "Hank");
		expandableArray.set(20, "Bill");
		
		for(int i = 0; i < expandableArray.objectArray.length; i++) {
			System.out.println(expandableArray.get(i));
		}
		
	}

	public Object[] objectArray;

	public ExpandableArray() {
		objectArray = new Object[0];
	}

	public void set(int index, Object value) {
		// the array will never be null as we are instantiating objectArray in the constructor
		// if the index is greater than or equal to the length of
		// the array it means we need to resize the array
		// else, we already have an array large enough to accommodate the
		// new value at the specified index.
		if(index >= objectArray.length) {
			
			//we create a new array big enough to accommodate the new index we must assign
			Object[] newArray = new Object[index + 1];
			
			// then we have to copy the contents of the current Array in to the new Array.
			for (int i = 0; i < objectArray.length; i++) {
				newArray[i] = objectArray[i];
			}
			
			// assign the newly copied array to the objectArray
			objectArray = newArray;		
		}
		
		// objectArray either has its own original value in it with no new values
		// or it has a new array as big as the index
		objectArray[index] = value;
	}

	public Object get(int index) {
		if(objectArray[index] == null) {
			return null;
		}
		return objectArray[index];
	}
}
