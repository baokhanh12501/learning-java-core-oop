package GSach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class XLSach {
	Connection cn; 
	public static Connection getCon() {
		Connection cn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost/DBStudent", "root","khanh12501" );
		}
		catch (ClassNotFoundException | SQLException e ) {
		}
		return cn;
	}
	static public ArrayList<Sach> GetSA(){
		Connection cn = getCon();
		String sql = "Select * from dlsach.tbsach";
		ArrayList<Sach> lss = new ArrayList<>();
		try {
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Sach s = new Sach();
				s.setMaSach(rs.getString("MaS"));
				s.setTenSach(rs.getString("TenS"));
				s.setNamXB(rs.getInt("NamXB"));
				s.setGiaBan(rs.getDouble("GiaB"));
				lss.add(s);
			}
		}catch (SQLException e) {
			
		}
		return lss;
	}
	public boolean delete(int namXB) {
		Connection cn = getCon();
		String sql = "Delete from dlsach.tbsach where NamXB = ?";
		try {
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
			String temp = Integer.toString(namXB);
			ps.setString(1, temp);
			ps.executeUpdate();
			cn.close();
			return true;
		}catch(SQLException e) {
			return false;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(GetSA().size());
	}
}
