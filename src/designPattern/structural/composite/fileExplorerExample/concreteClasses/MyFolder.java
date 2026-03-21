package designPattern.structural.composite.fileExplorerExample.concreteClasses;

import designPattern.structural.composite.fileExplorerExample.abstractClasses.FileSystemItem;

import java.util.ArrayList;
import java.util.List;

public class MyFolder implements FileSystemItem {
    private final String folderName;
    private final List<FileSystemItem> children = new ArrayList<>();

    public MyFolder(String folder) {
        folderName = folder;
    }

    public void addItems(FileSystemItem fs) {
        children.add(fs);
    }

    public void removeItem(FileSystemItem fs){
        children.remove(fs);
    }

    public int getSize() {
        int tot = 0;
        for(FileSystemItem fs : children){
            tot += fs.getSize();
        }
        return tot;
    }

    public void delete() {
        for(FileSystemItem fs : children){
            fs.delete();
        }
        System.out.println("Deleted folder: " + folderName);
    }

    public int totalItems() {
        int tot = 1;//for the folder itself
        for(FileSystemItem fs : children){
            tot += fs.totalItems();
        }
        return tot;
    }

    public void printStructure(String indent) {
        System.out.println(indent + "+ " + folderName + ":->");
        for(FileSystemItem fs : children){
            fs.printStructure(indent + "\t");
        }
    }
}
