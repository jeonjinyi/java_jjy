package java08;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		//Áßº¹Çã¿ëX
		bag.add("ÈŞ´ëÆù");
		bag.add("ÈŞÁö");
		bag.add("º¼Ææ");
		System.out.println(bag); //[ÈŞÁö,º¼Ææ,ÈŞ´ëÆù]
		bag.add("º¼Ææ");
		System.out.println(bag); //[ÈŞÁö,º¼Ææ,ÈŞ´ëÆù]   //hashsetÀº Áßº¹À¸·Î X
		
		
		
	}

}
