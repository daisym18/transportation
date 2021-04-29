package ir.mina.transportation.order;


import ir.mina.transportation.client.Client;
import lombok.Data;

@Data
public class OrderEntity {

    private Long id;
    private String sourceAddress;
    private String destinationAddress;
    private String receiverName;
    private String receiverMobileNumber;
    private boolean isDocument;
    private String content;
    private int height;
    private int width;
    private int length;
    private float price;
    private String receiptCode;
    private ServiceType serviceType;
    private OrderStatus orderStatus;
    private Client client;

}
