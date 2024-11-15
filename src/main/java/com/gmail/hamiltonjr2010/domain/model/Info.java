package com.gmail.hamiltonjr2010.domain.model;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class Info
{
    @Id
    private Long id;
    private Date date;
    private String city;
    private String country;

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

}
