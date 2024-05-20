package exp.enumcateory;

public enum Category {
    phone("phn",20000),
    Laptop("lap",70000),
    sim("sm",300);
    private int cost;

    public int getCost() {
        return cost;
    }

    public String getCategoryCode() {
        return CategoryCode;
    }

    private String CategoryCode;
    Category(String CategoryCode,int cost){
        this.CategoryCode=CategoryCode;
        this.cost=cost;
    }


}
