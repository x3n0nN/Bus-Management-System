package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import Model.schedules;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public final class Student_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Student/Faculty</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"CSS/bootstrap.min.css\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/homeBoot.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg bg-dark justify-content-between \">\n");
      out.write("\n");
      out.write("\t<div class=\"navbar-nav \">\n");
      out.write("\n");
      out.write("\t<a class=\"navbar-brand text-white \">Welcome User!</a>\n");
      out.write("\t\n");
      out.write("\t\t<a class=\"nav-item nav-link text-white mx-2\" href=\"Home.html\">Home</a>\n");
      out.write("\t\t<a class=\"nav-item nav-link text-white mx-2\" href=\"#\">Profile</a>\n");
      out.write("\t\t<a class=\"nav-item nav-link text-white mx-2\" href=\"About.html\">About</a>\n");
      out.write("                <a class=\"nav-item nav-link text-white mx-2\" href=\"Search.jsp\">Search</a>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<a type=\"button\"  class=\"btn btn-outline-light\" href=\"Home.html\" >Logout</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"container text-center text-white display-3 p-2 mt-3\">Schedules</div>\n");
      out.write("<div class=\"container text-center text-white border border-light\">\n");
      out.write("\t<table class=\"table stripped-table\">\n");
      out.write("\t\t<thead class=\"h4 text-warning\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>Bus Number</th>\n");
      out.write("\t\t\t\t<th>Bus Route</th>\n");
      out.write("\t\t\t\t<th>Drop Point</th>\n");
      out.write("\t\t\t\t<th>Pickup Point</th>\n");
      out.write("\t\t\t\t<th>Time</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</thead>\n");
      out.write("\t\t ");
 
                    String number,pick,drop,route,time;
                    Configuration cf = null;
                    SessionFactory sf = null;
                    Session s = null;
                    schedules sch = null;
                    try{
                        cf = new Configuration();
                        cf.configure();
                        sf = cf.buildSessionFactory();
                        s = sf.openSession();
                        Query q = s.createQuery("from schedules");
                        Iterator it = q.iterate();
                        while (it.hasNext()){
                            
                            sch = (schedules)it.next();
                            number = sch.getNumber();
                            pick = sch.getPickupp();
                            drop = sch.getDropp();
                            route = sch.getRoute();
                            time = sch.getTime();
                            System.out.println(number);
                            
                
      out.write("        \n");
      out.write("                \n");
      out.write("\t\t\t<tr>\n");
      out.write("                            <td>");
      out.print(number);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(route);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(drop);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(pick);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(time);
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        \n");
      out.write("                        ");

                            }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    
                
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t</tbody>\n");
      out.write("\t</table>\n");
      out.write("</div>\n");
      out.write("<!--\n");
      out.write("</div>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
