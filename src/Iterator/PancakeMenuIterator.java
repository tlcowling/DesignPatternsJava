package Iterator;

import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {
    ArrayList pancakeHouseMenu;
    private int position;

    public PancakeMenuIterator(ArrayList menuItems) {
        this.pancakeHouseMenu = menuItems;
        this.position = 0;
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem)this.pancakeHouseMenu.get(position);
        this.position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return (position >= pancakeHouseMenu.size() || pancakeHouseMenu.get(position) == null);
    }
}
