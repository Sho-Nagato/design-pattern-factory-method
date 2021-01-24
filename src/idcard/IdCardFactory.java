package idcard;

import java.util.ArrayList;

import framework.Factory;
import framework.Product;

public class IdCardFactory extends Factory {

    private ArrayList<String> owners = new ArrayList<String>();

    @Override
    protected Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        IdCard idCard = (IdCard)product;
        String owner = idCard.getOwner();
        owners.add(owner);
    }

    public ArrayList<String> getOwners() {
        return owners;
    }
}
