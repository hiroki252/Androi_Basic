package quanykhachhang.ois;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import quanlykhachhang.model.KhachHang;

public class Serilezia {
	public static boolean luuFile(ArrayList<KhachHang>dsKH, String path){
		try{
				FileOutputStream fis = new FileOutputStream(path);
				ObjectOutputStream oos = new ObjectOutputStream(fis);
				oos.writeObject(dsKH);
				fis.close();
				oos.close();
					return true;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
			return false;

}
	public static ArrayList<KhachHang>docFile(String path){
		ArrayList<KhachHang>dsKH = new ArrayList<KhachHang>();
		try{
			FileInputStream fis = new FileInputStream(path);
				ObjectInputStream ois = new ObjectInputStream(fis);
					Object data = ois.readObject();
					dsKH = (ArrayList<KhachHang>) data;
		}catch (Exception e) {
				e.printStackTrace();
		}
		
		return dsKH;
		}
}
