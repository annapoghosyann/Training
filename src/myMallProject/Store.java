package myMallProject;

public class Store extends Shop {

    public String shopType(int shopTypeNumber) {

        switch (shopTypeNumber) {
            case 1:
                return "Sport";
            case 2:
                return "Men";
            case 3:
                return "Women";
            case 4:
                return "Baby";
            case 5:
                return "Household";
            case 6:
                return "Electronics";
            default:
                return "Invalid input!";
        }
    }
}