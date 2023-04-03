package my.task.hw7.Task4;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

   private final List<Flower> flowers;

    public Bouquet() {
        flowers = new ArrayList<>();
    }

    public void addFlowersInBouquet(Flower flower) {
        flowers.add(flower);
    }

    public void printNameOfFlowers() {
        for (Flower flower : flowers) {
            System.out.print(flower.getName() + " ");
        }
    }

    public void printColorOfFlowers() {
        for (Flower flower : flowers) {
            System.out.print(flower.getColor() + " ");
        }
    }

    public void printPriceOfBouquet() {
        int priceOfAllFlowers = 0;
        for (Flower flower : flowers) {
            priceOfAllFlowers += flower.getPrice();
        }
        System.out.print(priceOfAllFlowers);
    }

    public void printLifeTimeOfBouquet() {
        int lifTimeOfAllFlowers = 0;
        for (Flower flower : flowers) {
            lifTimeOfAllFlowers += flower.getlifetimeInHours();
        }
        System.out.print(lifTimeOfAllFlowers);
    }
}
