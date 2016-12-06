package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta http-equiv=\"content-language\" content=\"vi\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("        <title>Đăng ký | Big food</title>\n");
      out.write("        <!-- *** Site Style ***-->\n");
      out.write("        <link href='css/bootstrapefbf.css' rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='css/font-awesomeefbf.css' rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='css/owl.carouselefbf.css' rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='css/owl.transitionsefbf.css' rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='css/css-main-stylesefbf.css' rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,700&amp;subset=latin,vietnamese' rel='stylesheet' type='text/css'>\n");
      out.write("        <script src='scripts/jquery-1.9.1.minefbf.js' type='text/javascript'></script>\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\" type=\"text/javascript\"></script> \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var x_timer;\n");
      out.write("\n");
      out.write("                $(\"#email\").keyup(function (e) {\n");
      out.write("                    clearTimeout(x_timer);\n");
      out.write("                    var email_name = $(this).val();\n");
      out.write("                    x_timer = setTimeout(function () {\n");
      out.write("                        check_email_ajax(email_name);\n");
      out.write("                    }, 1000);\n");
      out.write("                });\n");
      out.write("                function check_email_ajax(email) {\n");
      out.write("                    $(\"#email-result\").html('<img src=\"images/loading.gif\" />');\n");
      out.write("                    $.post('CheckEmailServlet', {'email': email}, function (data) {\n");
      out.write("                        $(\"#email-result\").html(data);\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script> \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var x_timer;\n");
      out.write("                $(\"#user\").keyup(function (e) {\n");
      out.write("                    clearTimeout(x_timer);\n");
      out.write("                    var user_name = $(this).val();\n");
      out.write("                    x_timer = setTimeout(function () {\n");
      out.write("                        check_username_ajax(user_name);\n");
      out.write("                    }, 1000);\n");
      out.write("                });\n");
      out.write("                function check_username_ajax(user) {\n");
      out.write("                    $(\"#user-result\").html('<img src=\"images/loading.gif\" />');\n");
      out.write("                    $.post('CheckUserServlet', {'user': user}, function (data) {\n");
      out.write("                        $(\"#user-result\").html(data);\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <section class=\"sub-top-bn\">\n");
      out.write("                <h1>Đăng ký tài khoản</h1>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"bcrumb\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <ul class=\"breadcrumb\">\n");
      out.write("                        <li>\n");
      out.write("                            <a title=\"Trở lại trang chủ\" href=\"index.jsp\" >Trang chủ</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"active\">Đăng ký tài khoản</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"content\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"col-main\">\n");
      out.write("                        <div class=\"account-create\">\t\t\t\t\n");
      out.write("                            <form accept-charset='UTF-8' action='UsersServlet' id='customer_register' method='post'>\n");
      out.write("                                <input name='FormType' type='hidden' value='customer_register' />\n");
      out.write("                                <input name='utf8' type='hidden' value='true' /> \n");
      out.write("                                <div class=\"fieldset\">\n");
      out.write("                                    <div class=\"page-title\">\n");
      out.write("                                        <h2>THÔNG TIN CÁ NHÂN</h2>\n");
      out.write("                                    </div>\n");
      out.write("                                    <ul class=\"form-list\">\n");
      out.write("                                        <li class=\"fields\">\n");
      out.write("                                            <div class=\"row customer-name-middlename\">\n");
      out.write("                                                <div class=\" col-md-6  name-lastname\">\n");
      out.write("                                                    <label for=\"name\" class=\"required\">Họ và tên</label>\n");
      out.write("                                                    <input type=\"text\"  name=\"Name\" maxlength=\"255\" class=\"required-entry\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-6 name-firstname\">\n");
      out.write("                                                    <label for=\"dienthoai\" class=\"required\">Điện thoại</label>\n");
      out.write("                                                    <input type=\"number\" name=\"Phone\" maxlength=\"255\" class=\"required-entry\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\" col-md-12\">\n");
      out.write("                                                    <label for=\"address\" class=\"required\">Địa chỉ</label>\n");
      out.write("                                                    <input type=\"text\"  name=\"Address\" maxlength=\"255\" class=\"required-entry\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </li>       \n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"fieldset\">\n");
      out.write("                                    <div class=\"page-title\">\n");
      out.write("                                        <h2>THÔNG TIN ĐĂNG NHẬP</h2>\n");
      out.write("                                    </div>\n");
      out.write("                                    <ul class=\"form-list\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <label for=\"email_address\" class=\"required\"><em>*</em>Địa chỉ Email  <span id=\"email-result\"></span></label>\n");
      out.write("                                            ");
