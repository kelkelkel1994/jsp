package model;

import java.util.HashMap;
import java.util.Map;

public class cart {
    private HashMap<Long, item> cartItems;

    public cart() {
        cartItems = new HashMap<>();
    }

    public cart(HashMap<Long, item> cartItems) {
        this.cartItems = cartItems;
    }

    public HashMap<Long, item> getCartItems() {
        return cartItems;
    }

    public void setCartItems(HashMap<Long, item> cartItems) {
        this.cartItems = cartItems;
    }
    
    // insert to cart
    public void plusToCart(Long key, item item) {
        boolean check = cartItems.containsKey(key);
        if (check) {
            int quantity_old = item.getQuantity();
            item.setQuantity(quantity_old + 1);
            cartItems.put(key, item);
        } else {
            cartItems.put(key, item);
        }
    }

    // sub to cart
    public void subToCart(Long key, item item) {
        boolean check = cartItems.containsKey(key);
        if (check) {
            int quantity_old = item.getQuantity();
            if (quantity_old <= 1) {
                cartItems.remove(key);
            } else {
                item.setQuantity(quantity_old - 1);
                cartItems.put(key, item);
            }
        }
    }

    // remove to cart
    public void removeToCart(Long key) {
        boolean check = cartItems.containsKey(key);
        if (check) {
            cartItems.remove(key);
        }
    }

    // count item
    public int countItem() {
        return cartItems.size();
    }

    // sum total 
    public double totalCart() {
        double count = 0;
        // count = price * quantity
        for (Map.Entry<Long, item> list : cartItems.entrySet()) {
            if(list.getValue().getProduct().getTTkm() == true)
            {
            count += list.getValue().getProduct().getGiakm()* list.getValue().getQuantity();
            }else{
                count += list.getValue().getProduct().getGia()* list.getValue().getQuantity();
            }
        }
        return count;
    }
}
