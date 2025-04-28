package design_patterns.strategy;

public class MergeSort implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting using merge sort");
    }
}
