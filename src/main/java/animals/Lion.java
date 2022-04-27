package animals;

public class Lion extends Animal{

    private boolean canWaitToBeKing;

    public Lion(String name, int age, String diet, boolean canWaitToBeKing){
        super(name, age, diet);
        this.canWaitToBeKing = canWaitToBeKing;
    }

    // Getters & Setters

    public boolean isCanWaitToBeKing() {
        return canWaitToBeKing;
    }

    public void setCanWaitToBeKing(boolean canWaitToBeKing) {
        this.canWaitToBeKing = canWaitToBeKing;
    }

    // Behaviours

    @Override
    public String makeNoise(){
        return "Roar!";
    }

    // Method Overloading-----------------------------------------------------------------------------------------------


   //  Modifying makeNoise- if a string argument is passed- return phrase
    public String makeNoise(String phrase){
        return "I'm going to say: " + phrase;
    }









}
