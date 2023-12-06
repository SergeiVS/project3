public class Tool {

   private int id;
   private String name;
   private int numberInStock;

    public Tool(int id, String name, int numberInStock) {
        this.id = id;
        this.name = name;
        this.numberInStock = numberInStock;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setInStock(int numberInStock) {
        return numberInStock != 0;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberInStock=" + numberInStock +
                '}';
    }
}
