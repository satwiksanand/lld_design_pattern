package designPattern.structural.facade.deploymentServiceExample.subSystems;

//I could implement them in a better way but let's go with implementing this example first.

public class VersionControlSystem {
    public void pullLatestChanges(String branch) {
        System.out.println("pulling the latest changes from branch: " + branch);
    }
}
