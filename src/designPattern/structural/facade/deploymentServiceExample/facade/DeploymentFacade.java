package designPattern.structural.facade.deploymentServiceExample.facade;

import designPattern.structural.facade.deploymentServiceExample.subSystems.BuildSystem;
import designPattern.structural.facade.deploymentServiceExample.subSystems.DeploymentTarget;
import designPattern.structural.facade.deploymentServiceExample.subSystems.TestingFramework;
import designPattern.structural.facade.deploymentServiceExample.subSystems.VersionControlSystem;

public class DeploymentFacade {
    private static final BuildSystem buildSystem = new BuildSystem();
    private static final DeploymentTarget deploymentTarget = new DeploymentTarget();
    private static final TestingFramework testingFramework = new TestingFramework();
    private static final VersionControlSystem versionControlSystem = new VersionControlSystem();

    public static void deployApplication(String branch, String server) {
        System.out.println("initializing the deployment process.");
        versionControlSystem.pullLatestChanges(branch);
        buildSystem.compileProject();
        testingFramework.runUnitTest();
        testingFramework.runIntegrationTest();
        deploymentTarget.activateNewVersion(server);
        System.out.println("completing deployment!");
    }
}
