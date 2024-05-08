            switch (rank) {
                case 1:
                    ranks[i] = "Gold Medal";
                    break;
                case 2:
                    ranks[i] = "Silver Medal";
                    break;
                case 3:
                    ranks[i] = "Bronze Medal";
                    break;
            rank = n - rank;
        for (int i = 0; i < score.length; i++) {
            int rank = Arrays.binarySearch(sortedScore, score[i]);

        String[] ranks = new String[n];
        Arrays.sort(sortedScore);
                default:
                    ranks[i] = String.valueOf(rank);
            }
        }
        return ranks;
[
