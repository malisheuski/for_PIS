package Zoo;

public class Animal {
    protected String name;
    String eats;
  protected   boolean vegetarian;
    int numberOfLegs;
    Animal() {}
   public Animal(boolean veg, String food, int legs) {
        this.vegetarian = veg;
        this.eats = food;
        this.numberOfLegs = legs;
    }
    void setName(String name) {this.name = name;}
    String getName() {return name;}
    boolean isVegetarian() {return vegetarian;}
    void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    String getEats() {return eats;}
        void setEats(String eats) {this.eats = eats;}
        int getnumberOfLegs() {return numberOfLegs;}
        void setnumberOfLegs(int noOfLegs) {
            this.numberOfLegs = noOfLegs;
        }
        void showAllData() {
            System.out.println("Название животного:"+name+", травоядное: " + vegetarian + ", питается: " + eats + ",количество конечностей: " + numberOfLegs);
        }}


