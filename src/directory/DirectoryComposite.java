package directory;

import java.util.ArrayList;

public class DirectoryComposite extends Directory{

    private ArrayList <Directory> listDirectories=new ArrayList<Directory>();
    public DirectoryComposite(String name){
        super(name); 
    }
    @Override
    public void displayItems( ){
        String tab= " ";
        for(int i=0; i<this.level; i++)
            tab+="----";
        System.out.println(tab+""+this.name);
        for( Directory c : listDirectories)
            c.displayItems();  
        
    }
    
    public void addItem(Directory d){
        d.level=this.level+1;
        listDirectories.add(d);
    }

    public void removeItem(Directory d){
        
        listDirectories.remove(d);
    }
    public ArrayList<Directory> getChild(){
        return this.listDirectories;
    }
}
