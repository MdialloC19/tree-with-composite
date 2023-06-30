package directory;

public abstract class  Directory {

    protected int level;
    protected String name;

    public Directory(String name){
        this.name=name;
    }

    abstract public void displayItems();

}


