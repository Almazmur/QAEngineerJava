package lesson4;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private List<Attraction> attractionList;

    public Park() {
        this.attractionList = new ArrayList<>();
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", workingHours='" + workingHours + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public void addAttraction(String name, String workingHours, double price) {
        Attraction attraction = new Attraction(name, workingHours, price);
        attractionList.add(attraction);
    }

    public List<String> getAttractionInfo() {
        List<String> infoList = new ArrayList<>();
        for (Attraction attraction : attractionList) {
            infoList.add(attraction.toString());
        }
        return infoList;
    }
}
