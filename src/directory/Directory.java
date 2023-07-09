package directory;

/**
 * La classe abstraite Directory représente la structure de base pour un élément
 * du système de fichiers.
 * Cette classe est conçue en utilisant le design pattern Composite.
 */
public abstract class Directory {

    protected int level;
    protected String name;

    /**
     * Constructeur de la classe Directory.
     *
     * @param name Le nom du répertoire.
     */
    public Directory(String name) {
        this.name = name;
    }

    /**
     * Méthode abstraite pour afficher les éléments du répertoire.
     * Chaque sous-classe concrète doit implémenter cette méthode selon son
     * comportement spécifique.
     */
    abstract public void displayItems();

}
