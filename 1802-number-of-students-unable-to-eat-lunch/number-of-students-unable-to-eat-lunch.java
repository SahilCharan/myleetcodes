class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sand= new Stack<>();
        Queue<Integer> stud= new LinkedList<>();
        int i=0;
        int j=students.length-1;
        while(i<students.length){
            sand.push(sandwiches[j]);
            stud.add(students[i]);
            i++;
            j--;
        }
        while(!stud.isEmpty()){
            if(stud.peek()==sand.peek()){
                stud.remove();
                sand.pop();
            }
            else{
                if(stud.contains(sand.peek())){
                    stud.add(stud.remove());
                }
                else{
                    break;
                }
                
            }
        }
        return stud.size();
    }
}