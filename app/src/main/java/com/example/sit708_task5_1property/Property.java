package com.example.sit708_task5_1property;

import java.util.ArrayList;
import java.util.List;

public class Property {
    private Integer rent,bedroomCount,carParkCount,bathroomCount;
    private String location;


    public Property(String location, Integer rentValue, Integer bedroomCount, Integer carParkCount, Integer bathroomCount) {
        this.location = location;
        this.rent = rentValue;
        this.bedroomCount = bedroomCount;
        this.carParkCount = carParkCount;
        this.bathroomCount = bathroomCount;
    }
    
    public static List<Property> propertyList() {
        List<Property> propertyList = new ArrayList<>();
        for (int i=0; i<3; i++) {
            String location = "Albert Street";
            Property property = new Property(location, 500+((i+1)*100),3,2,2);
            propertyList.add(property);
        }
        for (int i=0; i<4; i++) {
            String location = "Burwood Street";
            Property property = new Property(location, 1000+((i+1)*100),3,2,2);
            propertyList.add(property);
        }
        return propertyList;
    }
    public String getLocation() {
        return location;
    }
    public Integer getRent() {

        return rent;
    }
    public Integer getBedroomCount() {

        return bedroomCount;
    }
    public Integer getCarParkCount() {

        return carParkCount;
    }
    public Integer getBathroomCount() {

        return bathroomCount;
    }
}
