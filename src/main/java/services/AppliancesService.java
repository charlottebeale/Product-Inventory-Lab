package services;

import models.Appliances;
import java.util.List;
import java.util.ArrayList;

public class AppliancesService {

    private static int nextId = 1;
    private static List<Appliances> inventory;

    public AppliancesService() {
    }


    public Appliances create(String name, String brand, String type, int size, int qty, float price) {
        Appliances createdAppliances = new models.Appliances(nextId++, name, brand, type, size, qty, price );
        inventory.add(createdAppliances);
        return createdAppliances;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        AppliancesService.nextId = nextId;
    }

    public java.util.List<Appliances> getInventory() {
        return inventory;
    }

    public void setInventory(List<Appliances> inventory) {
        this.inventory = inventory;
    }

    public Appliances findAppliances(int id) {
        for(Appliances appliances : inventory) {
            if (appliances.getId() == id)
                return appliances;
            // return inventory.stream().filter(appliances -> appliances.getId() == id).findFirst().orElse(null);
        }
        return null;
    }

    public Appliances[] findAll() {
        return  inventory.toArray(new Appliances[inventory.size()]);
    }

    public boolean delete(int id) {
        if (inventory.contains(findAppliances(id))) {
            delete(id);
            return true;
        }
        else {
            return false;
        }
    }
}
