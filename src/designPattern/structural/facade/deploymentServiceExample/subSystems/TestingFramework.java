package designPattern.structural.facade.deploymentServiceExample.subSystems;

import designPattern.structural.facade.deploymentServiceExample.utils.CommonUtils;

public class TestingFramework {
    public boolean runUnitTest() {
        System.out.println("running unit tests...");
        CommonUtils.wait(150);
        return true;
    }

    public boolean runIntegrationTest() {
        System.out.println("running integration tests...");
        CommonUtils.wait(200);
        return true;
    }
}
