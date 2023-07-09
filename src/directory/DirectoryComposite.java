package directory;

import java.util.ArrayList;

/**
 * La classe DirectoryComposite représente un répertoire composite qui peut
 * contenir d'autres répertoires ou fichiers.
 * Cette classe est une implémentation concrète du design pattern Composite.
 */
public class DirectoryComposite extends Directory {

    private ArrayList<Directory> listDirectories = new ArrayList<Directory>();

    /**
     * Constructeur de la classe DirectoryComposite.
     *
     * @param name Le nom du répertoire composite.
     */
    public DirectoryComposite(String name) {
        super(name);
    }

    /**
     * Affiche récursivement les éléments du répertoire composite.
     * Cette méthode utilise une indentation pour représenter la hiérarchie des
     * répertoires.
     * Les répertoires sont affichés avec des symboles spéciaux pour représenter
     * leur niveau dans la hiérarchie.
     */
    @Override
    public void displayItems() {
        String tab = "";
        for (int i = 0; i < this.level; i++)
            tab += "\u2502    ";
        if (this.level == 0)
            System.out.println(tab + "\u2502\u2500\u2500\u2500" + this.name);
        else
            System.out.println(tab + "\u251c\u2500\u2500\u2500" + this.name);

        for (Directory c : listDirectories)
            c.displayItems();
    }

    /**
     * Ajoute un élément (répertoire ou fichier) au répertoire composite.
     *
     * @param d L'élément à ajouter.
     */
    public void addItem(Directory d) {
        d.level = this.level + 1;
        listDirectories.add(d);
    }

    /**
     * Supprime un élément (répertoire ou fichier) du répertoire composite.
     *
     * @param d L'élément à supprimer.
     */
    public void removeItem(Directory d) {
        listDirectories.remove(d);
    }

    /**
     * Récupère la liste des sous-répertoires du répertoire composite.
     *
     * @return La liste des sous-répertoires.
     */
    public ArrayList<Directory> getChild() {
        return this.listDirectories;
    }
}
