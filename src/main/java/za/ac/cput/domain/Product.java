package za.ac.cput.domain;

public class Product {
    private String prodID;
    private String prodName;
    private double prodPrice;

    public Product(String prodID, String prodName, double prodPrice)
    {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public String getProdID()
    {
        return prodID;
    }

    public String getProdName()
    {
        return prodName;
    }

    public double getProdPrice()
    {
        return prodPrice;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "prodID='" + prodID + '\'' +
                ", prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }
}
