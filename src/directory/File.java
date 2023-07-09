package directory;

import java.util.ArrayList;

/**
 * La classe File représente un fichier dans le système de fichiers.
 * Cette classe est une implémentation concrète d'un élément du design pattern
 * Composite.
 */
public class File extends Directory {

    ArrayList<Directory> listFile = new ArrayList<Directory>();

    /**
     * Constructeur de la classe File.
     *
     * @param name Le nom du fichier.
     */
    public File(String name) {
        super(name);
    }

    /**
     * Affiche le fichier.
     * Cette méthode utilise une indentation pour représenter la hiérarchie des
     * fichiers.
     */
    @Override
    public void displayItems() {
        String tab = "";
        for (int i = 0; i < this.level; i++)
            tab += "\u2502    ";
        System.out.println(tab + "\u251c\u2500\u2500\u2500" + this.name);
    }
}
