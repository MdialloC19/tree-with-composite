package directory;

import java.util.ArrayList;

public class DirectoryComposite extends Directory{

    private ArrayList <Directory> listDirectories=new ArrayList<Directory>();

    public DirectoryComposite(String name){
        super(name); 
    }

    // displaying elements recursivly 
    @Override
    public void displayItems(){
        String tab= "";
        for(int i=0; i<this.level; i++)
            tab+="\u2502    ";
        if(this.level==0)
            System.out.println(tab+"\u2502\u2500\u2500\u2500" +this.name);
        else
            System.out.println(tab+"\u251c\u2500\u2500\u2500"+this.name);
    
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
