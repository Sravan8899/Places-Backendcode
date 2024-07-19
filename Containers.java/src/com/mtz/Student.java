package com.mtz;

public class Student {
	private int sid;
	private String name;
	private String College;
	private int fee;
	private int maths,sci,eng;
	public Student(int sid, String name, String college, int fee, int maths, int sci, int eng) {
		super();
		this.sid = sid;
		this.name = name;
		College = college;
		this.fee = fee;
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", College=" + College + ", fee=" + fee + ", maths=" + maths
				+ ", sci=" + sci + ", eng=" + eng + "]";
	}
	

}
