class MedianFinder {
    // hum log do heaps ka use krenge jisme min heap will store the number in min value and max value will store in reverse order
    // 1,2,3,4,5,6
    //min heap = 1,2,3
    //maxheap = 4,5,6
    // meadian  -> even n0 ->6 there for (minHeap.poll()+maxHeap.poll())/2.0;   meadian mil jayega
     // 1,2,3,4,5
     // min heap = 1,2,3;
     // maxheap= 4,5;
     // in this situation, we will take the top element of the min heap. so output is 3.

     // meaning odd  numbers total then min heap ka top other wise min heap  top +maxheap top /2; will be the final result;

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if (minHeap.size() > maxHeap.size())
            maxHeap.offer(minHeap.poll());
    }
    
    public double findMedian() {
        if(maxHeap.size()>minHeap.size()) return maxHeap.peek();
        return (minHeap.peek()+maxHeap.peek())/2.0d;
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */