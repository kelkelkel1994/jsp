<%@page import="model.cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta http-equiv="content-language" content="vi">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <title>Giỏ hàng | Big food</title>
        <!-- *** Site Style ***-->
        <link href='css/bootstrapefbf.css' rel='stylesheet' type='text/css' />
        <link href='css/font-awesomeefbf.css' rel='stylesheet' type='text/css' />
        <link href='css/owl.carouselefbf.css' rel='stylesheet' type='text/css' />
        <link href='css/owl.transitionsefbf.css' rel='stylesheet' type='text/css' />
        <link href='css/css-main-stylesefbf.css' rel='stylesheet' type='text/css' />
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,700&amp;subset=latin,vietnamese' rel='stylesheet' type='text/css'>
        <script src='scripts/jquery-1.9.1.minefbf.js' type='text/javascript'></script>
    </head>
    <body>
        <%            
            cart cart = (cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new cart();
                session.setAttribute("cart", cart);
            }
        %>
        <jsp:include page="header.jsp"></jsp:include>
            <h1 style="display:none;">Big Food</h1>
            <section class="sub-top-bn">
                <h1>Giỏ hàng</h1>
            </section>
            <section class="bcrumb">
                <div class="container">
                    <ul class="breadcrumb">
                        <li>
                            <a title="Trở lại trang chủ" href="/">Trang chủ</a>
                        </li>

                        <li class="active">Giỏ hàng</li>

                    </ul>
                </div>
            </section>
            <section class="content cart">
                <div class="container">

                    <div class="cart">
                        <div class="page-title">
                            <h2>GIỎ HÀNG</h2>
                        </div>
                        <form action="/cart" class="hidden-xs" method="post">
                            <fieldset class="table-responsive">
                                <table id="shopping-cart-table" class="data-table cart-table">
                                    <colgroup>
                                        <col width="1">
                                        <col>
                                        <col width="1">
                                        <col width="1">
                                        <col width="1">
                                        <col width="1">
                                        <col width="1">
                                    </colgroup>
                                    <thead>
                                        <tr class="first last">
                                            <th rowspan="1">Hình ảnh</th>
                                            <th rowspan="1"><span class="nobr">Tên sản phẩm</span></th>
                                            <th class="a-center" colspan="1"><span class="nobr">Giá</span></th>
                                            <th rowspan="1" class="a-center">Số lượng</th>
                                            <th class="a-center" colspan="1">Tổng tiền</th>
                                            <th rowspan="1" class="a-center">Xóa</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr class="first last">
                                            <td colspan="50" class="a-right last">
                                                <button type="button" class="btn-cart btn-continue" onclick="window.location.href='/collections/all'">
                                                    <span>Tiếp tục mua sắm</span>
                                                </button>
                                                <button type="submit" class="btn-cart btn-update">
                                                    <span>Cập nhật</span>
                                                </button>
                                                <button type="button" onclick="window.location.href='/cart/clear'" class="btn-cart btn-empty" id="empty_cart_button">
                                                    <span>Xóa giỏ hàng</span>
                                                </button>                                              
                                            </td>
                                        </tr>
                                    </tfoot>
                                    <tbody>

                                        <tr class="first first odd">
                                            <td>


                                                <a href="/banh-hamburger?variantid=2097590" title="Bánh Hamburger" class="product-image">
                                                    <img alt="Bánh Hamburger" src="//bizweb.dktcdn.net/thumb/small/100/053/643/products/6.jpg?v=1454130202917" width="150" height="150">
                                                </a>

                                            </td>
                                            <td>
                                                <h2 class="product-name">
                                                    <a href="/banh-hamburger?variantid=2097590">Bánh Hamburger</a>
                                                </h2>

                                            </td>
                                            <td class="a-right">
                                                <span class="cart-price">
                                                    <span class="price">30.000₫</span>                
                                                </span>
                                            </td>
                                            <!-- inclusive price starts here -->
                                            <td class="a-center">
                                                <input type="text" class="bizwebinput input-text qty cart_qty form-control mod input-control" maxlength="12" min="1" size="4" title="Số lượng" name="Lines" value="2" onpaste="return false;" onkeypress="validate(event)">
                                            </td>
                                            <!--Sub total starts here -->
                                            <td class="a-right">
                                                <span class="cart-price">
                                                    <span class="price">60.000₫</span>                            
                                                </span>
                                            </td>
                                            <td class="a-center last"><a href="/cart/change?line=1&amp;quantity=0" title="Xóa sản phẩm" class="btn-remove"><i class="fa fa-trash"></i></a></td>
                                        </tr>

                                        <tr class="first last even">
                                            <td>


                                                <a href="/pizza-thap-cam?variantid=2097518" title="Pizza thập cẩm" class="product-image">
                                                    <img alt="Pizza thập cẩm" src="//bizweb.dktcdn.net/thumb/small/100/053/643/products/119.jpg?v=1454043355450" width="150" height="150">
                                                </a>

                                            </td>
                                            <td>
                                                <h2 class="product-name">
                                                    <a href="/pizza-thap-cam?variantid=2097518">Pizza thập cẩm</a>
                                                </h2>

                                            </td>
                                            <td class="a-right">
                                                <span class="cart-price">
                                                    <span class="price">335.000₫</span>                
                                                </span>
                                            </td>
                                            <!-- inclusive price starts here -->
                                            <td class="a-center">
                                                <input type="text" class="bizwebinput input-text qty cart_qty form-control mod input-control" maxlength="12" min="1" size="4" title="Số lượng" name="Lines" value="2" onpaste="return false;" onkeypress="validate(event)">
                                            </td>
                                            <!--Sub total starts here -->
                                            <td class="a-right">
                                                <span class="cart-price">
                                                    <span class="price">670.000₫</span>                            
                                                </span>
                                            </td>
                                            <td class="a-center last"><a href="/cart/change?line=2&amp;quantity=0" title="Xóa sản phẩm" class="btn-remove"><i class="fa fa-trash"></i></a></td>
                                        </tr>

                                    </tbody>
                                </table>
                            </fieldset>
                        </form>


                        <form action="/cart" method="post" id="cart_form" class="clearfix hidden-sm hidden-md hidden-lg small_screen_form">			
                            <ul class="cart_collection">

                                <li class="cart_collection-item avatar">

                                    <img alt="Bánh Hamburger" src="//bizweb.dktcdn.net/thumb/small/100/053/643/products/6.jpg?v=1454130202917" class="circle img-responsive">

                                    <a href="/banh-hamburger?variantid=2097590" title="Bánh Hamburger">Bánh Hamburger</a>


                                    <p>30.000₫<br>
                                        <input type="number" class="bizwebinput small_input form-control mod input-control" min="1" name="Lines" value="2" onpaste="return false;" onkeypress="validate(event)">
                                        60.000₫
                                    </p>
                                    <a href="/cart/change?line=1&amp;quantity=0" data-id="1428720" class="secondary-content cart_item_close">X</a>

                                </li>

                                <li class="cart_collection-item avatar">

                                    <img alt="Pizza thập cẩm" src="//bizweb.dktcdn.net/thumb/small/100/053/643/products/119.jpg?v=1454043355450" class="circle img-responsive">

                                    <a href="/pizza-thap-cam?variantid=2097518" title="Pizza thập cẩm">Pizza thập cẩm</a>


                                    <p>335.000₫<br>
                                        <input type="number" class="bizwebinput small_input form-control mod input-control" min="1" name="Lines" value="2" onpaste="return false;" onkeypress="validate(event)">
                                        670.000₫
                                    </p>
                                    <a href="/cart/change?line=2&amp;quantity=0" data-id="1428721" class="secondary-content cart_item_close">X</a>

                                </li>

                            </ul>
                            <!-- FOTTER-->
                            <div class="cart_option_btn btn-group pull-right">
                                <button type="button" class="btn btn-cart" onclick="window.location.href='/collections/all'">
                                    <span>Tiếp tục mua sắm</span>
                                </button>
                                <button type="submit" class="btn btn-cart">
                                    <span>Cập nhật</span>
                                </button>
                                <button type="button" onclick="window.location.href='/cart/clear'" class="btn btn-cart" id="empty_cart_button">
                                    <span>Xóa giỏ hàng</span>
                                </button>    
                            </div>

                        </form>



                        <div class="cart-collaterals row">
                            <div class="col-1 col-xs-12 col-sm-6 col-md-4">
                            </div>
                            <div class="col-2 col-xs-12 col-sm-6 col-md-4">
                            </div>
                            <div class="col-xs-12 col-sm-12 col-md-4 ">
                                <div class="totals">
                                    <table id="shopping-cart-totals-table">
                                        <colgroup>
                                            <col>
                                            <col width="1">
                                        </colgroup>
                                        <tfoot>
                                            <tr>
                                                <td style="" class="a-right" colspan="1">
                                                    <strong>Tổng tiền</strong>
                                                </td>
                                                <td style="" class="a-right">
                                                    <strong><span class="price">730.000₫</span></strong>
                                                </td>
                                            </tr>
                                        </tfoot>
                                        <tbody>
                                        </tbody>
                                    </table>
                                    <ul class="checkout-types">
                                        <li>    
                                            <button type="button" class="btn-checkout" onclick="window.location.href='/checkout'">
                                                <span>Thanh toán</span>
                                            </button>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </section>
            
            
        <jsp:include page="footer.jsp"></jsp:include>
        <jsp:include page="copyright.jsp"></jsp:include>
        <script src='scripts/bootstrap.minefbf.js' type='text/javascript'></script>
        <script src='scripts/owl.carouselefbf.js' type='text/javascript'></script>
        <script src='scripts/main-scriptefbf.js' type='text/javascript'></script>
        <script src='scripts/componentsefbf.js' type='text/javascript'></script>
        <script src='scripts/appefbf.js' type='text/javascript'></script>
        <script src='scripts/ajax-cartefbf.js' type='text/javascript'></script>
    </body>
</html>
