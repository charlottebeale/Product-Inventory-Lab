package services;

import models.Furniture;

import java.util.ArrayList;
import java.util.List;

public class FurnitureService {

    private static int nextId = 1;  // (1)
    private List<Furniture> inventory = new ArrayList<Furniture>();  // (2)


    public FurnitureService() {

    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        FurnitureService.nextId = nextId;
    }

    public List<Furniture> getInventory() {
        return inventory;
    }

    public void setInventory(List<Furniture> inventory) {
        this.inventory = inventory;
    }

    public Furniture create(String name, String brand, String type, int size, int qty, float price) {
        Furniture createFurniture = new Furniture(nextId++, name, brand, type, size, qty, price);
        inventory.add(createFurniture);
        return createFurniture;
    }

    public Furniture findFurniture(int id) {
        for(Furniture furniture : inventory) {
            if (furniture.getId() == id)
                return furniture;
        }
        return null;
       // return inventory.stream().filter(furniture -> furniture.getId() == id).findFirst().orElse(null);

    }


    public Furniture[] findAll() {
            return inventory.toArray(new Furniture[inventory.size()]);
        }

    public boolean delete(int id) {
        if (inventory.contains(findFurniture(id))) {
            delete(id);
            return true;
        }
        else {
            return false;
        }
    }
}

