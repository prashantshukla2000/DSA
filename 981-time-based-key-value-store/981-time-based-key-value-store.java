class TimeMap {
       HashMap<String ,List<Pair<String,Integer>>> hm;

    public TimeMap() {hm=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key)){
            hm.put(key,new ArrayList<>());
        }
hm.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
      if(!hm.containsKey(key)) return "";
        List<Pair<String ,Integer>> list=hm.get(key);
       return search(list,timestamp);
    }
    public String search( List<Pair<String ,Integer>> list, int timestamp){
        int l=0,r=list.size()-1;
        String res="";
        while(l<=r){
            int mid=(l+r)/2;
            if(list.get(mid).getValue() <= timestamp){
                res=list.get(mid).getKey();
               l=mid+1;
            }else
                r=mid-1;
        }
        return res;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */