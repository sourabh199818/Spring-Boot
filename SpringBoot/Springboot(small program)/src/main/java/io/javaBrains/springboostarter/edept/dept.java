package io.javaBrains.springboostarter.edept;

public class dept {
	private String id;
	private String name;
	private String e_dept ;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getE_dept() {
		return e_dept;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setE_dept(String e_dept) {
		this.e_dept = e_dept;
	}
	public dept(String id, String name, String e_dept) {
		super();
		this.id = id;
		this.name = name;
		this.e_dept = e_dept;
	}
	
	
	}


