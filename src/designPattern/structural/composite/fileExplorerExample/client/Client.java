package designPattern.structural.composite.fileExplorerExample.client;

import designPattern.structural.composite.fileExplorerExample.abstractClasses.FileSystemItem;
import designPattern.structural.composite.fileExplorerExample.concreteClasses.MyFile;
import designPattern.structural.composite.fileExplorerExample.concreteClasses.MyFolder;

public class Client {
    public static void main(String[] args) {
        FileSystemItem file1 = new MyFile("waterfall.jpg", 1200);
        FileSystemItem file2 = new MyFile("robo.txt", 246);
        FileSystemItem file3 = new MyFile("main.cpp", 34);
        FileSystemItem file4 = new MyFile("tests.robot", 1280);

        MyFolder home = new MyFolder("home");
        MyFolder pictures = new MyFolder("pictures");
        MyFolder documents = new MyFolder("documents");
        MyFolder project = new MyFolder("project");
        MyFolder UTCDemo = new MyFolder("unit_testing_demo");


        home.addItems(pictures);
        home.addItems(documents);
        home.addItems(project);
        pictures.addItems(file1);
        documents.addItems(file2);
        project.addItems(UTCDemo);
        UTCDemo.addItems(file3);
        UTCDemo.addItems(file4);

        System.out.println("------------Size of the Folder Structure------------------");
        System.out.println(home.getSize());

        System.out.println("------------total number of items-------------------------");
        System.out.println(home.totalItems());

        System.out.println("------------folder structure------------------------------");
        home.printStructure("");
    }
}
