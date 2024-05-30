package GSach;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class GUI_delSA extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tb_sach;

	Vector<Object> columns = new Vector<>();
	Vector<Vector<Object>> rows = new Vector<>();
	DefaultTableModel dtm = new DefaultTableModel();
	XLSach  xl = new XLSach();
	JComboBox<?> cb_namxb;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_delSA frame = new GUI_delSA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public GUI_delSA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nam XB");
		lblNewLabel.setBounds(88, 56, 108, 58);
		contentPane.add(lblNewLabel);
		
		cb_namxb = new JComboBox();
		cb_namxb.setModel(new DefaultComboBoxModel(new String[] {"2019", "2020", "2021"}));
		cb_namxb.setBounds(225, 56, 66, 33);
		contentPane.add(cb_namxb);
		
		JButton btn_xoa = new JButton("Xoa sach");
		btn_xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không?", "Thong bao",
						JOptionPane.YES_NO_CANCEL_OPTION) == 0){
					if(delete()) {
						getAllSach();
					}
			
		}
					
			}
		});
		btn_xoa.setBounds(373, 56, 96, 38);
		contentPane.add(btn_xoa);
		
		tb_sach = new JTable();
		tb_sach.setBounds(88, 141, 562, 278);
		contentPane.add(tb_sach);
		
		columns.add("Ma Sach");
		columns.add("Ten Sach");
		columns.add("NamXB Sach");
		columns.add("Gia Sach");
		
		getAllSach();
		
	}

	private void getAllSach() {
		dtm.setNumRows(0);
		for(int i=0;i<XLSach.GetSA().size();i++) {
			Sach s = (Sach) XLSach.GetSA().get(i);
			Vector<Object> row = new Vector<>();
			row.add(s.getMaSach());
			row.add(s.getTenSach());
			row.add(s.getNamXB());
			row.add(s.getGiaBan());
			rows.add(row);
		}
		dtm.setDataVector(rows, columns);
		dtm.insertRow(0, columns);
		tb_sach.setModel(dtm);
	}
	public boolean delete() {
		int namXB = Integer.parseInt(cb_namxb.getSelectedItem().toString()); 
		boolean b = xl.delete(namXB);
		return b;
	}
}
