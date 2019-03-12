package org.medex.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//import org.medex.beans.Appointment;
import org.medex.beans.Patient;
import org.medex.util.DBConstants;
import org.medex.util.DBUtil;

public class PatientDaoImpl implements PatientDao {

	Connection con = null;
	Statement st = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	public boolean insertRegistration(Patient p) {
		int c = 0;
		String role="patient";
		boolean b = false;
		try {
			con =(Connection) DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL,
					DBConstants.UNAME, DBConstants.PWD);
			pst = con.prepareStatement("select * from patient");
			rs=pst.executeQuery();
			while(rs.next())
				c=c+1;
			String pid="P"+c;
			pst = con
					.prepareStatement("insert into patient values(?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, pid);
			pst.setString(2, p.getFname());
			pst.setString(3, p.getLname());
			pst.setInt(4, p.getAge());
			pst.setString(5, p.getGender());
			pst.setString(6, p.getPhn_number());
			pst.setString(7, p.getEmail());
			pst.setString(8, p.getAddress());
			pst.setInt(9, p.getZipcode());
			pst.setString(10, p.getCity());
			int r1 = pst.executeUpdate();
			pst = con.prepareStatement("insert into user values(?,?,?)");
			pst.setString(1, pid);
			pst.setString(2, p.getPwd());
			pst.setString(3, role);
			int r2 = pst.executeUpdate();
			if (r1 > 0 && r2 > 0)
				b = true;
			else
				b = false;
			con.close();

		} catch (Exception e2) {
			e2.printStackTrace();
		}

		return b;

	}

	/*
	 * @Override public boolean insertAppointment(Appointment a) { boolean
	 * b=false; try { con=DBUtil.getConnection(DBConstants.DRIVER,
	 * DBConstants.URL, DBConstants.UNAME, DBConstants.PWD);
	 * pst=con.prepareStatement("insert into patient values(?,?,?,?)");
	 * pst.setString(1, a.getSpecialist_category()); pst.setString(2,
	 * a.getDate()); pst.setString(3, a.getTime()); pst.setString(4,
	 * a.getDoctor_name());
	 * 
	 * int r=pst.executeUpdate(); if(r>0) b=true; else b=false; con.close();
	 * 
	 * } catch (Exception e2) { e2.printStackTrace(); }
	 * 
	 * return b; }
	 * 
	 * @Override public Appointment selectAppointment(Appointment a) {
	 * 
	 * Appointment app= null; try { con =
	 * DBUtil.getConnection(DBConstants.DRIVER,
	 * DBConstants.URL,DBConstants.UNAME , DBConstants.PWD); pst =
	 * con.prepareStatement("select * from patient where date = ?");
	 * pst.setString(1, app.getDate()); rs = pst.executeQuery(); rs.next(); app
	 * = new Appointment(rs.getString(1),rs.getString(2),rs.getString(3),
	 * rs.getString(4)); con.close();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * return app; }
	 * 
	 * 
	 * 
	 * @Override public boolean deleteAppointment(int appid) {
	 * 
	 * return false; }
	 */

}
