package com.why;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
	
	public static void main(String[] args) {

		// create ArrayList<String>
		ArrayList<String> al = new ArrayList<String>();
		al.add("ram");
		al.add("ajay");
		al.add("yogesh");
		al.add("vikas");
		al.add("sohan");
		al.add("chetan");
		al.add("kshitija");
		al.add("snehal");
		al.add("digambar");
		System.out.println("Before sorting>>" + al);
		Collections.sort(al);
		System.out.println("After sorting>>" + al);
	}

}
