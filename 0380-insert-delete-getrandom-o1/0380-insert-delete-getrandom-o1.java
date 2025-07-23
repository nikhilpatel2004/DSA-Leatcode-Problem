class RandomizedSet {

    List<Integer> list;
    Map<Integer , Integer> map;
    Random rand; // random class  hai java ka 
  // [10, 20,30 ,40]
    public RandomizedSet() {
       list = new ArrayList<>();
       map = new HashMap<>();
       rand = new Random();
        
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
           list.add(val);
           map.put(val , list.size()-1);
           return true;

        
        
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))return false;
        // remove  ex  = 20

        int idx = map.get(val);  // index of  value  index = 1
        int lstElement =  list.get(list.size()-1); // last element  = 40

        list.set(idx , lstElement);  //(1, 40)
        map.put(lstElement , idx);  // 40 , 1


        list.remove(list.size()-1);
        map.remove(val);
        return true;


        
    }
    
    public int getRandom() {
        int idx = rand.nextInt(list.size());
        return list.get(idx);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */