package com.vdabmao2018.lessen.les6;




/* visibility:
    private: enkel de huidige class heeft toegang
    public: alles mag die shit gebruiken
    (default): je schrijft niets => alles binnen de huidige PACKAGE mag dit gebruiken
    protected: alles binnen de package + alles dat subclasse is van deze class mag dit gebruiken
    
 */

public class Adress {
    private String recipient;  //private makes a variable only accessible or "visible" inside the bloody class where it has just been declared.
    private String street;
    private String number;
    private String postalCode; //you don't calculate with this number, safer to use as a String
    private String city;


    public Adress(String recipient, String street, String number, String postalCode, String city){
        this.recipient = recipient;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }

    //getters en setters omzeilen het "private" principe. getters => readonly
    //                                                    setters => overwrite
    //denk na hoe je die gebruikt.
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }
}

