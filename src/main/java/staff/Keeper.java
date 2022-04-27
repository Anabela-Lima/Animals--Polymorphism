package staff;

import animals.Animal;

public class Keeper extends Staff implements Feeder, Cleaner {  // keeper implements feeder and cleaner method

    public Keeper(String name){
        super(name);
    }

//  implementing the methods------------------------------------------------------------------------------------------

    // implementing the feedAnimal method into the keeper
    public void feedAnimal(Animal animal){
        animal.eat();
    }

    // implementing cleanup method for keeper too

    public String cleanUp(){
        return "These animals are really messy!";
    }

// implementing method of go home at end of day-- because staff implements the interface commuter,
    // so all children of staff have to implement the method too

    @Override                                           // we are not overriding anything it will work without it, bec
    public void goHomeAtEndOfDay() {

    }
}
