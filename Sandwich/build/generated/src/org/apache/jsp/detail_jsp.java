package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.products;
import sandwich.productSW;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta http-equiv=\"content-language\" content=\"vi\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("        <title>Chi tiết sản phẩm | Big food</title>\n");
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

            productSW pd = new productSW();
            products product = new products();
            String product_id = "";
            if (request.getParameter("product") != null) {
                product_id = request.getParameter("product");
                product = pd.getProductDetail(Long.parseLong(product_id));
            }
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <section class=\"sub-top-bn\">\n");
      out.write("                <h1>");
      out.print(product.getTen());
      out.write("</h1>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"bcrumb\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <ul class=\"breadcrumb\">\n");
      out.write("                        <li>\n");
      out.write("                            <a title=\"Trở lại trang chủ\" href=\"/\" >Trang chủ</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"/\" title=\"Sản phẩm trong tuần\">Sản phẩm</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"active\">");
      out.print(product.getTen());
      out.write("</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"content\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"product row\">\n");
      out.write("                        <div class=\"col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("                            <div class=\"featured-image\">\n");
      out.write("                                <img src=\"./images-product/");
      out.print(product.getAnhbia());
      out.write("\" alt=\"");
      out.print(product.getTen());
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"images\">\n");
      out.write("                                <div class=\"imgowl\" >\n");
      out.write("                                    <div class=\"img-item col-xs-12\">\n");
      out.write("                                        <a href=\"./images-product/");
      out.print(product.getAnh1());
      out.write("\">\n");
      out.write("                                            <img src=\"./images-product/");
      out.print(product.getAnh1());
      out.write("\" alt=\"");
      out.print(product.getTen());
      out.write("\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"img-item col-xs-12\">\n");
      out.write("                                        <a href=\"./images-product/");
      out.print(product.getAnh2());
      out.write("\">\n");
      out.write("                                            <img src=\"./images-product/");
      out.print(product.getAnh2());
      out.write("\" alt=\"");
      out.print(product.getTen());
      out.write("\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("                            <form action=\"\" method=\"post\">\n");
      out.write("                                <div class=\"prod-desc\">\n");
      out.write("                                    <h2 itemprop=\"name\">");
      out.print(product.getTen());
      out.write("</h2>\n");
      out.write("                                    ");
if (product.getTTkm() == true) {
      out.write("\n");
      out.write("                                        <div class=\"price-box\">\n");
      out.write("                                            <p class=\"special-price\">\n");
      out.write("                                                <span>");
      out.print(product.getGiakm());
      out.write("&#8363;</span>\n");
      out.write("                                            </p>\n");
      out.write("                                            <p class=\"old-price\">\n");
      out.write("                                                <span>");
      out.print(product.getGia());
      out.write("&#8363;</span>\n");
      out.write("                                            </p>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");
} else {
      out.write("  \n");
      out.write("                                        <div class=\"price-box\">\n");
      out.write("                                            <p class=\"special-price\">\n");
      out.write("                                                <span>");
      out.print(product.getGia());
      out.write("&#8363;</span>\n");
      out.write("                                            </p>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    <div class=\"primary-box\">\n");
      out.write("                                        <p class=\"desctit\">Mô tả ngắn: </p>\n");
      out.write("                                        <p>");
      out.print(product.getMotangan());
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"quantity-box clearfix\">\n");
      out.write("                                        <label>Số lượng: </label>\n");
      out.write("                                        <div class=\"input-group qttform\">\n");
      out.write("                                            <span class=\"input-group-btn data-dwn\">\n");
      out.write("                                                <div onclick=\"var result = document.getElementById('qty'); var qty = result.value; if (!isNaN(qty) & amp; & amp; qty > 1) result.value--; return false;\" class=\"btn mathbtn\" data-dir=\"dwn\"><span class=\"fa fa-minus\"></span></div>\n");
      out.write("                                            </span>\n");
      out.write("                                            <input type=\"text\" id=\"qty\" class=\"bizwebinput form-control product_input_qty qtt-center\" value=\"1\" name=\"quantity\" min=\"1\" onpaste=\"return false;\" onkeypress='validate(event)'/>\n");
      out.write("                                            <span class=\"input-group-btn data-up\">\n");
      out.write("                                                <div onclick=\"var result = document.getElementById('qty');\n");
      out.write("                                                        var qty = result.value;\n");
      out.write("                                                        if (!isNaN(qty))\n");
      out.write("                                                            result.value++;\n");
      out.write("                                                        return false;\" class=\"btn mathbtn\" data-dir=\"up\"><span class=\"fa fa-plus\"></span></div>\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"action-box clearfix\">\n");
      out.write("                                        ");
