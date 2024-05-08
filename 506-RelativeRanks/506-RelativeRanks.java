        }
            }
        return ranks;
    }
}
        for (int i = 0; i < score.length; i++) {
            int rank = Arrays.binarySearch(sortedScore, score[i]);
            rank = n - rank;
            if (rank == 1) {
                ranks[i] = "Gold Medal";
            } else if (rank == 2) {
                ranks[i] = "Silver Medal";
            } else if (rank == 3) {
                ranks[i] = "Bronze Medal";
            } else {
                ranks[i] = String.valueOf(rank);

[
