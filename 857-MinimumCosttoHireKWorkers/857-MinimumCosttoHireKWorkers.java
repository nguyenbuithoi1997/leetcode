        return minCost;
    }

    // Helper class to store the ratio and quality and implement comparable for
    // sorting
    private class Worker implements Comparable<Worker> {
        double ratio;
        int quality;

        Worker(double ratio, int quality) {
            this.ratio = ratio;
            this.quality = quality;
        }

        @Override
        public int compareTo(Worker other) {
            return Double.compare(this.ratio, other.ratio);
        }
    }
}
[10,20,5]
