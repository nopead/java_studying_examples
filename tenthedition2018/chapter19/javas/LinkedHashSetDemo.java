package tenthedition2018.chapter19.classes;

import java.util.*;

class LinkedHashSetDemo{
	public static void main(String[] args){
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Бета");
		hs.add("Альфа");
		hs.add("Эта");
		hs.add("Гамма");
		hs.add("Эпсилон");
		hs.add("Омега");
		
		System.out.println(hs);
	}
}