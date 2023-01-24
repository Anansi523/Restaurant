package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
        private ArrayList<MenuItem> currentItems = new ArrayList<>();
        private Date lastUpdated;
        private static int itemId = 1;

        public Date getLastUpdated() {
            return this.lastUpdated;
        }

        public void addItem(MenuItem newItem) {

            String message = "That item has already been added to the menu.";

            if (currentItems.contains(newItem)) {
                System.out.println(message);
                return;
            }

            for (MenuItem item: currentItems) {
                if (item.equals(newItem)) {
                    System.out.println(message);
                    return;
                }
            }

            currentItems.add(newItem);

        }

        public void RemoveItem(MenuItem item) {
            currentItems.remove(item);
        }

        public String toString() {
            return currentItems.toString();
        }
}


