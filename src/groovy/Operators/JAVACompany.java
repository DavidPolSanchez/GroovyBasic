package groovy.Operators;

public class JAVACompany {
    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    Address adress;
    public static void main(String[] args) throws Exception {
        JAVACompany company = null;
        if(company.getAdress()!=null && company.getAdress().getStreet() !=null){
            System.out.println(company.adress.street);
        }
    }
}

