
package sandwich;

import connect.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import model.products;

public class productSW {
    // get danh sách sản phẩm dựa vào mã danh mục
    public ArrayList<model.products> getListProductByCategory(long category_id)  
throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM product WHERE ID_Category = '" + category_id + "' && `Status` = TRUE";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<model.products> list = new ArrayList<>();
        while (rs.next()) {
            model.products product = new model.products();
            product.setIDsp(rs.getLong("ID_Product"));
            product.setIDct(rs.getLong("ID_Category"));
            product.setTen(rs.getString("Name"));
            product.setGia(rs.getInt("Price"));
            product.setAnhbia(rs.getString("ImagesFeature"));
            product.setGiakm(rs.getInt("PromotionPrice"));
            product.setMotangan(rs.getString("ShortDescription"));
            product.setMota(rs.getString("Description"));
            product.setTTkm(rs.getBoolean("StatusPromotion"));
            list.add(product);
        }
        return list;
    } 
    
    public ArrayList<model.products> getListProductByHot()  throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM product WHERE `StatusHot` = TRUE && `Status` = TRUE";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<model.products> list = new ArrayList<>();
        while (rs.next()) {
            model.products product = new model.products();
            product.setIDsp(rs.getLong("ID_Product"));
            product.setIDct(rs.getLong("ID_Category"));
            product.setTen(rs.getString("Name"));
            product.setGia(rs.getInt("Price"));
            product.setAnhbia(rs.getString("ImagesFeature"));
            product.setGiakm(rs.getInt("PromotionPrice"));
            product.setMotangan(rs.getString("ShortDescription"));
            product.setMota(rs.getString("Description"));
            product.setTTkm(rs.getBoolean("StatusPromotion"));
            list.add(product);
        }
        return list;
    }
    public ArrayList<model.products> getListProductByTop()  throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM product WHERE `StatusTop` = TRUE && `Status` = TRUE";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<model.products> list = new ArrayList<>();
        while (rs.next()) {
            model.products product = new model.products();
            product.setIDsp(rs.getLong("ID_Product"));
            product.setIDct(rs.getLong("ID_Category"));
            product.setTen(rs.getString("Name"));
            product.setGia(rs.getInt("Price"));
            product.setAnhbia(rs.getString("ImagesFeature"));
            product.setGiakm(rs.getInt("PromotionPrice"));
            product.setMotangan(rs.getString("ShortDescription"));
            product.setMota(rs.getString("Description"));
            product.setTTkm(rs.getBoolean("StatusPromotion"));
            list.add(product);
        }
        return list;
    }
    public ArrayList<model.products> getListProductByPromotion()  throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM product WHERE `StatusPromotion` = TRUE && `Status` = TRUE";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<model.products> list = new ArrayList<>();
        while (rs.next()) {
            model.products product = new model.products();
            product.setIDsp(rs.getLong("ID_Product"));
            product.setIDct(rs.getLong("ID_Category"));
            product.setTen(rs.getString("Name"));
            product.setGia(rs.getInt("Price"));
            product.setAnhbia(rs.getString("ImagesFeature"));
            product.setGiakm(rs.getInt("PromotionPrice"));
            product.setMotangan(rs.getString("ShortDescription"));
            product.setMota(rs.getString("Description"));
            product.setTTkm(rs.getBoolean("StatusPromotion"));
            list.add(product);
        }
        return list;
    }
    public ArrayList<model.products> getListProductByTopweek()  throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM product WHERE `StatusTopWeek` = TRUE && `Status` = TRUE";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<model.products> list = new ArrayList<>();
        while (rs.next()) {
            model.products product = new model.products();
            product.setIDsp(rs.getLong("ID_Product"));
            product.setIDct(rs.getLong("ID_Category"));
            product.setTen(rs.getString("Name"));
            product.setGia(rs.getInt("Price"));
            product.setAnhbia(rs.getString("ImagesFeature"));
            product.setGiakm(rs.getInt("PromotionPrice"));
            product.setMotangan(rs.getString("ShortDescription"));
            product.setMota(rs.getString("Description"));
            product.setTTkm(rs.getBoolean("StatusPromotion"));
            list.add(product);
        }
        return list;
    }
    public ArrayList<model.products> getListProductByNew()  throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM product WHERE `StatusNew` = TRUE && `Status` = TRUE";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<model.products> list = new ArrayList<>();
        while (rs.next()) {
            model.products product = new model.products();
            product.setIDsp(rs.getLong("ID_Product"));
            product.setIDct(rs.getLong("ID_Category"));
            product.setTen(rs.getString("Name"));
            product.setGia(rs.getInt("Price"));
            product.setAnhbia(rs.getString("ImagesFeature"));
            product.setGiakm(rs.getInt("PromotionPrice"));
            product.setMotangan(rs.getString("ShortDescription"));
            product.setMota(rs.getString("Description"));
            product.setTTkm(rs.getBoolean("StatusPromotion"));
            list.add(product);
        }
        return list;
    }
    public products getProductDetail(long masp)  throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM product WHERE ID_Product = '"+masp+"' && `Status` = TRUE";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        products product = new products();
        while (rs.next()) {
            product.setIDsp(rs.getLong("ID_Product"));
            product.setIDct(rs.getLong("ID_Category"));
            product.setTen(rs.getString("Name"));
            product.setGia(rs.getInt("Price"));
            product.setAnhbia(rs.getString("ImagesFeature"));
            product.setAnh1(rs.getString("Subimage1"));
            product.setAnh2(rs.getString("Subimage2"));
            product.setGiakm(rs.getInt("PromotionPrice"));
            product.setMotangan(rs.getString("ShortDescription"));
            product.setMota(rs.getString("Description"));
            product.setTTkm(rs.getBoolean("StatusPromotion"));
        }
        return product;
    }
    //san pham lien quan
    public ArrayList<model.products> getListProductByLienquan(long category_id)  
throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM product WHERE ID_Category = '" + category_id + "' && `Status` = TRUE ORDER BY RAND()";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<model.products> list = new ArrayList<>();
        while (rs.next()) {
            model.products product = new model.products();
            product.setIDsp(rs.getLong("ID_Product"));
            product.setIDct(rs.getLong("ID_Category"));
            product.setTen(rs.getString("Name"));
            product.setGia(rs.getInt("Price"));
            product.setAnhbia(rs.getString("ImagesFeature"));
            product.setGiakm(rs.getInt("PromotionPrice"));
            product.setMotangan(rs.getString("ShortDescription"));
            product.setMota(rs.getString("Description"));
            product.setTTkm(rs.getBoolean("StatusPromotion"));
            list.add(product);
        }
        return list;
    } 
    public static void main(String[] args) throws SQLException {
        productSW dao = new productSW();
        for(model.products p : dao.getListProductByLienquan(2)){
            System.out.println(p.getIDsp()+ " - "+p.getTen()+" - "+p.getMotangan());
        }
        //System.out.println(dao.getProductDetail(1).getIDsp() + "-" +dao.getProductDetail(1).getTen());
    }  
}
