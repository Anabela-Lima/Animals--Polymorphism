package staff;

public class Janitor extends Staff implements Cleaner{

    public Janitor(String name){
        super(name);
    }

    // implementing cleanup method for janitor
    public String cleanUp(){
        return "I'm mopping the floor";
    }


    // implement method go home at end of day

    @Override
    public void goHomeAtEndOfDay() {

    }
}

