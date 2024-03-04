package exercicioComposicao2;

public class OrderItem {

    private Product product;
    private int quantity;
    private Double price;

    public OrderItem(Product product, int quantity, Double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Double subTotal() {
        return this.quantity * this.price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
