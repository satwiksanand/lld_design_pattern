package designPattern.structural.facade.deploymentServiceExample.subSystems;

import designPattern.structural.facade.deploymentServiceExample.utils.CommonUtils;

public class DeploymentTarget {
    public void transferArtifact(String path, String server){
        System.out.println("deploying the application on server: " + server + " at path: " + path);
        CommonUtils.wait(500);
    }

    public void activateNewVersion(String server) {
        System.out.println("removing the last version.");
        CommonUtils.wait(100);
        System.out.println("installing the new version.");
    }
}
