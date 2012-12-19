package Iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pankcaskes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffless", "Waffles with your choice of blueberries or strawberries", true, 3.59);
    }

    private void addItem(String name, String description, boolean vegeratian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegeratian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
         return menuItems;
    }
}
