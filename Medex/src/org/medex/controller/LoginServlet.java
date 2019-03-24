package org.medex.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.medex.beans.Display;
import org.medex.beans.User;
import org.medex.service.LoginService;
import org.medex.service.LoginServiceImpl;
import org.medex.service.PatientService;
import org.medex.service.PatientServiceImpl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@WebServlet("/login_serv")
public class LoginServlet extends HttpServlet {
                private static final long serialVersionUID = 1L;
                LoginService log_serv = new LoginServiceImpl();
                PatientService patService=new PatientServiceImpl();
                User u = new User();
                User res = new User();
                RequestDispatcher rd=null;
                List<Display> app_id=null;
                Display d=new Display();
                PatientService pat_serv=new PatientServiceImpl();
                PrintWriter pw=null;
                protected void doPost(HttpServletRequest request, HttpServletResponse response)
                                                throws ServletException, IOException {
                                response.setContentType("text/html");
                                PrintWriter pw = response.getWriter();
                                String id = request.getParameter("pid");
                                String pwd = request.getParameter("pwd");

                                String role = "";
                                u.setId(id);
                                u.setPwd(pwd);
                                res = log_serv.validateUser(u);
                                if (res != null) {
                                                role = res.getRole();
                                                HttpSession session=request.getSession();
                                                session.setAttribute("id", id);
                                                session.setAttribute("name",res.getName());
                                                session.setAttribute("role",res.getRole());
                                                if (role.contentEquals("patient")) {

                                                	rd = request.getRequestDispatcher("patient.jsp");
															  d.setPatId(id); 
															  app_id=pat_serv.viewAppointment(d); 
															  
                                                         		Type listType = new TypeToken<List<Display>>() {}.getType();
                                                                Gson gson = new Gson();
                                                                String j = gson.toJson(app_id, listType);
                                                                System.out.println("to string"+j);
                                                                request.setAttribute("list",j);
				/*
				 * List<Display> o=new ArrayList<Display>();
				 * 
				 * o = gson.fromJson(j, listType); for(Display d:o) {
				 * System.out.println(d.getDocName()); }
				 */
				 
                                                                
                                                                
                                                          
                                                                
                                                } else if (role.contentEquals("doctor")) {
                                                               
                                                                rd = request.getRequestDispatcher("doctor.jsp");
                                                }
                                                
                                }
                                else {
                                    rd = request.getRequestDispatcher("login.jsp");
                                }
                                    rd.forward(request, response);
                    
                                    
                                    //Display data = new Gson().fromJson((String)request.getAttribute("list"), Display.class);
                                   
                                //pw.close();

                }

}
