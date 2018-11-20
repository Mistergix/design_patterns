public abstract class Drink {
    void followRecipe() {
        boil();
        prepare();
        pour();
        if (wantsAccompaniements()) {
            addAccompaniements();
        }

    }


    abstract void addAccompaniements();


    abstract void prepare();

    private void pour() {
        System.out.println("Pouring in the cup");
    }

    private void boil() {
        System.out.println("Boiling water");
    }

    public boolean wantsAccompaniements() // adapter method, the sub class is free to overide it
    {
        return true;
    }
}
