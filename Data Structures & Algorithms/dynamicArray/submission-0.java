class DynamicArray {
    int length;
    int[] arr;
    int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        if(capacity > 0){
            this.arr = new int[capacity];
        }
        this.length =0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        if(i >= 0){
            arr[i] = n;
            return;
        }
    }

    public void pushback(int n) {
        if(length == capacity){
            this.resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
        length--;
        return arr[length];
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];

        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        arr=newArr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
