/*
 * JSP generated by Resin-3.0.21 (built Thu, 10 Aug 2006 12:03:19 PDT)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.util.*;
import java.sql.*;

public class _main__jsp extends com.caucho.jsp.JavaPage{
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.Application _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = com.caucho.jsp.QJspFactory.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      
try{
     Class.forName("org.gjt.mm.mysql.Driver");
}catch(Exception E){
     System.out.println("First: " + E);
		 
      out.write(_jsp_string1, 0, _jsp_string1.length);
      out.print((E));
      
}
try {
Connection MyConnection= DriverManager.getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk/stewarttaylor","stewarttaylor","ac31004");

Statement st    = null;
ResultSet rs;
 st = MyConnection.createStatement();
 rs = st.executeQuery("Select * from user");
 while (rs.next() ){
	 
      out.write(_jsp_string2, 0, _jsp_string2.length);
      out.print((rs.getInt("user_id")));
      out.write(_jsp_string3, 0, _jsp_string3.length);
      out.print((rs.getString("email")));
      out.write(_jsp_string3, 0, _jsp_string3.length);
      out.print((rs.getString("username")));
      out.write(_jsp_string4, 0, _jsp_string4.length);
       
 }
 rs.close();
 MyConnection.close();
 
 }catch(Exception E){
     System.out.println("Second: " + E);
		 
      out.write(_jsp_string5, 0, _jsp_string5.length);
      out.print((E));
      
}

      out.write(' ');
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      com.caucho.jsp.QJspFactory.freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.make.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.util.CauchoSystem.getVersionId() != -6418134904411496499L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.make.Dependency depend;
      depend = (com.caucho.make.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("main.jsp"), -7541001238512284671L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string4;
  private final static char []_jsp_string3;
  private final static char []_jsp_string1;
  private final static char []_jsp_string2;
  private final static char []_jsp_string5;
  private final static char []_jsp_string0;
  static {
    _jsp_string4 = "</p> \r\n 		".toCharArray();
    _jsp_string3 = "</p> \r\n	 <p>".toCharArray();
    _jsp_string1 = "<p>Can not get Class ".toCharArray();
    _jsp_string2 = "<p>".toCharArray();
    _jsp_string5 = "<p>Can not execute query ".toCharArray();
    _jsp_string0 = "\r\n".toCharArray();
  }
}
