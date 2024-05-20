package exp.enumcateory;

public class CategoryMain {
    public static void main(String[] args) {
        Category c1=Category.phone;
        String code=c1.getCategoryCode();
        int price=c1.getCost();
        System.out.println("category code="+code);
        System.out.println("cost="+price);
        Category category[]=Category.values();
        for(Category categories:category){
            System.out.println("enum="+categories);
            System.out.println("category code="+categories.getCategoryCode());
            System.out.println("cost="+categories.getCost());
        }

    }
}
