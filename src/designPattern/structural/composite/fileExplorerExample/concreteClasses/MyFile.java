package designPattern.structural.composite.fileExplorerExample.concreteClasses;

import designPattern.structural.composite.fileExplorerExample.abstractClasses.FileSystemItem;

public class MyFile implements FileSystemItem {
    private final String nameOfFile;
    private final int sizeOfFile;

    public MyFile(String name, int size){
        nameOfFile = name;
        sizeOfFile = size;
    }

    public int getSize() {
        return sizeOfFile;
    }

    public void delete(){
        System.out.println("Deleting file: " + nameOfFile);
    }

    public int totalItems() {
        return 1;
    }

    public void printStructure(String indent){
        System.out.println(indent + "- " + nameOfFile + " -> " + sizeOfFile);
    }
}
