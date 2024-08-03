class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        String components[] =  path.split("/");
        for(String s : components)
        {
            if(s.equals("")|| s.equals(".")) // skip empty components and "."
            continue;
            else if(s.equals("..")) // if current part of the string is ".." then pop the current component
            {
                if(!stk.isEmpty())
                stk.pop();
            }else{ // ydi dono nhi hai to stack mein push kr do.
                stk.push(s);
            }

        }
        // ab banano string ko
        StringBuilder sb = new StringBuilder();
        for(String curr : stk){
            sb.append("/").append(curr);
        }

        return sb.length()>0? sb.toString() : "/";
    }
}