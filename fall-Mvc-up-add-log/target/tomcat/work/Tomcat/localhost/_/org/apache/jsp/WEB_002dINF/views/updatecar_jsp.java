/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-09-20 18:26:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updatecar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/common/navigation.jspf", Long.valueOf(1630842725535L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jspf", Long.valueOf(1630873692598L));
    _jspx_dependants.put("/WEB-INF/views/common/header.jspf", Long.valueOf(1632129777209L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\tbody{\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\t\t\t\twidth: 100%;\r\n");
      out.write("\t\t\t\theight: 60px;\r\n");
      out.write("\t\t\t\tbackground-color: #f5f5f5;\r\n");
      out.write("</body>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("position: absolute;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<a href=\"/\" class=\"brand\">Saraya</a>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li> <a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t<li><a href=\"/formation.do\">Courses</a></li>\r\n");
      out.write("\t\t<li><a href=\"https://www.sarayatechsolutions.com\">SarayaTech</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"/logout.do\">Logout</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("\t\t<legend>Update article</legend>\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t<form method = \"post\" modelAttribute=\"rapide\">\r\n");
      out.write("\t\t<form:hidden path=\"id\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\tyear: <input type=\"text\" path=\"year\" required=\"required\"/>\r\n");
      out.write("\t\t\t\tmake: <input type=\"text\" path=\"make\" required=\"required\"/>\r\n");
      out.write("\t\t\t\tmodel: <input type=\"text\" path=\"mode\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t<input type=\"submit\"/>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t  \r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t<h1>-------------------------------------------------</h1>\r\n");
      out.write("\t\t\t<div>Footer content</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write('	');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
