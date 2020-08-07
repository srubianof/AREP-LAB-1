package edu.escuelaing.arem.ASE.app;

public class Calculator {

    public double calculateMean(LinkedList linkedList) {
        double mean = 0;
        double sum = 0;
        int quantity = 0;
        Node actualNode = linkedList.getHead();

        while (actualNode != null) {
            sum += actualNode.getData();
            quantity += 1;
            actualNode = actualNode.getNext();
        }
        mean = (double) Math.round((sum / quantity) * 100) / 100;
        return mean;
    }

    public double calculateStantardDeviation(LinkedList linkedList) {
        double mean = calculateMean(linkedList);
//        System.out.println(mean);
        double sum = 0;
        int quantity = 0;
        double sd = 0;
        Node actualNode = linkedList.getHead();

        while (actualNode != null) {
            sum += Math.pow((actualNode.getData() - mean), 2);
            actualNode = actualNode.getNext();
            quantity += 1;
        }
        sd = (double) Math.round(Math.sqrt(sum / (quantity - 1)) * 100) / 100;

        return sd;
    }
}
