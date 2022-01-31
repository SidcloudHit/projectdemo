package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html >\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"icon\" href=\"https://www.codexworld.com/wp-content/uploads/2014/09/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("        <meta name=\"description\" content=\"Live Demo at CodexWorld - Convert HTML to PDF using JavaScript by CodexWorld\">\n");
      out.write("        <meta name=\"keywords\" content=\"demo, codexworld demo, project demo, live demo, tutorials, programming, coding\">\n");
      out.write("        <meta name=\"author\" content=\"CodexWorld\">\n");
      out.write("        <title>Live Demo - Convert HTML to PDF using JavaScript by CodexWorld</title>\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"http://demos.codexworld.com/includes/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Add custom CSS here -->\n");
      out.write("        <link href=\"http://demos.codexworld.com/includes/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\n");
      out.write("\t\t<script async src=\"https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"></script>\n");
      out.write("        <style>\n");
      out.write(".col-lg-12 button{\n");
      out.write("\tfont-size: 18px;\n");
      out.write("}\n");
      out.write(".col-lg-12 button:first-child{\n");
      out.write("\tmargin-right: 10px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("         <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"https://www.codexworld.com/\">\n");
      out.write("                <img src=\"https://www.codexworld.com/wp-content/uploads/2014/09/codexworld-logo.png\" alt=\"CodexWorld\">\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("            <ul class=\"social_btn nav navbar-nav navbar-left\">\n");
      out.write("                <li class=\"flike\"><iframe src=\"https://www.facebook.com/plugins/like.php?href=https%3A%2F%2Ffacebook.com%2Fcodexworld&width=85&layout=button_count&action=like&show_faces=false&share=false&height=21&appId=1602134356668306\" width=\"85\" height=\"21\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowTransparency=\"true\"></iframe></li>\n");
      out.write("                <li class=\"tflow\"><iframe allowtransparency=\"true\" data-show-count=\"true\" frameborder=\"0\" scrolling=\"no\" src=\"//platform.twitter.com/widgets/follow_button.html?screen_name=codexworldblog\" style=\"width:300px; height:20px;\"></iframe></li>\n");
      out.write("            </ul>\n");
      out.write("             \n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        \t<li>\n");
      out.write("                    <a href=\"http://www.codexworld.com/downloads/convert-html-to-pdf-using-javascript-jspdf\">Download</a>\n");
      out.write("                </li>\n");
      out.write("                        \n");
      out.write("                        \t<li>\n");
      out.write("                    <a href=\"https://www.codexworld.com/convert-html-to-pdf-using-javascript-jspdf/\">Tutorial</a>\n");
      out.write("                </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("        <!-- /.navbar-collapse -->\n");
      out.write("          \t</div>\n");
      out.write("</nav>\n");
      out.write("<div class=\"bar-header\">\n");
      out.write("\t<!-- CodexWorld_Demo_HeaderTop -->\n");
      out.write("\t<ins class=\"adsbygoogle\"\n");
      out.write("\t\t style=\"display:block\"\n");
      out.write("\t\t data-ad-client=\"ca-pub-5750766974376423\"\n");
      out.write("\t\t data-ad-slot=\"8179048472\"\n");
      out.write("\t\t data-ad-format=\"auto\"\n");
      out.write("\t\t data-full-width-responsive=\"true\"></ins>\n");
      out.write("\t<script>\n");
      out.write("\t\t (adsbygoogle = window.adsbygoogle || []).push({});\n");
      out.write("\t</script>\n");
      out.write("</div>\n");
      out.write("<div class=\"demo-title\"><h4>DEMO BY <span class=\"one\">CODEX</span><span class=\"two\">WORLD</span>: Convert HTML to PDF using JavaScript</h4></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("            <div>\n");
      out.write("            \t<button onclick=\"generatePDF();\">Click to Generate PDF</button>\n");
      out.write("\t\t\t\t<button onclick=\"Convert_HTML_To_PDF();\">Convert HTML to PDF</button>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- HTML content for PDF creation -->\n");
      out.write("\t\t\t\t<div id=\"contentToPrint\">\n");
      out.write("\t\t\t\t\t<h1>What is Lorem Ipsum?</h1>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>\n");
      out.write("\t\t\t\t\t<img src=\"images/flowers.jpg\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC.</p>\n");
      out.write("\t\t\t\t\t<img src=\"images/codex-trees.jpeg\" width=\"450\" height=\"250\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("\t    \t<div class=\"bar-footer\">\n");
      out.write("\t\t\t<!-- CodexWorld_Demo_PageBottom -->\n");
      out.write("\t\t\t<ins class=\"adsbygoogle\"\n");
      out.write("\t\t\t\t style=\"display:block\"\n");
      out.write("\t\t\t\t data-ad-client=\"ca-pub-5750766974376423\"\n");
      out.write("\t\t\t\t data-ad-slot=\"1397129652\"\n");
      out.write("\t\t\t\t data-ad-format=\"auto\"\n");
      out.write("\t\t\t\t data-full-width-responsive=\"true\"></ins>\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\t\t (adsbygoogle = window.adsbygoogle || []).push({});\n");
      out.write("\t\t\t</script>\n");
      out.write("        </div>\n");
      out.write("        \t<!-- JavaScript -->\n");
      out.write("\t\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("     \t        <script src=\"http://demos.codexworld.com/includes/js/bootstrap.js\"></script>\n");
      out.write("        <!-- Place this tag in your head or just before your close body tag. -->\n");
      out.write("        <!--<script src=\"https://apis.google.com/js/platform.js\" async defer></script>-->\n");
      out.write("    \t\n");
      out.write("<!-- html2canvas library -->\n");
      out.write("<script src=\"js/html2canvas.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- jsPDF library -->\n");
      out.write("<script src=\"js/jspdf.min.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("/*\n");
      out.write(" * Generate 2 pages PDF document\n");
      out.write(" */\n");
      out.write("function generatePDF() {\n");
      out.write("\tvar doc = new jsPDF();\n");
      out.write("\t\n");
      out.write("\tdoc.text(20, 20, 'Hello world!');\n");
      out.write("\tdoc.text(20, 30, 'This is client-side Javascript to generate a PDF.');\n");
      out.write("\t\n");
      out.write("\tdoc.text(20, 40, 'This is the default font.');\n");
      out.write("\t\n");
      out.write("\tdoc.setFont(\"courier\");\n");
      out.write("\tdoc.setFontType(\"normal\");\n");
      out.write("\tdoc.text(20, 50, 'This is courier normal.');\n");
      out.write("\t\n");
      out.write("\tdoc.setFont(\"times\");\n");
      out.write("\tdoc.setFontType(\"italic\");\n");
      out.write("\tdoc.text(20, 60, 'This is times italic.');\n");
      out.write("\t\n");
      out.write("\tdoc.setFont(\"helvetica\");\n");
      out.write("\tdoc.setFontType(\"bold\");\n");
      out.write("\tdoc.text(20, 70, 'This is helvetica bold.');\n");
      out.write("\t\n");
      out.write("\tdoc.setFont(\"courier\");\n");
      out.write("\tdoc.setFontType(\"bolditalic\");\n");
      out.write("\tdoc.text(20, 80, 'This is courier bolditalic.');\n");
      out.write("\t\n");
      out.write("\tdoc.addPage();\n");
      out.write("\t\n");
      out.write("\tdoc.setFontSize(24);\n");
      out.write("\tdoc.text(20, 20, 'This is a title');\n");
      out.write("\t\n");
      out.write("\tdoc.setFontSize(16);\n");
      out.write("\tdoc.text(20, 30, 'This is some normal sized text underneath.');\n");
      out.write("\t\n");
      out.write("\tdoc.setTextColor(100);\n");
      out.write("\tdoc.text(20, 40, 'This is gray.');\n");
      out.write("\t\n");
      out.write("\tdoc.setTextColor(150);\n");
      out.write("\tdoc.text(20, 50, 'This is light gray.');\n");
      out.write("\t\n");
      out.write("\tdoc.setTextColor(255,0,0);\n");
      out.write("\tdoc.text(20, 60, 'This is red.');\n");
      out.write("\t\n");
      out.write("\tdoc.setTextColor(0,255,0);\n");
      out.write("\tdoc.text(20, 70, 'This is green.');\n");
      out.write("\t\n");
      out.write("\tdoc.setTextColor(0,0,255);\n");
      out.write("\tdoc.text(20, 80, 'This is blue.');\n");
      out.write("\t\n");
      out.write("\t// Save the PDF\n");
      out.write("\tdoc.save('document.pdf');\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*\n");
      out.write(" * Convert HTML content to PDF\n");
      out.write(" */\n");
      out.write("function Convert_HTML_To_PDF() {\n");
      out.write("\tvar elementHTML = document.getElementById('contentToPrint');\n");
      out.write("\n");
      out.write("  html2canvas(elementHTML, {\n");
      out.write("    useCORS: true,\n");
      out.write("    onrendered: function(canvas) {\n");
      out.write("      var pdf = new jsPDF('p', 'pt', 'letter');\n");
      out.write("\n");
      out.write("      var pageHeight = 980;\n");
      out.write("      var pageWidth = 900;\n");
      out.write("      for (var i = 0; i <= elementHTML.clientHeight / pageHeight; i++) {\n");
      out.write("        var srcImg = canvas;\n");
      out.write("        var sX = 0;\n");
      out.write("        var sY = pageHeight * i; // start 1 pageHeight down for every new page\n");
      out.write("        var sWidth = pageWidth;\n");
      out.write("        var sHeight = pageHeight;\n");
      out.write("        var dX = 0;\n");
      out.write("        var dY = 0;\n");
      out.write("        var dWidth = pageWidth;\n");
      out.write("        var dHeight = pageHeight;\n");
      out.write("\n");
      out.write("        window.onePageCanvas = document.createElement(\"canvas\");\n");
      out.write("        onePageCanvas.setAttribute('width', pageWidth);\n");
      out.write("        onePageCanvas.setAttribute('height', pageHeight);\n");
      out.write("        var ctx = onePageCanvas.getContext('2d');\n");
      out.write("        ctx.drawImage(srcImg, sX, sY, sWidth, sHeight, dX, dY, dWidth, dHeight);\n");
      out.write("\n");
      out.write("        var canvasDataURL = onePageCanvas.toDataURL(\"image/png\", 1.0);\n");
      out.write("        var width = onePageCanvas.width;\n");
      out.write("        var height = onePageCanvas.clientHeight;\n");
      out.write("\n");
      out.write("        if (i > 0) // if we're on anything other than the first page, add another page\n");
      out.write("          pdf.addPage(612, 864); // 8.5\" x 12\" in pts (inches*72)\n");
      out.write("\n");
      out.write("        pdf.setPage(i + 1); // now we declare that we're working on that page\n");
      out.write("        pdf.addImage(canvasDataURL, 'PNG', 20, 40, (width * .62), (height * .62)); // add content to the page\n");
      out.write("      }\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// Save the PDF\n");
      out.write("      pdf.save('document-html.pdf');\n");
      out.write("    }\n");
      out.write("  });\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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