package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.cart;
import model.products;
import sandwich.productSW;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta http-equiv=\"content-language\" content=\"vi\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("        <title>Trang chủ | Big food</title>\n");
      out.write("        <!-- *** Site Style ***-->\n");
      out.write("        <link href='css/bootstrapefbf.css' rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='css/font-awesomeefbf.css' rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='css/owl.carouselefbf.css' rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='css/owl.transitionsefbf.css' rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='css/css-main-stylesefbf.css' rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,700&amp;subset=latin,vietnamese' rel='stylesheet' type='text/css'>\n");
      out.write("        <script src='scripts/jquery-1.9.1.minefbf.js' type='text/javascript'></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
            
            cart cart = (cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new cart();
                session.setAttribute("cart", cart);
            }
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <h1 style=\"display:none;\">Big Food</h1>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "slider.jsp", out, false);
      out.write("\n");
      out.write("            <!-- nội dung content -->\n");
      out.write("            <section class=\"content\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!--<div class=\"mid-banner row\">\n");
      out.write("                        <div class=\"col-md-4 banner-l hidden-sm col-xs-12 em-effect06\">\n");
      out.write("                            <a href=\"#\" class=\"em-eff06-03\" title=\"Baner trái\">\n");
      out.write("                                <img src=\"./images/banner-3839b.jpg\" alt=\"Baner trái\">\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8 banner-r col-sm-12 col-xs-12 em-effect06\">\n");
      out.write("                            <a href=\"#\" class=\"em-eff06-03\" title=\"Banner phải\">\n");
      out.write("                                <img src=\"./images/banner-4839b.jpg\" alt=\"Banner phải\">\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>-->\n");
      out.write("                    <div class=\"content row\">\n");
      out.write("                        <div class=\"col-md-3 left-sidebar\">\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "danhmucsanpham.jsp", out, false);
      out.write("\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sanphamhot.jsp", out, false);
      out.write("\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sanphamkhuyenmai.jsp", out, false);
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-9 center-site\">\n");
      out.write("                            <div class=\"center\">\n");
      out.write("                                <div class=\"prod-coll-1\">\n");
      out.write("                                    <div class=\"module-title\">\n");
      out.write("                                        <h2>Sản phẩm nổi bật</h2>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"prod-coll-1-owl\">\n");
      out.write("                                    ");

                                        productSW pd = new productSW();
                                        int count = 0;
                                        for (products p : pd.getListProductByTop()) {
                                            if (count % 6 == 0) { 
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                        <div class=\"col-sm-4 col-xs-6 col-xs-small-1\">\n");
      out.write("                                            <div class=\"product-grid\">\n");
      out.write("                                                <div class=\"feature-img\">\n");
      out.write("                                                    <a href=\"detail.jsp?product=");
      out.print(p.getIDsp());
      out.write("\">\n");
      out.write("                                                        <img src=\"images-product/");
      out.print(p.getAnhbia());
      out.write("\" alt=\"");
      out.print(p.getTen());
      out.write("\" class=\"img-responsive\">\n");
      out.write("                                                    </a>\n");
      out.write("                                                    <div class=\"grid-action-box\">\n");
      out.write("                                                        <a href='CartServlet?command=plus&productID=");
      out.print(p.getIDsp());
      out.write("' class=\"btn btn-primary \">Mua hàng</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"prod-info\">\n");
      out.write("                                                    ");
if (p.getTTkm() == true) {
      out.write("\n");
      out.write("                                                    <div class=\"price-box\">\n");
      out.write("                                                        <p class=\"special-price\">\n");
      out.write("                                                            <span>");
      out.print(p.getGia());
      out.write("&#8363;</span>\n");
      out.write("                                                        </p>\n");
      out.write("                                                        <p class=\"old-price\">\n");
      out.write("                                                            <span>");
      out.print(p.getGiakm());
      out.write("&#8363;</span>\n");
      out.write("                                                        </p>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    ");
} else {
      out.write("  \n");
      out.write("                                                    <div class=\"price-box\">\n");
      out.write("                                                        <p class=\"special-price\">\n");
      out.write("                                                            <span>");
      out.print(p.getGia());
      out.write("&#8363;</span>\n");
      out.write("                                                        </p>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    ");
}
      out.write("\n");
      out.write("                                                    <a href=\"detail.jsp\">\n");
      out.write("                                                        <h3>");
      out.print(p.getTen());
      out.write("</h3>\n");
      out.write("                                                    </a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");

                                            count++;
                                            if (count % 6 == 0) { 
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    ");

                                            }
                                        }
                                    
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\t\n");
      out.write("                        <!--<div class=\"center-mid-banner effect-img\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <img class=\"center-mid-banner-img\" src=\"./images/mid-banner839b.jpg\" alt=\"Mid banner\">\n");
      out.write("                            </a>\n");
      out.write("                        </div>-->\n");
      out.write("                        <div class=\"prod-coll-1 left15\">\n");
      out.write("                            <div class=\"module-title\">\n");
      out.write("                                <h2>Sản phẩm mới</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"prod-coll-2-owl\">\n");
      out.write("                                    ");

                                        for (products p : pd.getListProductByNew()) {
                                    
      out.write("\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"product-grid\">\n");
      out.write("                                            <div class=\"feature-img\">\n");
      out.write("                                                <a href=\"detail.jsp?product=");
      out.print(p.getIDsp());
      out.write("\">\n");
      out.write("                                                    <img src=\"images-product/");
      out.print(p.getAnhbia());
      out.write("\" alt=\"");
      out.print(p.getTen());
      out.write("\" class=\"img-responsive\">\n");
      out.write("                                                </a>\n");
      out.write("                                                <div class=\"grid-action-box\">\n");
      out.write("                                                    <a href='CartServlet?command=plus&productID=");
      out.print(p.getIDsp());
      out.write("' class=\"btn btn-primary \">Mua hàng</a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"prod-info\">\n");
      out.write("\n");
      out.write("                                                ");
if (p.getTTkm() == true) {
      out.write("\n");
      out.write("                                                <div class=\"price-box\">\n");
      out.write("                                                    <p class=\"special-price\">\n");
      out.write("                                                        <span>");
      out.print(p.getGiakm());
      out.write("&#8363;</span>\n");
      out.write("                                                    </p>\n");
      out.write("                                                    <p class=\"old-price\">\n");
      out.write("                                                        <span>");
      out.print(p.getGia());
      out.write("&#8363;</span>\n");
      out.write("                                                    </p>\n");
      out.write("                                                </div>\n");
      out.write("                                                ");
} else {
      out.write("  \n");
      out.write("                                                <div class=\"price-box\">\n");
      out.write("                                                    <p class=\"special-price\">\n");
      out.write("                                                        <span>");
      out.print(p.getGia());
      out.write("&#8363;</span>\n");
      out.write("                                                    </p>\n");
      out.write("                                                </div>\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("\n");
      out.write("                                                <a href=\"detail.jsp\">\n");
      out.write("                                                    <h3>");
      out.print(p.getTen());
      out.write("</h3>\n");
      out.write("                                                </a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\t\n");
      out.write("                        <!--<div class=\"bottom-mid-banner\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"bottom-bn-left col-sm-6\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img src=\"./images/banner-1839b.jpg\" alt=\"banner trái\">\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"bottom-bn-right col-sm-6\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img src=\"./images/banner-2839b.jpg\" alt=\"banenr phải\">\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>-->\n");
      out.write("                        <div class=\"prod-coll-1 left15\">\n");
      out.write("                            <div class=\"module-title\">\n");
      out.write("                                <h2>Sản phẩm trong tuần</h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"prod-coll-3-owl\">\t\t\t\t\t\t\t\n");
      out.write("                                    ");

                                        for (products p : pd.getListProductByTopweek()) {
                                    
      out.write("\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"product-grid\">\n");
      out.write("                                            <div class=\"feature-img\">\n");
      out.write("                                                <a href=\"detail.jsp?product=");
      out.print(p.getIDsp());
      out.write("\">\n");
      out.write("                                                    <img src=\"images-product/");
      out.print(p.getAnhbia());
      out.write("\" alt=\"");
      out.print(p.getTen());
      out.write("\" class=\"img-responsive\">\n");
      out.write("                                                </a>\n");
      out.write("                                                <div class=\"grid-action-box\">\n");
      out.write("                                                    <a href='CartServlet?command=plus&productID=");
      out.print(p.getIDsp());
      out.write("' class=\"btn btn-primary addtocart\">Mua hàng</a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"prod-info\">\n");
      out.write("                                                ");
if (p.getTTkm() == true) {
      out.write("\n");
      out.write("                                                <div class=\"price-box\">\n");
      out.write("                                                    <p class=\"special-price\">\n");
      out.write("                                                        <span>");
      out.print(p.getGiakm());
      out.write("&#8363;</span>\n");
      out.write("                                                    </p>\n");
      out.write("                                                    <p class=\"old-price\">\n");
      out.write("                                                        <span>");
      out.print(p.getGia());
      out.write("&#8363;</span>\n");
      out.write("                                                    </p>\n");
      out.write("                                                </div>\n");
      out.write("                                                ");
} else {
      out.write("  \n");
      out.write("                                                <div class=\"price-box\">\n");
      out.write("                                                    <p class=\"special-price\">\n");
      out.write("                                                        <span>");
      out.print(p.getGia());
      out.write("&#8363;</span>\n");
      out.write("                                                    </p>\n");
      out.write("                                                </div>\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                                <a href=\"detail.jsp\">\n");
      out.write("                                                    <h3>");
      out.print(p.getTen());
      out.write("</h3>\n");
      out.write("                                                </a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\t\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\t\t\t\n");
      out.write("    </section>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "brand.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "copyright.jsp", out, false);
      out.write("\n");
      out.write("    <script src='scripts/bootstrap.minefbf.js' type='text/javascript'></script>\n");
      out.write("    <script src='scripts/owl.carouselefbf.js' type='text/javascript'></script>\n");
      out.write("    <script src='scripts/main-scriptefbf.js' type='text/javascript'></script>\n");
      out.write("    <script src='scripts/componentsefbf.js' type='text/javascript'></script>\n");
      out.write("    <script src='scripts/appefbf.js' type='text/javascript'></script>\n");
      out.write("    <script src='scripts/ajax-cartefbf.js' type='text/javascript'></script>\n");
      out.write("    \n");
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
