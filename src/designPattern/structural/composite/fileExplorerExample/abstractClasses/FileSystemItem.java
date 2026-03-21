package designPattern.structural.composite.fileExplorerExample.abstractClasses;

public interface FileSystemItem {
    int getSize();
    void delete();
    int totalItems();
    void printStructure(String indent);
}
