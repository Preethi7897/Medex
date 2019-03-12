package org.medex.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import org.medex.beans.Doctor;
import org.medex.service.DoctorService;
import org.medex.service.DoctorServiceImpl;


@WebServlet("/doc_reg")
public class DoctorRegister extends HttpServlet {
                private static final long serialVersionUID = 1L;
       
    
    public DoctorRegister() {
        super();
    }

    DoctorService doc_serv=new DoctorServiceImpl();
                protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                                response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        String pwd=request.getParameter("pwd");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String gender=request.getParameter("gender");
		int age=Integer.parseInt(request.getParameter("age"));
		String qualification=request.getParameter("qualification");
		String specialization=request.getParameter("specialization");
		String contact_no=request.getParameter("contact_no");
		String email=request.getParameter("email");
		String address=request.getParameter("addres");
		int zipcode=Integer.parseInt(request.getParameter("zipcode"));
		String city=request.getParameter("city");

        boolean res=doc_serv.registerDoctor(new Doctor(fname,lname,pwd,gender,age,qualification,specialization,contact_no,email,address,zipcode,city));
        if(res==true)
        {
                  RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
                                               rd.forward(request, response);
        }
         else
         {
               RequestDispatcher rd=request.getRequestDispatcher("register_doc.jsp");
                                rd.forward(request, response); 
         }
        pw.close();
                }

}
