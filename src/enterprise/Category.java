package enterprise;

import enterprise.discountSystem.Discount;

import java.util.ArrayList;

public class Category {
    public String name;
    private ArrayList<Service> categoryServices;
    private Discount discount;

    public Category(String name) {
        this.name = name;
        this.categoryServices = new ArrayList<>();
    }

    public Category(String name, ArrayList<Service> categoryServices) {
        this(name);
        this.categoryServices = categoryServices;
    }

    public Category(String name, Service categoryService) {
        this(name);
        addServiceToCategory(categoryService);
    }


    public void addServiceToCategory(Service service) {
        this.categoryServices.add(service);
    }

    public ArrayList<Service> getCategoryServices() {
        return categoryServices;
    }

    public void setCategoryServices(ArrayList<Service> categoryServices) {
        this.categoryServices = categoryServices;
    }

    public void setCategoryServices(Service categoryService) {
        addServiceToCategory(categoryService);
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    public boolean hasDiscount(){
        return this.discount != null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", categoryServices=" + categoryServices +
                '}';
    }
}
