class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int j = 0;
        int i = 0;
        int result[] = new int[deck.length];
        // Queue<Integer> q = new LinkedList<>();
        boolean skip = false;
        while (i < deck.length) {
            if (result[j] == 0)
                
            {
                if (skip == false) {
                    result[j] = deck[i];
                    i++;
                }
                skip = !skip;

            }
            j = (j + 1) % deck.length;

        }
        return result;
    }
}