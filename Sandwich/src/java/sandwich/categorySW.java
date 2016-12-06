package sandwich;
import connect.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import model.category;
public class categorySW {
    public ArrayList<category> getListCategory() throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM product_category WHERE `Status` = TRUE";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<category> list = new ArrayList<>();
        while (rs.next()) {
            category category = new category();
            category.setCategoryID(rs.getInt("ID_Category"));
            category.setCategoryName(rs.getString("Name"));
            list.add(category);
        }
        return list;
    }
    public static void main(String[] args) throws SQLException {
        categorySW dao = new categorySW();
        for (category ds : dao.getListCategory()) {
            System.out.println(ds.getCategoryID() + " - " + ds.getCategoryName());
        }
    }
}
