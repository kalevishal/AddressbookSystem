class PersonInfo {
    private String name;
    private String surname;
    private String address;
    private String email;
    private String city;
    private String zip;
    private String state;
    private String phone;

     public PersonInfo(String name, String surname, String address, String email, String city, String zip, String state, String phone) {
         this.name = name;
         this.surname = surname;
         this.address = address;
         this.email = email;
         this.city = city;
         this.zip = zip;
         this.state = state;
         this.phone = phone;
     }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
        return ("First name: " + name + "\n Last name: " + surname + "\n Address: " + address + "\n city: " + city
                + "\n state: " +state + "\n email: " + email + "\n zip: " + zip + "\n phone number:" + phone + "");


    }



}