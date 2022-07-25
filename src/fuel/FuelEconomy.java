package fuel;

import fuel.manufacturers.CarManufacturers;

import java.util.*;

public class FuelEconomy {

    public static void main(String[] args) {

        CarManufacturers [] carCompany = new CarManufacturers[20];

        CarManufacturers toyotaManufacturers = new CarManufacturers("Toyota Prius", 133);
        CarManufacturers teslaManufacturers = new CarManufacturers("Tesla Model 3", 130);
        CarManufacturers hyundaiManufacturers = new CarManufacturers("Hyundai Kona Electric", 120);
        CarManufacturers chevroletManufacturers = new CarManufacturers("Chevrolet Bolt 2LT", 120);
        CarManufacturers kiaManufacturers = new CarManufacturers("Kia Niro Electric EX", 112);
        CarManufacturers nissanManufacturers = new CarManufacturers("Nissan Leaf", 104);
        CarManufacturers hondaManufacturers = new CarManufacturers("Honda Insight", 54);
        CarManufacturers mitsubishiManufacturers = new CarManufacturers("Mitsubishi Mirage", 37);
        CarManufacturers mazdaManufacturers = new CarManufacturers("Mazda 3", 30);
        CarManufacturers volkswagenManufacturers = new CarManufacturers("Volkswagen Jetta SE", 34);
        CarManufacturers subaruManufacturers = new CarManufacturers("Subaru Impreza", 30);
        CarManufacturers miniManufacturers = new CarManufacturers("Mini Cooper S", 30);
        CarManufacturers bmwManufacturers = new CarManufacturers("BMW Z4", 29);
        CarManufacturers porscheManufacturers = new CarManufacturers("Porsche Taycan 4S", 69);
        CarManufacturers audiManufacturers = new CarManufacturers("Audi A4", 27);
        CarManufacturers mercedesManufacturers = new CarManufacturers("Mercedes-Benz A220", 22);
        CarManufacturers volvoManufacturers = new CarManufacturers("Volvo S60", 26);
        CarManufacturers lexusManufacturers = new CarManufacturers("Lexus ES 350", 25);
        CarManufacturers fordManufacturers = new CarManufacturers("Ford Escape SE", 26);
        CarManufacturers jeepManufacturers = new CarManufacturers("Jeep Gladiator Sport", 18);




        carCompany[0] = toyotaManufacturers;
        carCompany[1] = teslaManufacturers;
        carCompany[2] = hyundaiManufacturers;
        carCompany[3] = chevroletManufacturers;
        carCompany[4] = kiaManufacturers;
        carCompany[5] = nissanManufacturers;
        carCompany[6] = hondaManufacturers;
        carCompany[7] = mitsubishiManufacturers;
        carCompany[8] = mazdaManufacturers;
        carCompany[9] = volkswagenManufacturers;
        carCompany[10] = subaruManufacturers;
        carCompany[11] = miniManufacturers;
        carCompany[12] = bmwManufacturers;
        carCompany[13] = porscheManufacturers;
        carCompany[14] = audiManufacturers;
        carCompany[15] = mercedesManufacturers;
        carCompany[16] = volvoManufacturers;
        carCompany[17] = lexusManufacturers;
        carCompany[18] = fordManufacturers;
        carCompany[19] = jeepManufacturers;

        Integer tempMaxMpg = 0;
        String tempCarManufacturer = "";

        for (int i = 0; i < carCompany.length; i++) {

            if (carCompany[i].fuelConsumptionMpg > tempMaxMpg) {
                tempCarManufacturer = carCompany[i].manufacurerName;
                tempMaxMpg = carCompany[i].fuelConsumptionMpg;
            }
        }

        System.out.println("Most Fuel-Efficient car is:");
        System.out.println(tempCarManufacturer + " " + tempMaxMpg);

        System.out.println("-------------------------------------");

        ArrayList<String> fuelMpg = new ArrayList<>();

        fuelMpg.add("Toyota");
        fuelMpg.add("Tesla");
        fuelMpg.add("Kia");
        fuelMpg.add("Chevrolet");
        fuelMpg.add("Hyundai");
        fuelMpg.add("Nissan");
        fuelMpg.add("Audi");
        fuelMpg.add("Mini");
        fuelMpg.add("Volvo");
        fuelMpg.add("Lexus");
        fuelMpg.add("Bmw");
        fuelMpg.add("Subaru");
        fuelMpg.add("Volkswagen");
        fuelMpg.add("Mazda");
        fuelMpg.add("Jeep");
        fuelMpg.add("Mercedes-Benz");
        fuelMpg.add("Porsche");
        fuelMpg.add("Mitsubishi");
        fuelMpg.add("Ford");
        fuelMpg.add("Honda");

        for (int i = 0; i < fuelMpg.size(); i++) {
            System.out.println(fuelMpg.get(i));
            System.out.println(fuelMpg.indexOf(fuelMpg.get(i)));
        }

        System.out.println("-------------------------------------");

        ArrayList<Integer> newMpg = new ArrayList<>();

        newMpg.add(133);
        newMpg.add(130);
        newMpg.add(120);
        newMpg.add(120);
        newMpg.add(112);
        newMpg.add(104);
        newMpg.add(54);
        newMpg.add(37);
        newMpg.add(30);
        newMpg.add(34);
        newMpg.add(30);
        newMpg.add(30);
        newMpg.add(29);
        newMpg.add(69);
        newMpg.add(27);
        newMpg.add(22);
        newMpg.add(26);
        newMpg.add(25);
        newMpg.add(26);
        newMpg.add(18);

        int tempMin = newMpg.get(0);
        int tempMax = newMpg.get(1);
        int tempVariable = newMpg.size();

        for(int i = 0; i < tempVariable; i++) {
            if(newMpg.get(i) < tempMin) {
                tempMin = newMpg.get(i);
            }
        }

        for(int i = 0;  i < tempVariable; i++){
            if(newMpg.get(i) > tempMax){
                tempMax = newMpg.get(i);
            }
        }

        System.out.println("Worst Fuel Consumption per MPG is: " + tempMin);
        System.out.println("Best Fuel Consumption per MPG is: " + tempMax);


        System.out.println("-------------------------------------");


        HashMap<String, Integer> bestConsumptionMpg = new HashMap<String, Integer>();

        bestConsumptionMpg.put("Toyota Prius", 133);
        bestConsumptionMpg.put("Tesla Model 3", 130);
        bestConsumptionMpg.put("Hyundai Kona Electric", 120);
        bestConsumptionMpg.put("Chevrolet Bolt 2LT", 120);
        bestConsumptionMpg.put("Kia Niro Electric EX", 112);
        bestConsumptionMpg.put("Nissan Leaf", 104);
        bestConsumptionMpg.put("Honda Insight", 54);
        bestConsumptionMpg.put("Mitsubishi Mirage", 37);
        bestConsumptionMpg.put("Mazda 3", 30);
        bestConsumptionMpg.put("Volkswagen Jetta SE", 34);
        bestConsumptionMpg.put("Subaru Impreza", 30);
        bestConsumptionMpg.put("Mini Cooper S", 30);
        bestConsumptionMpg.put("BMW Z4", 29);
        bestConsumptionMpg.put("Porsche Taycan 4S", 69);
        bestConsumptionMpg.put("Audi A4", 27);
        bestConsumptionMpg.put("Mercedes-Benz A220", 22);
        bestConsumptionMpg.put("Volvo S60", 26);
        bestConsumptionMpg.put("Lexus ES 350", 25);
        bestConsumptionMpg.put("Ford Escape SE", 26);
        bestConsumptionMpg.put("Jeep Gladiator Sport", 18);


        int maxBestConsumptionMpg = (Collections.max(bestConsumptionMpg.values()));

        for (Map.Entry<String,Integer> entry: bestConsumptionMpg.entrySet()){
            if(entry.getValue()==maxBestConsumptionMpg){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        System.out.println(bestConsumptionMpg);
        System.out.println(bestConsumptionMpg.get("Toyota Prius"));
        System.out.println(bestConsumptionMpg.containsValue(130));
        System.out.println(bestConsumptionMpg.containsKey("Hyundai Kona Electric"));
    }
}
