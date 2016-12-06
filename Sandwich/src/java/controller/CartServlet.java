package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.cart;
import model.item;
import model.products;
import sandwich.productSW;

public class CartServlet extends HttpServlet {

    private final productSW productsw = new productSW();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String command = request.getParameter("command");
        String url = request.getParameter("url");
        String productID = request.getParameter("productID");
        cart cart = (cart) session.getAttribute("cart");
        try {
            Long idProduct = Long.parseLong(productID);
            products product = productsw.getProductDetail(idProduct);
            switch (command) {
                case "plus":
                    if (cart.getCartItems().containsKey(idProduct)) {
                        cart.plusToCart(idProduct, new item(product,
                                cart.getCartItems().get(idProduct).getQuantity()));
                    } else {
                        cart.plusToCart(idProduct, new item(product, 1));
                    }
                    break;
                case "remove":
                    cart.removeToCart(idProduct);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("index.jsp");
        }
        session.setAttribute("cart", cart);
        if(url == null)
        {
            response.sendRedirect("index.jsp");
        }else {
        response.sendRedirect(url);
        }
    }

}
