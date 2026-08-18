class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<tickets.length; i++)
            queue.offer(i); //queue stores the corresponding index of a ticket value

        int time = 0;
        while(!queue.isEmpty()){
            int i = queue.poll(); 
            tickets[i]--;
            time++;
            if(tickets[i] == 0 && i==k)
                return time;

            if(tickets[i] > 0)
                queue.offer(i); //onli put tickets back into the list if there are tickets left
        }

        return time;
    }
}