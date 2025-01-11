package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "unit_Price")
    private BigDecimal price; //numeric =>BigDecimal

    @Column(name = "stock")
    private int stock;

    //ilişkiler temsil edilirken fk alan
    //temsil edilmez
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private  ServiceType serviceType;

//    @ManyToMany
//    @JoinTable(name = "Product_Campaign",joinColumns = @JoinColumn(name = "product_id"),
//            inverseJoinColumns =@JoinColumn(name = "campaign_id") )
//    private List<Campaign> campaignList;


    @OneToMany(mappedBy = "product")
    private List<ProductsCampaigns> productsCampaigns;







    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
