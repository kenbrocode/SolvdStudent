package ECommerceApp;

class Category extends BaseEntity {
    private String name;

    public Category(int categoryId, String name) {
        super(categoryId);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getInfo() {
        return "Category: " + name;
    }

    @Override
    public double calculateCost() {
        return 0.0;
    }

    // Other methods
}