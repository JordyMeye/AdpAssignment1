package za.ac.cput.domain;

import java.time.LocalDate;

public class Supplier {
    private String sID;
    private String sName;
    private double totalPrice;

    public Supplier(String sID, String sName, double totalPrice)
    {
        this.sID = sID;
        this.sName = sName;
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
                ", totalPrice=" + totalPrice +
                '}';
    }
}
