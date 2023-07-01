import directory.DirectoryComposite;
import directory.File;
import directory.Directory;

public  class Test {

    public static void main(String[] args) {

        DirectoryComposite Dec  =new DirectoryComposite("Dossier 1");
        DirectoryComposite Dec1 =new DirectoryComposite("Dossier 2");
        DirectoryComposite Dec2 =new DirectoryComposite("Dossier 2");
        DirectoryComposite Dec3 =new DirectoryComposite("Dossier 3");

        File F1=new File("Fichier 1");
        File F2=new File("Fichier 2");

        Dec.addItem(Dec1);
        Dec.addItem(Dec2);
        Dec.addItem(Dec3);
        Dec1.addItem(F1);
        Dec1.addItem(F2);

        Dec2.addItem(F1);
        Dec2.addItem(F2);
        
        Dec.displayItems();



        
    }
}