package za.ac.cput.domain;

import java.time.LocalDate;

public class Supplier {
    private String sID;
    private String sName;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private double totalPrice;

    public Supplier(String sID, String sName, LocalDate orderDate, LocalDate deliveryDate, double totalPrice)
    {
        this.sID = sID;
        this.sName = sName;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.totalPrice = totalPrice;
    }

    public String getsID()
    {
        return sID;
    }

    public String getsName()
    {
        return sName;
    }

    public LocalDate getOrderDate()
    {
        return orderDate;
    }

    public LocalDate getDeliveryDate()
    {
        return deliveryDate;
    }

    public double getTotalPrice()
    {
        return totalPrice;
    }

    @Override
    public String toString()
    {
        return "Supplier{" +
                "sID='" + sID + '\'' +
                ", sName='" + sName + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