if (request.getAttribute("email") != null) {
      out.write("\n");
      out.write("                                            <p style=\"color:red\">");
      out.print(request.getAttribute("email"));
      out.write("</p>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                            <input type=\"email\"  name=\"Email\" id=\"email\"  required>\n");
      out.write("                                        </li>  \n");
      out.write("                                        <li>\n");
      out.write("                                            <label for=\"username\" class=\"required\"><em>*</em>Username  <span id=\"user-result\"></span></label>\n");
      out.write("                                            ");
if (request.getAttribute("user") != null) {
      out.write("\n");
      out.write("                                            <p style=\"color:red\">");
      out.print(request.getAttribute("user"));
      out.write("</p>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                            <input type=\"text\"  name=\"User\" id=\"user\" required>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <label for=\"password\" class=\"required\"><em>*</em>Mật khẩu</label>\n");
      out.write("                                            <input type=\"password\" name=\"Pass\" class=\"validate-password\" required>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"buttons-set\">\n");
      out.write("                                    <input type=\"hidden\" value=\"insert\" name=\"command\">\n");
      out.write("                                    <button type=\"submit\" title=\"Submit\" class=\"button\"><span>Đăng ký</span></button>\n");
      out.write("                                    <a href=\"index.jsp\" class=\"back-link\">Trở lại trang chủ</a>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        \n");
      out.write("        <script src='scripts/option-selectors58d8.js' type='text/javascript'></script>\n");
      out.write("        <script src='scripts/bootstrap.minefbf.js' type='text/javascript'></script>\n");
      out.write("        <script src='scripts/owl.carouselefbf.js' type='text/javascript'></script>\n");
      out.write("        <script src='scripts/main-scriptefbf.js' type='text/javascript'></script>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                        <button onclick=\"window.location = 'http://big-food.bizwebvietnam.net/cart'\" class=\"btn btn-red-popup\">Đi tới giỏ hàng</button>\n");
      out.write("                        <button onclick=\"window.location = 'http://big-food.bizwebvietnam.net/checkout'\" class=\"btn btn-red-popup\">Thanh toán</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <a href=\"javascript:void(0)\" class=\"close-modal\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("            </div>    \n");
      out.write("        </div>\n");
      out.write("        <script src='scripts/componentsefbf.js' type='text/javascript'></script>\n");
      out.write("        <script src='scripts/appefbf.js' type='text/javascript'></script>\n");
      out.write("        <script src='scripts/api.jquery58d8.js' type='text/javascript'></script>\n");
      out.write("        <script src='scripts/ajax-cartefbf.js' type='text/javascript'></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("                            $(document).ready(function ()\n");
      out.write("                            {\n");
      out.write("                                App.init(); // init core    \n");
      out.write("                            });\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            Bizweb.updateCartFromForm = function (cart, cart_summary_id, cart_count_id) {\n");
      out.write("\n");
      out.write("                if ((typeof cart_summary_id) === 'string') {\n");
      out.write("                    var cart_summary = jQuery(cart_summary_id);\n");
      out.write("                    if (cart_summary.length) {\n");
      out.write("                        // Start from scratch.\n");
      out.write("                        cart_summary.empty();\n");
      out.write("                        // Pull it all out.        \n");
      out.write("                        jQuery.each(cart, function (key, value) {\n");
      out.write("                            if (key === 'items') {\n");
      out.write("\n");
      out.write("                                var table = jQuery(cart_summary_id);\n");
      out.write("                                if (value.length) {\n");
      out.write("                                    jQuery.each(value, function (i, item) {\n");
      out.write("                                        jQuery('<div class=\"control-container\"><div class=\"row\"><a class=\"cart-close\" title=\"Xóa\" href=\"javascript:void(0);\" onclick=\"Bizweb.removeItem(' + item.variant_id + ')\"><img class=\"item-remove\" src=\"//images/itemclose.png\"/></a><div class=\"col-md-10 cart-left\"><img src=\"' + Bizweb.resizeImage(item.image, 'small') + '\" /></div><div class=\"col-md-14 cart-right\"><div class=\"cart-title\"><a href=\"' + item.url + '\">' + item.name + '</a></div><div class=\"cart-price\"><i style=\"color:#636363;font-style: normal;\">' + item.quantity + ' x </i>' + Bizweb.formatMoney(item.price, \"{{amount_no_decimals_with_comma_separator}}&#8363;\") + '</div></div></div>').appendTo(table);\n");
      out.write("                                    });\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    jQuery('<div class=\"subtotal\"><span class=\"cart-total-right\"><i style=\"color:#c69c6d;font-style: normal;font-weight: bold;font-size: 16px;\">TỔNG TIỀN:</i> 0&#8363;</span></div>').appendTo(table);\n");
      out.write("                                    jQuery('<div class=\"action\"><a id=\"gocart\" href=\"\\/cart\">Giỏ hàng</a></div>').appendTo(table);\n");
      out.write("                                } else {\n");
      out.write("                                    jQuery('<li><p>Không có sản phẩm nào trong giỏ hàng.</p></li>').appendTo(table);\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                updateCartDesc(cart);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function updateCartDesc(data) {\n");
      out.write("                var $cartPrice = Bizweb.formatMoney(data.total_price, \"{{amount_no_decimals_with_comma_separator}}&#8363;\");\n");
      out.write("                $('.cart-item-count').text(data.item_count);\n");
      out.write("                $('.cart-total-right').html('<i style=\"color:#c69c6d;font-style: normal;font-weight: bold;font-size: 16px;\">TỔNG TIỀN:</i> ' + $cartPrice + '');\n");
      out.write("            }\n");
      out.write("            Bizweb.onCartUpdate = function (cart) {\n");
      out.write("                Bizweb.updateCartFromForm(cart, '#cart-info-parent .cart-content');\n");
      out.write("            };\n");
      out.write("            $(window).load(function () {\n");
      out.write("                // Let's get the cart and show what's in it in the cart box.  \n");
      out.write("                Bizweb.getCart(function (cart) {\n");
      out.write("                    Bizweb.updateCartFromForm(cart, '#cart-info-parent .cart-content');\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\t\n");
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
