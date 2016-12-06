
package model;

public class category {
    private long categoryID;
    private String categoryName; 
    public category() {
    } 
    public category(long ID_Category, String Name) {
        this.categoryID = ID_Category;
        this.categoryName = Name;
    } 
    public long getCategoryID() {
        return categoryID;
    } 
    public void setCategoryID(long ID_Category) {
        this.categoryID = ID_Category;
    } 
    public String getCategoryName() {
        return categoryName;
    } 
    public void setCategoryName(String Name) {
        this.categoryName = Name;
    } 

}
