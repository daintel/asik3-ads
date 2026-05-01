public class Experiment {

    private Sorter sorter;
    private Searcher searcher;

    public Experiment(Sorter sorter, Searcher searcher) {
        this.sorter = sorter;
        this.searcher = searcher;
    }


    public long measureSortTime(int[] arr, String type) {
        long start = System.nanoTime();

        if ("basic".equals(type)) {
            sorter.basicSort(arr);
        } else {
            sorter.advancedSort(arr);
        }

        long end = System.nanoTime();
        return end - start;
    }


    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();

        searcher.search(arr, target);

        long end = System.nanoTime();
        return end - start;
    }


    public void runAllExperiments() {

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {

            System.out.println("\n========================");
            System.out.println("Array size: " + size);
            System.out.println("========================");

            int[] randomArr = sorter.generateRandomArray(size);
            int[] sortedArr = sorter.generateSortedArray(size);


            int[] bubbleRandom = randomArr.clone();
            int[] mergeRandom = randomArr.clone();

            int[] bubbleSorted = sortedArr.clone();
            int[] mergeSorted = sortedArr.clone();


            long bubbleTimeRandom = measureSortTime(bubbleRandom, "basic");
            long mergeTimeRandom = measureSortTime(mergeRandom, "advanced");

            long bubbleTimeSorted = measureSortTime(bubbleSorted, "basic");
            long mergeTimeSorted = measureSortTime(mergeSorted, "advanced");


            int target = sortedArr[size / 2];

            long searchTimeRandom = measureSearchTime(randomArr, target);
            long searchTimeSorted = measureSearchTime(sortedArr, target);


            System.out.println("Random Array:");
            System.out.println("Bubble Sort: " + bubbleTimeRandom + " ns");
            System.out.println("Merge Sort : " + mergeTimeRandom + " ns");

            System.out.println("\nSorted Array:");
            System.out.println("Bubble Sort: " + bubbleTimeSorted + " ns");
            System.out.println("Merge Sort : " + mergeTimeSorted + " ns");

            System.out.println("\nSearch:");
            System.out.println("Random Array Search: " + searchTimeRandom + " ns");
            System.out.println("Sorted Array Search: " + searchTimeSorted + " ns");
        }
    }
}