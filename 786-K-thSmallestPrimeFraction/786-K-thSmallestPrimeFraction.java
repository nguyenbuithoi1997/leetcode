            while(j<n && arr[i]>arr[j]*mid)
            {
                j++;
            }

            if(j==n) break;

            total += (n-j);

            double fraction = (double)arr[i]/arr[j];
            if(fraction > maxLessThanMid)
            {
                maxLessThanMid = fraction;
                x = i;
                y = j;
            }
        }
        return new int[]{total, x ,y};
    }
}
[1,2,3,5]
