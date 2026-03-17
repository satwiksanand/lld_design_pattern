package designPattern.structural.facade.deploymentServiceExample.client;

import designPattern.structural.facade.deploymentServiceExample.facade.DeploymentFacade;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        String branch;
        String server;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the branch name: ");
        branch = scanner.nextLine();
        System.out.println("Enter the server name: ");
        server = scanner.nextLine();

        DeploymentFacade.deployApplication(branch, server);
    }
}