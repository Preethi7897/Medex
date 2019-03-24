package org.medex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.medex.beans.Display;
import org.medex.beans.Doctor;
import org.medex.util.DBConstants;
import org.medex.util.DBUtil;

public class DoctorDaoImpl implements DoctorDao {

	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	@Override
	public String insertRegistration(Doctor d) {

		String did = null;
		int c = 0, r1 = 0, r2 = 0;
		String role = "doctor";
		try {
			con = (Connection) DBUtil.getConnection(DBConstants.DRIVER,
					DBConstants.URL, DBConstants.UNAME, DBConstants.PWD);

			pst = con.prepareStatement("select * from doctor");
			rs = pst.executeQuery();
			while (rs.next())
				c = c + 1;
			did = "D" + c;
			pst = con
					.prepareStatement("insert into doctor values(?,?,?,?,?,?,?,?,?,?,?,?)");
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
			r1 = pst.executeUpdate();

			pst = con.prepareStatement("insert into user values(?,?,?)");
			pst.setString(1, did);
			pst.setString(2, d.getPwd());
			pst.setString(3, role);
			r2 = pst.executeUpdate();

			con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		if (r1 > 0 && r2 > 0) {
			return did;
		} else {
			return null;
		}

	}
	public List<Display> viewAppointment(Display d,String id)
	{
		List<Display> display=new ArrayList<>();
        Connection con=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        ResultSet rs1=null;
       
        try {
               con=DBUtil.getConnection(DBConstants.DRIVER,DBConstants.URL,DBConstants.UNAME, DBConstants.PWD);
              
             String selectQuery="select * from appointment where date_of_app=? and doc_id=?";
            pst=con.prepareStatement(selectQuery);
   			pst.setString(1, d.getAppDate());
   			pst.setString(2, id);
   			rs=pst.executeQuery();
   		
                                        while(rs.next())
                                        {
                                        	
                                        	 Display d1=new Display();
                                        	 String selectDoctor="select * from patient where pid=?";	                            
                                        	 pst=con.prepareStatement(selectDoctor);
                                        	 pst.setString(1, rs.getString("pat_id"));
                                        	 rs1=pst.executeQuery();
                                        	 if(rs1.next())
                                        	 {
                                        		 d1.setPatName(rs1.getString("fname")+" "+rs1.getString("lname"));
                                        		 d1.setPatContactNo(rs1.getString("phn_number"));
                                        		 d1.setPatEmail(rs1.getString("email"));
                                        		 d1.setPatAddress(rs1.getString("address")+","+rs1.getString("city")+"-"+rs1.getString("zipcode"));
                                        		 d1.setPatAge(rs1.getString("age"));
                                        		 d1.setPatGender(rs1.getString("gender"));
                                        	 }
                                        	 
                                        	   d1.setAppBookDate(rs.getString("date_time_booked"));
                                        	   d1.setTimeSlot(rs.getString("time_of_app"));
                                        	  
                                               display.add(d1);
                                              
                                        }
                                        con.close();
                        } 
                        catch (Exception e) 
                        {
                                        e.printStackTrace();
                        }
                        
                        return display;
        }

}
