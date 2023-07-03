package directory;

import java.util.ArrayList;

public class File extends Directory{
    

    ArrayList <Directory> listFile=new ArrayList<Directory>();

    public File(String name){
        super(name);
    }

    
    @Override
    public void displayItems( ){
        String tab= "";
        for(int i=0; i<this.level; i++)
            tab+="\u2502    ";
        System.out.println(tab+"\u251c\u2500\u2500\u2500"+this.name);
        
            
        
    }
    
    // public void addItem(Directory d){
    //     this.level++;
    //     listFile.add(d);
    // }

    // public void removeItem(Directory d){
    //     this.level--;
    //     listFile.remove(d);
    // }
    // public ArrayList<Directory> getChild(){
    //     return this.listFile;
    // }
    
}
