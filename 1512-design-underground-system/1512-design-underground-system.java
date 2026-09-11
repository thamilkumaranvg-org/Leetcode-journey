class UndergroundSystem {
    Map<Integer, Pair<String, Integer>> Arrivals; //key = id, values = pair(startStation, time)
    Map<String, Pair<Double, Integer>> Total;//key = startStation + endStation, values = pair(total, count)

    public UndergroundSystem() {                          
        Arrivals = new HashMap<>();//initialization
        Total = new HashMap<>();//initialization
    }
    
    public void checkIn(int id, String stationName, int t) {
        Arrivals.put(id, new Pair<>(stationName, t));//checkIns
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> checkIn = Arrivals.get(id);//getting the pair(startStation, time) using key = id
        Arrivals.remove(id); //removing unnecessary id after checkOuts
        String route = checkIn.getKey() + "-" + stationName;//startStation + endStation
        double total = t - checkIn.getValue();// destTime - initTime
        Pair<Double, Integer> totCount = Total.getOrDefault(route, new Pair<>(0.0, 0));//if not exit assumes Pair(0.0, 0)
        Total.put(route, new Pair((total + totCount.getKey()), (totCount.getValue()+ 1)));//updates TotalMap
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "-" + endStation;
        Pair<Double, Integer> totCount = Total.get(route);//gets Pair(total, count)
        return totCount.getKey() / totCount.getValue();//total / count
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */