public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {

        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expenive");
        }
    }

    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This notebook is light");
        } else if (this.weight > 600 && this.weight < 2000) {
            System.out.println("This notebook is not so heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    public void  checkYearAndPrice() {
        if (this.year == 2020 && this.price == 2000) {
            System.out.println("This notebook is new and expensive");
        } else if (this.year < 2015 && this.price < 2000) {
            System.out.println("This notebook is not new and not expensive");
        } else {
            System.out.println("This notebook is old and cheap");
        }
    }

}
