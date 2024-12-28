package com.why;

import java.util.ArrayList;
import java.util.Collections;

//why we use?

public class ArrayList1 {
	public static void main(String[] args) {

		// create ArrayList<Integer>
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(40);
		al.add(80);
		al.add(70);
		System.out.println("Before sorting>>" + al);
		Collections.sort(al);
		System.out.println("After sorting>>" + al);

	}

}
