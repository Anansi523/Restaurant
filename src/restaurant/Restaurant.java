package restaurant;

public class Restaurant {
    public static void main(String[] args){
        MenuItem item1 = new MenuItem("butt", "poopy", "butt-related", 0.69, true);
        MenuItem item2 = new MenuItem("water", "wet", "meal", 0.69, true);
        MenuItem item3 = new MenuItem("soda", "wet", "meal", 0.69, true);
        MenuItem item4 = new MenuItem("ice cweam", "wet", "butt-related", 0.69, true);

        Menu menu1 = new Menu();

        menu1.addItem(item1);
        menu1.addItem(item2);
        menu1.addItem(item3);
        menu1.addItem(item4);

        System.out.println(menu1.toString());

        menu1.addItem(item4);

    }
}
