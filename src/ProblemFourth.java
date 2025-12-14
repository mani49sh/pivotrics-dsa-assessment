import java.util.*;

// Problem 4: Last Stone Weight

class ProblemFourth {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        while (maxHeap.size() > 1) {
            int first = maxHeap.poll();
            int second = maxHeap.poll();

            if (first != second) {
                maxHeap.offer(first - second);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stones: ");
        int n = sc.nextInt();
        int[] stones = new int[n];

        System.out.println("Enter the stone weights:");
        for (int i = 0; i < n; i++) {
            stones[i] = sc.nextInt();
        }

        int result = lastStoneWeight(stones);
        System.out.println("Output: " + result);
        sc.close();
    }
}