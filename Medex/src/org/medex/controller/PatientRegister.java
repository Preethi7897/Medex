package org.medex.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.medex.beans.Patient;
import org.medex.service.PatientService;
import org.medex.service.PatientServiceImpl;


@WebServlet("/pat_reg")
public class PatientRegister extends HttpServlet {
                private static final long serialVersionUID = 1L;
       
    
    public PatientRegister() {
        super();
    }

    PatientService pat_serv=new PatientServiceImpl();
                protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                                response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String pwd=request.getParameter("pwd");
        int age=Integer.parseInt(request.getParameter("age"));
        String gender=request.getParameter("gender");
        String phn_number=request.getParameter("phn_number");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        int zipcode=Integer.parseInt(request.getParameter("zipcode"));
        String city=request.getParameter("city");

        boolean res=pat_serv.registerPatient(new Patient(fname,lname,pwd,age,gender,phn_number,email,address,city,zipcode));
        if(res==true)
        {
                  RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
                                               rd.forward(request, response);
        }
         else
         {
               RequestDispatcher rd=request.getRequestDispatcher("register_pat.jsp");
                                rd.forward(request, response); 
         }
        pw.close();
                }

}
