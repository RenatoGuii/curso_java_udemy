package exercicioComposicao2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Pedido(String moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        this.orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        this.orderItems.remove(item);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RESUMO DO PEDIDO: \n");
        sb.append("Momento do pedido: ");
        sb.append(this.moment + "\n");
        sb.append("Status do pedido: ");
        sb.append(this.status + "\n");
        sb.append("Cliente: ");
        sb.append(this.client.getName());
        sb.append(" (" + this.client.getBirthDate() + ") - ");
        sb.append(this.client.getEmail() + "\n");

        Double precoFinal = 0.0;

        sb.append("Itens do pedido: \n");
        for (OrderItem oi : this.orderItems) {
            sb.append(oi.getProduct().getName() + ", R$");
            sb.append(oi.getProduct().getPrice() + ", Quantity: ");
            sb.append(oi.getQuantity() + ", Subtotal: R$");
            sb.append(oi.subTotal() + "\n");

            precoFinal += oi.subTotal();
        }

        sb.append("Valor total: R$");
        sb.append(precoFinal);

        return sb.toString();

    }

}
