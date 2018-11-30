package model;


public class nguoidung {
	 private String manguoidung;
	 private String matkhau;
	 private String quyen;
	 private String tenNguoiDung;
	 
	 public String getTenNguoiDung() {
		return tenNguoiDung;
	}
	public void setTenNguoiDung(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}
	public nguoidung()
	 {
	 
	 }
	 public String getManguoidung() {
		return manguoidung;
	}
	public void setManguoidung(String manguoidung) {
		this.manguoidung = manguoidung;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getQuyen() {
		return quyen;
	}
	public void setQuyen(String quyen) {
		this.quyen = quyen;
	}
	public nguoidung (String manguoidung,String matkhau,String quyen, String tenNguoiDung)
	 {
		 this.manguoidung=manguoidung;
		 this.matkhau=matkhau;
		 this.quyen=quyen;
		 this.tenNguoiDung = tenNguoiDung;
	 }
	
}
