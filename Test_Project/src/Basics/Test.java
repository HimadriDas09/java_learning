package Basics;
import java.util.*;

// there could only be 1 public class in file.
// methods of ArrayList: .add, .get, .set, .remove();

public class Test {
    public static int countOfLaptopByBrand(Laptop[] laptops, String brand){
        // cnt of laptops of the given brand whose rating > 3
        int ans = 0;

        for(int i = 0; i < laptops.length; i++) {
            if(laptops[i].getBrand().equals(brand) && laptops[i].getRating() > 3) ans++;
        }


        return ans;
    }

    public static ArrayList<Laptop> searchLaptopByOsType(Laptop[] laptops, String osType) {
        // return Laptop object array with elem in desc order of laptopId with osType match
        ArrayList<Laptop> list = new ArrayList<Laptop>();

        for(int i = 0; i < laptops.length; i++) {
            if(laptops[i].getOsType().equals(osType)) {
                list.add(laptops[i]);
            }
        }

        // sort list in desc order of laptopId
        Collections.sort(list, (a, b) -> b.getLaptopId() - a.getLaptopId());

        if(list.isEmpty()) return null;

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Laptop[] laptops = new Laptop[4];

        for(int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            String osType = sc.nextLine();
            int price = sc.nextInt();
            int rating = sc.nextInt();

            // insert object
            laptops[i] = new Laptop(id, brand, osType, price, rating);
        }
        sc.nextLine();

        String brand = sc.nextLine();
        String osType = sc.nextLine();

        int cnt = countOfLaptopByBrand(laptops, brand);
        if(cnt > 0) {
            System.out.println(cnt);
        }else{
            System.out.println("The given brand is not available.");
        }

        ArrayList<Laptop> ratingArray = searchLaptopByOsType(laptops, osType);
        if(ratingArray == null) {
            System.out.println("The given os is not available.");
        }
        else {
            for(int i = 0; i < ratingArray.size(); i++) {
                System.out.println(ratingArray.get(i).getLaptopId());
                System.out.println(ratingArray.get(i).getRating());
            }
        }

    }
}

class Laptop{
    private int laptopId, rating;
    private String brand, osType;
    private double price;

    public Laptop(int laptopId, String brand, String osType, double price, int rating){
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    // getters to check
    public String getBrand(){
        return brand;
    }
    public String getOsType(){
        return osType;
    }
    public int getRating(){
        return rating;
    }
    public int getLaptopId(){
        return laptopId;
    }

}
