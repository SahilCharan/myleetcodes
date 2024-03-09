public class RandomizedSet {
    private List<Integer> arr;
    private Map<Integer, Integer> set;
    private int size;

    public RandomizedSet() {
        arr = new ArrayList<>();
        set = new HashMap<>();
        size = 0;
    }

    public boolean insert(int val) {
        if (set.containsKey(val) && set.get(val) != -1) {
            return false;
        }

        arr.add(val);
        set.put(val, size);
        size++;

        return true;
    }

    public boolean remove(int val) {
        if (set.containsKey(val) && set.get(val) != -1) {
            int index = set.get(val);

            // Swap with the last element
            int lastElement = arr.get(size - 1);
            arr.set(index, lastElement);
            set.put(lastElement, index);

            // Remove the last element
            arr.remove(size - 1);
            set.put(val, -1); // Mark as removed
            size--;

            return true;
        }

        return false;
    }

    public int getRandom() {
        int index = new Random().nextInt(size);
        return arr.get(index);
    }
}