String a = request.getRequestURL().toString();
      out.write("\n");
      out.write("                                        <form action=\"CartServlet?command=plus&productID=");
      out.print(product.getIDsp());
      out.write("&url=");
      out.print(a);
      out.write("?product=");
      out.print(product.getIDct());
      out.write("\" method=\"post\">\n");
      out.write("                                            <button type=\"submit\" title=\"Mua hàng\" class=\"addtocart add-to-cart\">\t\t\t\t\n");
      out.write("                                                <span>Mua hàng</span>\n");
      out.write("                                            </button>\t\t\n");
      out.write("                                        </form>\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"addthis\">\n");
      out.write("                                        <script type=\"text/javascript\" src=\"../s7.addthis.com/js/300/addthis_widget.js#pubid=ra-5620cf1235df3004\" async=\"async\"></script>\t\n");
      out.write("                                        <div class=\"addthis_native_toolbox\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product-detail\">\n");
      out.write("                        <ul class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("                            <li role=\"presentation\" class=\"active\"><a href=\"#tab_1\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\">THÔNG TIN SẢN PHẨM</a></li>\n");
      out.write("                            <li role=\"presentation\"><a href=\"#tab_2\" aria-controls=\"profile\" role=\"tab\" data-toggle=\"tab\">KHÁCH HÀNG ĐÁNH GIÁ</a></li>\n");
      out.write("                            <li role=\"presentation\"><a href=\"#tab_3\" aria-controls=\"messages\" role=\"tab\" data-toggle=\"tab\">THẺ TAGS</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"tab-content\">\n");
      out.write("                            <div role=\"tabpanel\" class=\"tab-pane active\" id=\"tab_1\">\n");
      out.write("                                <div class=\"std\">\n");
      out.write("                                    ");
      out.print(product.getMota());
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div role=\"tabpanel\" class=\"tab-pane\" id=\"tab_2\">Chức năng khách hàng đánh giá chưa được kích hoạt</div>\n");
      out.write("                            <div role=\"tabpanel\" class=\"tab-pane\" id=\"tab_3\">\n");
      out.write("                                <ul class=\"producttagsul\">\n");
      out.write("                                    <li class=\"producttagsli\"><a href=\"#\">Sản phẩm chưa có tag</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"prod-coll-1 left15 related_product_owl\">\n");
      out.write("            <div class=\"module-title\">\n");
      out.write("                <h2>Sản phẩm liên quan</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"prod-coll-4-owl\">\t\n");
      out.write("                    ");
                
                        for (products p : pd.getListProductByLienquan(product.getIDct())) {
                    
      out.write("\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"product-grid\">\n");
      out.write("                            <div class=\"feature-img\">\n");
      out.write("                                <a href=\"detail.jsp?product=");
      out.print(p.getIDsp());
      out.write("\">\n");
      out.write("                                    <img src=\"images-product/");
      out.print(p.getAnhbia());
      out.write("\" alt=\"");
      out.print(p.getTen());
      out.write("\" class=\"img-responsive\">\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"grid-action-box\">\n");
      out.write("                                    <form action=\"\" class=\"product_item_form\" method=\"post\">\t\n");
      out.write("                                        <input type=\"hidden\" name=\"variantId\" value=\"2099142\" />\n");
      out.write("                                        <button type=\"submit\" title=\"Mua hàng\" class=\"list-add-cart add-to-cart\">\t\t\t\t\n");
      out.write("                                            <span>Mua hàng</span>\n");
      out.write("                                        </button>\t\t\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"prod-info\">\n");
      out.write("\n");
      out.write("                                ");
if (p.getTTkm() == true) {
      out.write("\n");
      out.write("                                <div class=\"price-box\">\n");
      out.write("                                    <p class=\"special-price\">\n");
      out.write("                                        <span>");
      out.print(p.getGia());
      out.write("&#8363;</span>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p class=\"old-price\">\n");
      out.write("                                        <span>");
      out.print(p.getGiakm());
      out.write("&#8363;</span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                                ");
} else {
      out.write("  \n");
      out.write("                                <div class=\"price-box\">\n");
      out.write("                                    <p class=\"special-price\">\n");
      out.write("                                        <span>");
      out.print(p.getGia());
      out.write("&#8363;</span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("\n");
      out.write("                                <a href=\"detail.jsp\">\n");
      out.write("                                    <h3>");
      out.print(p.getTen());
      out.write("</h3>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "copyright.jsp", out, false);
      out.write("\n");
      out.write("        <script src='scripts/option-selectors58d8.js' type='text/javascript'></script>\n");
      out.write("        <script src='scripts/bootstrap.minefbf.js' type='text/javascript'></script>\n");
      out.write("        <script src='scripts/owl.carouselefbf.js' type='text/javascript'></script>\n");
      out.write("        <script src='scripts/main-scriptefbf.js' type='text/javascript'></script>\n");
      out.write("        <div class=\"ajax-error-modal modal\">\n");
      out.write("            <div class=\"modal-inner\">\n");
      out.write("                <div class=\"ajax-error-title\">Lỗi</div>\n");
      out.write("                <div class=\"ajax-error-message\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"ajax-success-modal modal\">\n");
      out.write("            <div class=\"overlay\"></div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"ajax-left\">\n");
      out.write("                    <img class=\"ajax-product-image\" alt=\"&nbsp;\" src=\"#\" style=\"max-width:65px; max-height:100px\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"ajax-right\">\n");
      out.write("                    <p class=\"ajax-product-title\"></p>\n");
      out.write("                    <p class=\"success-message btn-go-to-cart\"><span style=\"color:#000\">&#10004;</span> Đã được thêm vào giỏ hàng.</p>\n");
      out.write("\n");
      out.write("                    <div class=\"actions\">          \n");
      out.write("                        <button onclick=\"window.location = 'cart.html'\" class=\"btn btn-red-popup\">Đi tới giỏ hàng</button>\n");
      out.write("                        <button onclick=\"window.location = 'https://big-food.bizwebvietnam.net/checkout'\" class=\"btn btn-red-popup\">Thanh toán</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <a href=\"javascript:void(0)\" class=\"close-modal\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("            </div>    \n");
      out.write("        </div>\n");
      out.write("        <script src='scripts/componentsefbf.js' type='text/javascript'></script>\n");
      out.write("        <script src='scripts/appefbf.js' type='text/javascript'></script>\n");
      out.write("        <script src='scripts/api.jquery58d8.js' type='text/javascript'></script>\n");
      out.write("        <script src='scripts/ajax-cartefbf.js' type='text/javascript'></script>   \n");
      out.write("    </body>\n");
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
