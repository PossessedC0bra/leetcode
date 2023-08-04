package _0871_minimum_number_of_refueling_stops;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        int pos = startFuel;
        int refuels = 0;
        int stationIdx = 0;
        while (pos < target) {
            while (stationIdx < stations.length && stations[stationIdx][0] <= pos) {
                queue.offer(stations[stationIdx++]);
            }

            if (queue.isEmpty()) {
                return -1;
            }

            pos += queue.poll()[1];
            refuels++;
        }

        return refuels;
    }
}
