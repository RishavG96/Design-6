class PhoneDirectory {

    HashSet<Integer> set;
    Queue<Integer> q;
    public PhoneDirectory(int maxNumbers) {
        q = new LinkedList<>();
        set = new HashSet<>();
        for(int i = 0; i < maxNumbers; i++) {
            q.add(i);
            set.add(i);
        }
    }
    
    public int get() {
        if(q.isEmpty()) {
            return -1;
        }
        int number = q.poll();
        set.remove(number);
        return number;
    }
    
    public boolean check(int number) {
        if(!q.isEmpty()) {
            return set.contains(number);
        } else {
            return false;
        }
    }
    
    public void release(int number) {
        if(!set.contains(number)) {
            q.add(number);
            set.add(number);
        }
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */
