import java.util.ArrayList;
public class ShoppingCart {
    private ArrayList<Product>CartProducts;
    private String UserAccount;

    public ArrayList<Product> getCartProducts() {
        return CartProducts;
    }

    public void setCartProducts(ArrayList<Product> cartProducts) {
        CartProducts = cartProducts;
    }

    public String getUserAccount() {
        return UserAccount;
    }

    public void setUserAccount(String userAccount) {
        UserAccount = userAccount;
    }

}
