package GTS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.security.sasl.Sasl;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IThisinh extends JFrame {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	public IThisinh() {}
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
		@SuppressWarnings({ "unchecked", "hiding" })
		static public <Thisinh, DLTS> ArrayList<Thisinh> GetTS(){
			Connection cn = getCon();
			String sql = "SELECT * FROM dlts.tbthisinh";
			ArrayList<Thisinh> lss = new ArrayList<>();
			try {
				PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
				} ps = (PreparedStatement) cn.prepareStatement(sql);
					Thisinh s = new Thisinh();
					((GTS.Thisinh) s).setSoBD(rs.getInt("SoBD"));
					((GTS.Thisinh) s).setHoTen(rs.getString("HoTen"));
					((GTS.Thisinh) s).setGioiTinh(rs.getString("GioiTinh"));
					((GTS.Thisinh) s).setNganhHoc(rs.getString("NganhHoc"));
					((GTS.Thisinh) s).setTongDiem(rs.getDouble("TongDiem"));
					lss.add((Thisinh) s);
			}catch (SQLException e) {
				
			}
			ArrayList<Thisinh> lss2 = (ArrayList<Thisinh>) extracted(lss);
			return (ArrayList<Thisinh>) lss2;
		}
		@SuppressWarnings("unchecked")
		private static <DLTS> ArrayList<Thisinh> extracted(ArrayList<DLTS> lss) {
			return (ArrayList<Thisinh>) lss;
		}
		public boolean insert(){
			Connection cn = getCon();
			String sql = "Insert FROM dlts.tbthisinh ? ";
			try {

			
		}
		public static void main(String[] args) {
			System.out.println(GetTS().size());
		}
		}