import java.util.ArrayList;
public class Category{
    private String nameOfTheCategory;
    private ArrayList<Product> products;


    public String getNameOfTheCategory() {
        return nameOfTheCategory;
    }

    private void setNameOfTheCategory(String nameOfTheCategory) {
        this.nameOfTheCategory = nameOfTheCategory;
    }

    private void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

}
