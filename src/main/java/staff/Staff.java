package staff;

import animals.Animal;

public abstract class Staff implements Commuter {     // everythin extending staff has to have gohomenedofday method

    private String name;

    // constructor

    public Staff(String name) {
        this.name = name;

    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }}



    // Behaviours

    // Too many behaviours for a staff- we need some distinction between the staff behaviours

//    public String cleanUp(){
//        return "I'm cleaning the place up.";
//    }
//
//    public void feedAnimal(Animal animal){
//        animal.eat();
//    }
//
//    public String sellTicket(){
//        return "Ticket sold!";
//    }
//
//}
