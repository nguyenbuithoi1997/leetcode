        if (low == high) 
            return;
        
        int left = low - 1, right = high + 1, mid = low + high >> 1;
        int x = nums[mid];
        while (left < right) {
            while (nums[++left] < x) continue;
            while (nums[--right] > x) continue;
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        } 
        
        if (right < k) 
            quickSort(nums, right + 1, high, k);
        else
            quickSort(nums, low, right, k);
    }   

[1,2,3]
