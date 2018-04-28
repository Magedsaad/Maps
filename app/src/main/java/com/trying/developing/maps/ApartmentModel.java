package com.trying.developing.maps;

/**
 * Created by developing on 4/24/2018.
 */

class ApartmentModel {

    public Double  lat  ;
    public Double lng  ;
    public  String  size  ;
    public  String desc ;

    public  String adress ;


    public ApartmentModel() {
    }

    public ApartmentModel(Double lat, Double lng, String size, String desc, String adress) {
        this.lat = lat;
        this.lng = lng;
        this.size = size;
        this.desc = desc;
        this.adress = adress;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLng() {
        return lng;
    }

    public String getSize() {
        return size;
    }

    public String getDesc() {
        return desc;
    }

    public String getAdress() {
        return adress;
    }
}
