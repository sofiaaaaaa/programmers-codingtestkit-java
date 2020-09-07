package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * 하드디스크는 한 번에 하나의 작업만 수행할 수 있습니다. 디스크 컨트롤러를 구현하는 방법은 여러 가지가 있습니다. 가장 일반적인 방법은 요청이 들어온 순서대로 처리하는 것입니다.
 * */
public class Heap2 {
    public int solution(int[][] jobs) {
        int answer = 0;

        PriorityQueue<Disk> sortWithIndex = new PriorityQueue<>();
        PriorityQueue<Disk> priorityQueue2 = new PriorityQueue<>(this::compareToDelay);
        List<Disk> answers = new ArrayList<>();
        for (int[] job : jobs) {
            sortWithIndex.add(new Disk(job[0], job[1]));
        }

        int time = 0;

        while (!sortWithIndex.isEmpty()) {
            while (!sortWithIndex.isEmpty() && sortWithIndex.peek().index <= time) {
                priorityQueue2.add(sortWithIndex.poll());
            }

            if (!priorityQueue2.isEmpty()) {
                Disk andDisk = priorityQueue2.poll();
                answers.add(andDisk);
                time += andDisk.delayTime;

                answer += time - andDisk.index;
                for (Disk disk : priorityQueue2) {
                    sortWithIndex.add(disk);
                }
                priorityQueue2.clear();
            } else {
                time ++;
            }

        }
        int b = (int) Math.floor((answer / jobs.length));

        return b;

    }

    public int compareToDelay(Disk o1, Disk o2) {
        if (o1.delayTime > o2.delayTime) {
            return 1;
        } else if (o1.delayTime < o2.delayTime) {
            return -1;
        } else {
            return 0;
        }

    }

    class Disk implements Comparable<Disk> {
        private int index;
        private int delayTime;

        public Disk(int index, int delayTime) {
            this.index = index;
            this.delayTime = delayTime;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Disk disk = (Disk) o;
            return index == disk.index &&
                    delayTime == disk.delayTime;
        }

        @Override
        public int hashCode() {
            return Objects.hash(index, delayTime);
        }

        @Override
        public int compareTo(Disk o) {
            if (this.index > o.index) {
                return 1;
            } else if (this.index < o.index) {
                return -1;
            } else {
                return 0;
            }
        }

        @Override
        public String toString() {
            return "Disk{" +
                    "index=" + index +
                    ", delayTime=" + delayTime +
                    '}';
        }
    }

}

