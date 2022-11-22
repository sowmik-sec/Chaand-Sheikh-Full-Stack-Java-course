package com.sowmik.map.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	public Code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	@Override
	public int compareTo(Code o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo() + o.getSectionNo();
		return code1.compareTo(code2);
	}
	@Override
	public int hashCode() {
		return Objects.hash(lectureNo, sectionNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		return Objects.equals(lectureNo, other.lectureNo) && Objects.equals(sectionNo, other.sectionNo);
	}
	
	
	
	
}

public class App {
	public static void main(String[] args) {
		Map<Code, String> lectures = new TreeMap<>();
		lectures.put(new Code("S01", "L03"), "Ahsan");
		lectures.put(new Code("S02", "L04"), "Habib");
		lectures.put(new Code("S03", "L05"), "Sowmik");
		lectures.put(new Code("S04", "L06"), "Volga");
		lectures.put(new Code("S05", "L07"), "Chaand");
		lectures.put(new Code("S06", "L08"), "Chad");
		lectures.put(new Code("S07", "L09"), "Maqbul");
		
		for(Map.Entry<Code, String> entry: lectures.entrySet()) {
			//System.out.println("Key: "+entry.getKey()+" value: "+entry.getValue());
		}
		
		
		/*
		String name1 = new String("Chaand");
		String name2 = new String("Chaand");
		
		System.out.println(name1.equals(name2));
		
		System.out.println(name1.hashCode() + " " + name2.hashCode());
		
		Code code1 = new Code("S01", "L02");
		Code code2 = new Code("S01", "L03");
		System.out.println(code1.hashCode()+ " "+ code2.hashCode());
		System.out.println(code1.equals(code2));
		*/
		
		//System.out.println(lectures.get(new Code("S01", "L99")));
		
		Code code = null;
		
		for(Map.Entry<Code, String> entry : lectures.entrySet()) {
			if(entry.getValue().equals("Volga")) {
				code = entry.getKey();
			}
		}
		
		System.out.println("The key for valeu \"Volga\""+code);
		
		
		
		
		
		
	}
}
