public class House {
    private int floorsNumber;
    private String address;
    private String [] residentNames;


    public House (int floorsNumber, String address, String [] residentNames) {
        this.address = address;
        this.floorsNumber = floorsNumber;
        this.residentNames = residentNames;
    }

    public int getFloorsNumber () {
           return floorsNumber;
    }
    public void setFloorsNumber(int floorsNumber){
        this.floorsNumber = floorsNumber;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(){
        this.address = address;
    }

    public String[] getResidentNames() {
        return residentNames;
    }
    public void setResidentNames(String[] residentNames) {
        this.residentNames = residentNames;
    }
}


