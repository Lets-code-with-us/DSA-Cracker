class MedianFinder {
    PriorityQueue<Integer> lowerHalf;
    PriorityQueue<Integer> higherHalf;
    public MedianFinder(){
        lowerHalf=new PriorityQueue<>(Collections.reverseOrder());
        higherHalf=new PriorityQueue<>();
    }
    public void addNum(int num){
        lowerHalf.offer(num);
        higherHalf.offer(lowerHalf.poll());
        if (lowerHalf.size() < higherHalf.size()) {
            lowerHalf.offer(higherHalf.poll());
        }
    }
    public double findMedian() {
        if(lowerHalf.size() > higherHalf.size()) {
            return lowerHalf.peek();
        } 
        else{
          return (lowerHalf.peek()+higherHalf.peek()) / 2.0;
        }
    }
}
