/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-05-05 14:57:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.sys.menu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>菜单界面</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/easyui/themes/default/easyui.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/easyui/themes/icon.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/easyui/demo.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/easyui/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function(){\r\n");
      out.write("            $('#tt').treegrid({\r\n");
      out.write("                url:'/sys/menu/getNode',\r\n");
      out.write("                idField:'id',\r\n");
      out.write("                treeField:'text',\r\n");
      out.write("                fit:true,\r\n");
      out.write("                loadMsg:'加载中...',\r\n");
      out.write("                //pagination:true,\r\n");
      out.write("                rownumbers:true,\r\n");
      out.write("                fitColumns:false,\r\n");
      out.write("                singleSelect:true,\r\n");
      out.write("                columns:[[\r\n");
      out.write("                    {title:'id',field:'id',width:80},\r\n");
      out.write("                     {field:'text',title:'菜单名',width:160,state:'closed'},\r\n");
      out.write("                     {field:'url',title:'地址'},\r\n");
      out.write("                     {field:'createTime',title:'创建时间',formatter: function(value,row,index){\r\n");
      out.write("                        if (row.createTime!= null){\r\n");
      out.write("                        var d = new Date(row.createTime);\r\n");
      out.write("\r\n");
      out.write("                        return dateFtt(\"yyyy-MM-dd hh:mm:ss\",d);\r\n");
      out.write("                        }\r\n");
      out.write("                        }},\r\n");
      out.write("                   /* {field:'menuName',title:'菜单名称',width:160},\r\n");
      out.write("                    {field:'menuId',title:'菜单编号',width:80},\r\n");
      out.write("                    {field:'url',title:'地址'},\r\n");
      out.write("                    {field:'parentId',title:'父菜单编号',width:80}*/\r\n");
      out.write("                ]],\r\n");
      out.write("                onBeforeExpand : function(row) {\r\n");
      out.write("                // 此处就是异步加载地所在\r\n");
      out.write("                if (row) {\r\n");
      out.write("                    $(this).treegrid('options').url = '/sys/menu/getNode?id='+row.id;\r\n");
      out.write("                }\r\n");
      out.write("                    return true;\r\n");
      out.write("                },\r\n");
      out.write("                toolbar : [ {\r\n");
      out.write("                id : 'addLeafBtn',\r\n");
      out.write("                text : '添加菜单',\r\n");
      out.write("                iconCls : 'icon-add',\r\n");
      out.write("                handler : function() {\r\n");
      out.write("                addMenu();\r\n");
      out.write("                }\r\n");
      out.write("                },'-', {\r\n");
      out.write("                id : 'editBtn',\r\n");
      out.write("                text : '修改',\r\n");
      out.write("                iconCls : 'icon-edit',\r\n");
      out.write("                handler : function() {\r\n");
      out.write("                $('#btnsave').linkbutton('enable');\r\n");
      out.write("                alert('cut')\r\n");
      out.write("                }\r\n");
      out.write("                }, '-', {\r\n");
      out.write("                id : 'deleteBtn',\r\n");
      out.write("                text : '删除',\r\n");
      out.write("                disabled : true,\r\n");
      out.write("                iconCls : 'icon-save',\r\n");
      out.write("                handler : function() {\r\n");
      out.write("                $('#btnsave').linkbutton('disable');\r\n");
      out.write("                alert('save');\r\n");
      out.write("                }\r\n");
      out.write("                } ]\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    /**************************************时间格式化处理************************************/\r\n");
      out.write("    function dateFtt(fmt,date)\r\n");
      out.write("    {\r\n");
      out.write("        var o = {\r\n");
      out.write("        \"M+\" : date.getMonth()+1,                 //月份\r\n");
      out.write("        \"d+\" : date.getDate(),                    //日\r\n");
      out.write("        \"h+\" : date.getHours(),                   //小时\r\n");
      out.write("        \"m+\" : date.getMinutes(),                 //分\r\n");
      out.write("        \"s+\" : date.getSeconds(),                 //秒\r\n");
      out.write("        \"q+\" : Math.floor((date.getMonth()+3)/3), //季度\r\n");
      out.write("        \"S\"  : date.getMilliseconds()             //毫秒\r\n");
      out.write("        };\r\n");
      out.write("        if(/(y+)/.test(fmt))\r\n");
      out.write("        fmt=fmt.replace(RegExp.$1, (date.getFullYear()+\"\").substr(4 - RegExp.$1.length));\r\n");
      out.write("        for(var k in o)\r\n");
      out.write("        if(new RegExp(\"(\"+ k +\")\").test(fmt))\r\n");
      out.write("        fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : ((\"00\"+ o[k]).substr((\"\"+ o[k]).length)));\r\n");
      out.write("        return fmt;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <table id=\"tt\" style=\"width:600px;height:400px\"></table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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