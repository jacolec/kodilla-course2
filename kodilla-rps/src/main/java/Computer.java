public final class Computer {

    private final String name;

    public Computer(final String name) {
        this.name = "Computer";
    }

    public String getName() {
        return name;
    }

    public void information() {
        System.out.println("You're fighting against " + getName().toUpperCase() + ". Good luck!" +  "\n");
    }
}

