package quanlykhachhang.model;

import java.io.Serializable;

public class KhachHang implements Serializable {
	private String name;
	private int old;
	private int numberID;
	private int numberRom;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public int getNumberID() {
		return numberID;
	}
	public void setNumberID(int numberID) {
		this.numberID = numberID;
	}
	public int getNumberRom() {
		return numberRom;
	}
	public void setNumberRom(int numberRom) {
		this.numberRom = numberRom;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public KhachHang(String name, int old, int numberID, int numberRom, String phone) {
		super();
		this.name = name;
		this.old = old;
		this.numberID = numberID;
		this.numberRom = numberRom;
		this.phone = phone;
	}
	public KhachHang() {
		super();
	}
	@Override
	public String toString() {
		String s = ("\t"+name+"\t"+old+"\t"+numberID+"\t"+"\t"+numberRom+"\t"+"\t"+phone);
		return s;
	}
	

}
