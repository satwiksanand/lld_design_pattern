package designPattern.structural.facade.deploymentServiceExample.subSystems;

import designPattern.structural.facade.deploymentServiceExample.utils.CommonUtils;

public class BuildSystem {
    public boolean compileProject() {
        System.out.println("compiling project...");
        CommonUtils.wait(2000);
        System.out.println("build successful!");
        return true;
    }

    public String getArtifactPath() {
        System.out.println("fetching the artifact path...");
        CommonUtils.wait(200);
        return "~/.artifact/";
    }
}
