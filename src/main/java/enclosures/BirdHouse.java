package enclosures;

import animals.Bird;
import staff.Keeper;
import staff.Staff;

public class BirdHouse extends Enclosure{

    //  constructor

    public BirdHouse(String name, Keeper keeper){
        super(name, keeper);
    }

    // Every enclosure must have an array list of Animal, we are adding animal of type bird to its own arraylist
    public void addAnimal(Bird bird){   // in bracket Bird bird
        this.animals.add(bird);
    }
}
