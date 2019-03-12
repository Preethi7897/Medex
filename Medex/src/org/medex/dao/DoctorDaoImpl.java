package org.medex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.medex.beans.Doctor;
import org.medex.util.DBConstants;
import org.medex.util.DBUtil;

public class DoctorDaoImpl implements DoctorDao {

	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs = null;
	@Override
	public boolean insertRegistration(Doctor d) {
		
		boolean b=false;	
		int c=0;
		String role="doctor";
		try {
			con=(Connection) DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL, DBConstants.UNAME, DBConstants.PWD);
			
			pst = con.prepareStatement("select * from doctor");
			rs=pst.executeQuery();
			while(rs.next())
				c=c+1;
			String did="D"+c;
			pst=con.prepareStatement("insert into doctor values(?,?,?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, did);
			pst.setString(2, d.getFname());
			pst.setString(3, d.getLname());
			pst.setString(4, d.getGender());
			pst.setInt(5, d.getAge());
			pst.setString(6, d.getQualification());
			pst.setString(7, d.getSpecialization());
			pst.setString(8, d.getContact_no());
			pst.setString(9, d.getEmail());
			pst.setString(10, d.getAddress());
			pst.setInt(11, d.getZipcode());
			pst.setString(12, d.getCity());
			int r1=pst.executeUpdate();
			
			pst = con.prepareStatement("insert into user values(?,?,?)");
			pst.setString(1, did);
			pst.setString(2, d.getPwd());
			pst.setString(3, role);
			int r2 = pst.executeUpdate();
			if (r1 > 0 && r2 > 0)
				b = true;
			else
				b = false;
			System.out.println(b);
			con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return b;
	}

}
