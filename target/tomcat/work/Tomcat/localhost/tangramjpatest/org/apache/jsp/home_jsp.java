/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-08-13 13:27:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.LocalDateTime;
import java.sql.Timestamp;
import java.net.InetAddress;
import java.time.LocalDate;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/resources/style.css", Long.valueOf(1628845581952L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css\">\n");
      out.write("    <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("    <script src=\"//ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/jquery-ui.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/themes/sunny/jquery-ui.css\">\n");
      out.write("    <style> ");
      out.write("\n");
      out.write("table {border-collapse: collapse; border: thin solid black; margin: 10px}\n");
      out.write("/*dialog css*/\n");
      out.write("/*#placeholder {text-align: center}*/\n");
      out.write("td, th {padding: 5px; width: 100px; text-align:center}\n");
      out.write(".modal-header{\n");
      out.write("  background-color: grey;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  margin: 5px;\n");
      out.write("}\n");
      out.write(".modal-title {\n");
      out.write("  background-color: grey;\n");
      out.write("  color: #f8f9fa;\n");
      out.write("  border-radius: 25px;\n");
      out.write("}\n");
      out.write(".modal-content{\n");
      out.write("  background-color:#e9ecef;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  width: 300px;\n");
      out.write("}\n");
      out.write(".model-button{\n");
      out.write("  border: black;\n");
      out.write("  color: black;\n");
      out.write("  background-color: gainsboro;\n");
      out.write("}\n");
      out.write(".dialog{\n");
      out.write("  width: 100% !important;\n");
      out.write("  border-radius: 25px;\n");
      out.write("}\n");
      out.write(".modal-footer {\n");
      out.write("  border-top: 1px solid black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".delete-button{\n");
      out.write("  color:red;\n");
      out.write("  background-color: #f8f9fa;\n");
      out.write("  border: 1px solid red;\n");
      out.write("  padding: 10px;\n");
      out.write("  text-decoration:none;\n");
      out.write("}\n");
      out.write(".delete-button:visited {\n");
      out.write("  color:red;\n");
      out.write("  text-decoration:none;\n");
      out.write("}\n");
      out.write(".delete-button:hover {\n");
      out.write("  color:red;\n");
      out.write("  text-decoration:none;\n");
      out.write("}\n");
      out.write(" </style>\n");
      out.write("\n");
      out.write("    <title>EMPLOYEES</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"dialog\"></div>\n");
      out.write("<div class=\"modal fade\" id=\"exampleModalCenter\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\"\n");
      out.write("     aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLongTitle\">Add employee</h5>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form id=\"sendForm\" action=\"/tangramjpatest/insert\" method=\"post\">\n");
      out.write("                    <div class=\"form-group \">\n");
      out.write("                        <label for=\"tz\">TZ (min 4 symbols)</label>\n");
      out.write("                        <div id=\"id\">\n");
      out.write("                            <input required min=\"1000\" name=\"tz\" type=\"number\" class=\"form-control\" id=\"tz\"\n");
      out.write("                                   placeholder=\"An identification number\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"name\" class=\"col-form-label\">Name</label>\n");
      out.write("                        <div>\n");
      out.write("                            <input required name=\"name\" type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Name\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"lastName\" class=\"col-form-label\">Surname</label>\n");
      out.write("                        <div class=\"\">\n");
      out.write("                            <input required name=\"lastName\" type=\"text\" class=\"form-control\" id=\"lastName\" placeholder=\"Surname\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"startWork\" class=\" col-form-label\">Date start</label>\n");
      out.write("                        <div class=\"\">\n");
      out.write("                            <input required max=\"");
      out.print(LocalDate.now());
      out.write("\" name=\"startWork\" type=\"date\" class=\"form-control\" id=\"startWork\"\n");
      out.write("                                   placeholder=\"date of commencement of work\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"birthday\" class=\" col-form-label\">Birthday (age of employee min 15 years old)</label>\n");
      out.write("                        <div class=\"\">\n");
      out.write("                            <input required type=\"date\" max=\"");
      out.print(LocalDate.now().minusYears(15));
      out.write("\" name=\"birthday\"  class=\"form-control\" id=\"birthday\"\n");
      out.write("                                   placeholder=\"Date of Birth\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn-add-employee\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                <button type=\"submit\" class=\"btn-add-employee\" form=\"sendForm\" class=\"btn btn-primary\">Save employee</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"card\">\n");
      out.write("    <div style=\"text-align: center\" class=\"card-body\"><H2> Employee`s table</H2>\n");
      out.write("        <table id=\"employeesTable\" class=\"table table-responsive-sm table-striped table-bordered\" width=\"100%\">\n");
      out.write("            <thead>\n");
      out.write("            <tr style=\"align-content: center\">\n");
      out.write("                ");
      out.write("\n");
      out.write("                <th scope=\"col\" style=\"width: 0%\"></th>\n");
      out.write("                <th scope=\"col\">TZ</th>\n");
      out.write("                <th scope=\"col\">Name</th>\n");
      out.write("                <th scope=\"col\">Surname</th>\n");
      out.write("                <th scope=\"col\">Date of Birth</th>\n");
      out.write("                <th scope=\"col\">Seniority</th>\n");
      out.write("\n");
      out.write("                <th scope=\"col\">Action</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("    <button class=\"btn-add-employee\" data-toggle=\"modal\" data-target=\"#exampleModalCenter\"\n");
      out.write("            style=\"width: 32% ;margin-left: auto; display: block\">Add employee\n");
      out.write("    </button>\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("        <footer id=\"footer\" class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md\"><span\n");
      out.write("                        class=\"text-muted \">Ip address of client: ");
      out.print(InetAddress.getLocalHost().getHostAddress());
      out.write("\n");
      out.write("                    </span></div>\n");
      out.write("                    <div class=\"col-md text-md-right\"><span>\n");
      out.write("                        Timer:  <span id=\"timer\" class=\"timer\">");
      out.print(Timestamp.valueOf(LocalDateTime.now()));
      out.write("</span></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" charset=\"utf8\" src=\"https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js\"></script>\n");
      out.write("<script type=\"text/javascript\" charset=\"utf8\"\n");
      out.write("        src=\"https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"j.jsp\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /home.jsp(98,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/home.jsp(98,12) '${employees}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${employees}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /home.jsp(98,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("employee");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <tbody>\n");
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                    <th scope=\"col\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.tz}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\n");
          out.write("                    <th scope=\"col\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\n");
          out.write("                    <th scope=\"col\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.lastName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\n");
          out.write("                    <th scope=\"col\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.birthday}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\n");
          out.write("                    <th scope=\"col\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.workExperience}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\n");
          out.write("                    <th scope=\"col\">\n");
          out.write("                        <a class=\"delete-button\" href=\"delete?tz=");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\">Delete</a>\n");
          out.write("                    </th>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                </tbody>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /home.jsp(109,65) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.tz}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }
}