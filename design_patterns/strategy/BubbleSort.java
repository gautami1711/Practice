package design_patterns.strategy;

public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("sorting using Bubble sort");
    }
}
