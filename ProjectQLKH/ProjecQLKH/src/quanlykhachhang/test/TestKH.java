package quanlykhachhang.test;

import java.util.ArrayList;
import java.util.Scanner;

import quanlykhachhang.model.KhachHang;
import quanykhachhang.ois.Serilezia;

public class TestKH {
	public static void main(String[] args) {
		while(true){
			menu();
		}
	}
	static ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
	public static void menu(){
		System.out.println("1.NHẬP THÔNG TIN KHÁCH HÀNG");
		System.out.println("2.XUẤT DANH SÁCH KHÁCH HÀNG");
		System.out.println("3.LỌC DANH SÁCH KHÁCH HÀNG");
		System.out.println("4.LIỆT KÊ DANH SÁCH ");
		System.out.println("5.TÌM KIẾM KHÁCH HÀNG");
		System.out.println("6.THOÁT ỨNG DỤNG");
		System.out.println("NHẬP TỪ 1....6 ĐỂ THỰC HIỆN CÁC THAO TÁC");
			int chon = new Scanner(System.in).nextInt();
				switch (chon) {
				case 1:
					xuLyNhap();
						break;
				case 2:
					xuLyXuat();
						break;
				case 3: 
					xuLyLoc();
						break;
				case 4:
					xuLyLietKe();
						break;
				case 5:
					xuLyTimKiem();
						break;
				case 6:
					xuLyThoat();
						break;
				default:
					System.out.println("BẠN ĐÃ NHẬP SAI THAO TÁC");
					break;
				}
	}

	private static void xuLyThoat() {
			System.out.println("CÁM ƠN BẠN ĐÃ SỬ DỤNG PHẦN MỀM CỦA CHÚN TÔI ............BYE BYE");
			System.exit(0);
	}

	private static void xuLyTimKiem() {
		System.out.println("#####################################################");
			System.out.println("INPUT SEARCH NAME ");
				String name1 = new Scanner(System.in).nextLine();
					ArrayList<KhachHang>dsKH1 = Serilezia.docFile("D:\\DSKH.txt");
					System.out.println("\tNAME\tOLD\tNUBER ID\tNUBER ROM\tPHONE");
			for(KhachHang kh : dsKH1){
				if(kh.getName().startsWith(name1)){
					System.out.println(kh);
				}
				else 
					System.out.println("SEARCH FAIL");
					
			}
	}

	private static void xuLyLietKe() {
		System.out.println("#####################################################");
			System.out.println("CÁC KHÁCH HÀNG CÓ ĐẦU SỐ MOBI ");
			System.out.println("\tNAME\tOLD\tNUBER ID\tNUBER ROM\tPHONE");
				ArrayList<KhachHang>dskh1 = Serilezia.docFile("D:\\DSKH.txt");
					for(KhachHang kh : dskh1){
						if(kh.getPhone().startsWith("0121"))
							System.out.println(kh);
								
					}
				System.out.println("CÁC KHÁCH HÀNG CÓ ĐẦU SỐ VIETTEL");
				System.out.println("\tNAME\tOLD\tNUBER ID\tNUBER ROM\tPHONE");
					for(KhachHang kh : dskh1){
						if(kh.getPhone().startsWith("016"))
							System.out.println(kh);
					}
				
				
	}

	private static void xuLyLoc() {
		
	}

	private static void xuLyXuat() {
		System.out.println("#####################################################");
		System.out.println("\tNAME\tOLD\tNUBER ID\tNUBER ROM\tPHONE");
				ArrayList<KhachHang>dsKH1 = Serilezia.docFile("D:\\DSKH.txt");
			for(KhachHang kh : dsKH1){
				System.out.println(kh);
			}
	}

	private static void xuLyNhap() {
		
			while(true){
				KhachHang kh = new KhachHang();
				System.out.println("IPUT NAME");
					String name = new Scanner(System.in).nextLine();
						kh.setName(name);
				System.out.println("INPUT OLD");
					int old = new Scanner( System.in).nextInt();
						kh.setOld(old);
				System.out.println("INPUT NUMBER ID");
					int numberID = new Scanner(System.in).nextInt();
						kh.setNumberID(numberID);
				System.out.println("INPUT NUMBER ROM");
					int numberRom = new Scanner(System.in).nextInt();
						kh.setNumberRom(numberRom);
				System.out.println("INPUT NUMBER PHONE");
					String phone = new Scanner( System.in).nextLine();
						kh.setPhone(phone);
							dsKH.add(kh);
				System.out.println("CHOSE 1 THE CONTINUE");
				System.out.println("CHOSE 0 THE EXIT ");
					int chon = new Scanner(System.in).nextInt();
						if(chon == 0 )
						{
							boolean kt = Serilezia.luuFile(dsKH,"D:\\DSKH.txt");
								if(kt == true)
									System.out.println("SAVE DONE");
								else
									System.out.println("SAVE FAIL");
								
											break;
						}
			}
		
			
	}

}
