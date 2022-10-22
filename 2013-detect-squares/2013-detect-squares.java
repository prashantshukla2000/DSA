class DetectSquares {
List<int []> coordinates;
    HashMap<String,Integer> map;
    public DetectSquares() {
        coordinates=new ArrayList<>();
        map=new  HashMap<String,Integer>();
    }
    
    public void add(int[] point) {
        String key=point[0]+"-"+point[1];
            map.put(key,map.getOrDefault(key,0)+1);
            coordinates.add(point);
        }
    
    
    public int count(int[] point) {
        int res=0;
        int px=point[0],py=point[1];
        for(int[] coord:coordinates){
            int x=coord[0];
            int y=coord[1];
            if(Math.abs(py-y)!=Math.abs(px-x)||x==px||y==py)
                continue;
            res+= map.getOrDefault(x + "-" + py, 0) * map.getOrDefault(px + "-" + y, 0);
        }
        return res;
    }
}

/**
 * Your DetectSquares object will be instantiated and called as such:
 * DetectSquares obj = new DetectSquares();
 * obj.add(point);
 * int param_2 = obj.count(point);
 */