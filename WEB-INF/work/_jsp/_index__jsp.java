/*
 * JSP generated by Resin-3.0.21 (built Thu, 10 Aug 2006 12:03:19 PDT)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _index__jsp extends com.caucho.jsp.JavaPage{
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
      uk.ac.dundee.computing.stewarttaylor.MessageBean msgBean;
      synchronized (session) {
        msgBean = (uk.ac.dundee.computing.stewarttaylor.MessageBean) session.getAttribute("msgBean");
        if (msgBean == null) {
          msgBean = new uk.ac.dundee.computing.stewarttaylor.MessageBean();
          session.setAttribute("msgBean", msgBean);
        }
      }
      out.write(_jsp_string1, 0, _jsp_string1.length);
      

try 
{

	String[] names = msgBean.getUsername();
	String[] dates = msgBean.getDate();
	String[] messages = msgBean.getMessage();
	String[] images = msgBean.getImage();
	boolean[] canDelete = msgBean.getCanDelete();
	int[] id = msgBean.getID();
 
 
 
 for(int i = 0 ; i< names.length ; i++)
 {
 
 
 
 
 
	 
      out.write(_jsp_string2, 0, _jsp_string2.length);
       out.println(names[i]); 
      out.write(_jsp_string3, 0, _jsp_string3.length);
       out.println(names[i]); 
      out.write(_jsp_string4, 0, _jsp_string4.length);
      
				if (canDelete[i] == true)
				{
			   
      out.write(_jsp_string5, 0, _jsp_string5.length);
       out.println(id[i]); 
      out.write(_jsp_string6, 0, _jsp_string6.length);
      
				}
				
      out.write(_jsp_string7, 0, _jsp_string7.length);
       out.println(images[i]); 
      out.write(_jsp_string8, 0, _jsp_string8.length);
       out.println(dates[i]); 
      out.write(_jsp_string9, 0, _jsp_string9.length);
       out.println(messages[i]); 
      out.write(_jsp_string10, 0, _jsp_string10.length);
       
 
 }
 }
 catch(Exception E)
 {
    out.println("<h3> No Posts Retrieved</h3>");
	
}

      out.write(_jsp_string11, 0, _jsp_string11.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("index.jsp"), -2406850605476166725L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("parts/messagesDisplay.jsp"), -6427251902778164161L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("parts/Signup.jsp"), -7554159037385008641L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string9;
  private final static char []_jsp_string6;
  private final static char []_jsp_string5;
  private final static char []_jsp_string7;
  private final static char []_jsp_string8;
  private final static char []_jsp_string1;
  private final static char []_jsp_string11;
  private final static char []_jsp_string10;
  private final static char []_jsp_string2;
  private final static char []_jsp_string4;
  private final static char []_jsp_string0;
  private final static char []_jsp_string3;
  static {
    _jsp_string9 = "</p>\r\n			   </div>\r\n		   \r\n		   \r\n		   </div>\r\n		   \r\n		   \r\n		   \r\n		   	<div id=\"msgText\">\r\n		   <p>\r\n		   ".toCharArray();
    _jsp_string6 = "\"><img src=\"/stewarttaylor/Images/Delete.png\" alt=\"Delete\" /> </a>\r\n				</div>\r\n				\r\n				\r\n				 ".toCharArray();
    _jsp_string5 = "\r\n				\r\n				<div id=\"msgDelete\">\r\n					<a href=\"/stewarttaylor/deletemessage/".toCharArray();
    _jsp_string7 = "\r\n				\r\n				</div>\r\n	   \r\n	   \r\n	    <div id=\"msgProfile\">\r\n		\r\n		\r\n					<div id=\"msgImage\">\r\n					<img src=\"".toCharArray();
    _jsp_string8 = "\" alt=\"Avatar\" />\r\n			   </div>\r\n			   \r\n			   \r\n							 <div id=\"msgTime\">\r\n				<p>".toCharArray();
    _jsp_string1 = "\r\n	\r\n	\r\n	   ".toCharArray();
    _jsp_string11 = " \r\n	\r\n	\r\n	\r\n	\r\n	\r\n	\r\n	\r\n\r\n			 \r\n			 \r\n			\r\n			   \r\n			   \r\n		</div>\r\n		\r\n		\r\n		\r\n		 \r\n		 \r\n			\r\n	 \r\n		\r\n			\r\n			</div><!--end of left content-->\r\n\r\n\r\n\r\n			<div id=\"right_content\">\r\n			\r\n				\r\n<script language=\"javascript\">\r\n\r\n\r\nfunction passResponse2()\r\n {\r\n\r\n \r\n \r\ndocument.hform2.username.value = document.register.username.value;\r\ndocument.hform2.password.value = MD5(document.register.password.value);\r\ndocument.hform2.password2.value = MD5(document.register.password2.value);\r\ndocument.register.password.value = \"\";\r\ndocument.register.password2.value = \"\";\r\n\r\n\r\n\r\ndocument.hform2.submit();\r\n\r\n\r\n}\r\n\r\n\r\n</script>\r\n\r\n\r\n\r\n\r\n<div id=\"signup_box\">\r\n			\r\n	<h4>Join Today</h4>\r\n			\r\n			<form name=\"hform2\" action=\"/stewarttaylor/signup/\" method=\"post\" >\r\n<input type=\"hidden\" name=\"username\">\r\n<input type=\"hidden\" name=\"password\">\r\n<input type=\"hidden\" name=\"password2\">\r\n			</form>\r\n			\r\n	<form name=\"register\"  method=\"Post\">\r\n			\r\n			<div id=\"signup_item\">\r\n				Username  <input type=\"text\"  class =\"tb3\" name=\"username\" maxlength=\"30\" />\r\n			</div>\r\n				\r\n			<div id=\"signup_item\">\r\n				Password  <input type=\"password\"  class =\"tb3\" name=\"password\" maxlength=\"30\" />\r\n			</div>\r\n				\r\n			<div id=\"signup_item\">\r\n				Password Again  <input type=\"password\"  class =\"tb3\" name=\"password2\" maxlength=\"30\" />\r\n			</div>\r\n	\r\n		<input type=\"submit\"    onClick=\"passResponse2(); return false;\"  class=\"btn1\" value=\"Sign Up\" />\r\n	</form>	\r\n</div>\r\n\r\n\r\n\r\n				\r\n			</div><!--end of right content-->\r\n\r\n\r\n		 <div style=\"clear: both;\">\r\n		 </div><!-- #content-->\r\n\r\n\r\n\r\n		<footer id=\"footer\">\r\n			<p>Created By Stewart Taylor</p>\r\n		</footer><!-- #footer -->\r\n\r\n	</div><!-- #wrapper -->\r\n\r\n\r\n\r\n</body>\r\n\r\n</html>".toCharArray();
    _jsp_string10 = "\r\n		   </textarea></p>\r\n		   </div>\r\n		   \r\n	   \r\n		   \r\n		  \r\n		  \r\n		   \r\n		   \r\n\r\n		   \r\n		   \r\n		  \r\n		   \r\n		   \r\n		 \r\n		   \r\n	   </div>\r\n	   \r\n	 \r\n	 \r\n	 \r\n	 \r\n 		".toCharArray();
    _jsp_string2 = "\r\n	 \r\n	\r\n	 <div id=\"msgbox\">\r\n	   \r\n	   \r\n	   	   		<div id=\"msgUser\">\r\n				<a href=\"/stewarttaylor/profile/".toCharArray();
    _jsp_string4 = "</a>\r\n				\r\n\r\n				 ".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n<!DOCTYPE html>\r\n\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n\r\n	<head>\r\n		<meta charset=\"utf-8\" />\r\n		<!--[if IE]><script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script><![endif]-->\r\n		<title> </title>\r\n		<meta name=\"keywords\" content=\"\" />\r\n		<meta name=\"description\" content=\"\" />\r\n		<link rel=\"stylesheet\" href=\"/stewarttaylor/style.css\" type=\"text/css\" media=\"screen, projection\" />\r\n\r\n		<script language=\"javascript\" src=\"md5.js\"></script>\r\n		\r\n	</head>\r\n\r\n<body>\r\n\r\n	<div id=\"wrapper\">\r\n\r\n\r\n\r\n\r\n		<div id=\"header\">\r\n\r\n\r\n<script language=\"javascript\">\r\nfunction passResponse()\r\n {\r\ndocument.hform.un.value = document.login.un.value;\r\ndocument.hform.pw.value = MD5(document.login.pw.value);\r\ndocument.login.pw.value = \"\";\r\ndocument.hform.submit();\r\n\r\n\r\n}\r\n\r\n</script>\r\n		\r\n		\r\n			<div id = \"logobox\">\r\n				<img src=\"Images/Logo.png\" alt=\"Logo\" />\r\n			</div>\r\n\r\n				<div id=\"loginbox\">		\r\n				\r\n							<form name=\"hform\" action=\"/stewarttaylor/login/\" method=\"post\" >\r\n<input type=\"hidden\" name=\"un\">\r\n<input type=\"hidden\" name=\"pw\">\r\n			</form>\r\n				\r\n				\r\n					<form name=\"login\" method=\"post\" >\r\n						\r\n						<div id=\"loginbox_item\" >\r\n							Username <input type=\"text\" name=\"un\" />\r\n						</div>\r\n						\r\n						<div id=\"loginbox_item\" >\r\n							Password <input type=\"password\" name=\"pw\" />\r\n						</div>\r\n						\r\n						<div id=\"loginbox_button\">\r\n							<input onClick=\"passResponse(); return false;\" type=\"submit\"   class=\"btn2\" value=\"Login\" />\r\n						</div>\r\n						\r\n					</form>\r\n				</div>\r\n\r\n		</div>\r\n\r\n\r\n		<div id=\"content\">\r\n\r\n				\r\n		<div id=\"left_content\">\r\n		\r\n		<div id=\"recentmsgbox\">\r\n		\r\n					<h2>Recent Blab </h2>\r\n\r\n			  \r\n				\r\n				\r\n		".toCharArray();
    _jsp_string3 = "\">".toCharArray();
  }
}
