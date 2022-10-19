class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
            if(hand.length%groupSize  !=0)
        return false;
HashMap<Integer,Integer> hm=new HashMap();        for(int i:hand){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        Arrays.sort(hand);
        for (int card : hand) {
            if (hm.get(card) <= 0) continue;
            for (int i = 1; i <groupSize; i++) {
                int count = hm.getOrDefault(card + i, 0);
                if (count > 0) hm.put(card + i, count - 1); else return false;
            }
            hm.put(card, hm.get(card) - 1);
        }

        return true;

    }
}