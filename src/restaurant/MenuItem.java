package restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private boolean isNew;

    public MenuItem(String name, String description, String category, double price, boolean isNew) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }
    public void setName(String aName) {
        this.name = aName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public boolean getIsNew() {
        return isNew;
    }

    private void IsNotNewAnymore() {
        this.isNew = false;
    }

  public String toString() {
        String newPhrase = "";
      if (isNew) {
          newPhrase = " It's new! WOW.";
      }
        return (this.name + " is a "+ this.category + ". " + this.description + " which costs $" + this.price + newPhrase);
  }

  public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        MenuItem someItem = (MenuItem) toBeCompared;
        return someItem.getName() == getName() && someItem.getPrice() == getPrice();
  }

}


