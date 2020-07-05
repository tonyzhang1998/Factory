package com.ds.factory.datasource.entities;
import lombok.Data;

@Data
public class Product_Purchase_Details {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Jul 05 08:24:52 CST 2020
     */
    private String Product_no;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Jul 05 08:24:52 CST 2020
     */
    private String Product_requirements;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Jul 05 08:24:52 CST 2020
     */
    private Long Purchase_numbers;

    public String getProduct_no() { return Product_no; }
    public void setProduct_no(String product_no) { Product_no = product_no; }

    public String getProduct_requirements() { return Product_requirements; }
    public void setProduct_requirements(String product_requirements) { Product_requirements = product_requirements; }

    public Long getPurchase_numbers() { return Purchase_numbers; }
    public void setPurchase_numbers(Long purchase_numbers) { Purchase_numbers = purchase_numbers; }

    public Product_Purchase_Details(){

    }

    public Product_Purchase_Details(String Product_no,String Product_requirements,Long Purchase_numbers){
        this.Product_no=Product_no;
        this.Product_requirements=Product_requirements;
        this.Purchase_numbers=Purchase_numbers;
    }
}