package Resto;

import java.util.HashMap;

public class HashTest {
	private int id;
	private String name;
	HashTest(int id, String name){
		this.id = id;
		this.name = name;
	}
	public boolean equals(Object o) {
		return this.hashCode()==o.hashCode();
	}
	public int hashCode() {
		return id^name.hashCode();
	}
	public String toString() {
		return id+" "+name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<HashTest,Integer> al = new HashMap<>();
		al.put(new HashTest(1,"Vinay"),1);
		al.put(new HashTest(2,"Anmol"),2);
		al.put(new HashTest(3,"Jitendra"),3);
		al.put(new HashTest(1,"Vinay"),2);
		System.out.println(al);
	}

}
