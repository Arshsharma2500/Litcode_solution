class Solution {
    public int minSteps(String s, String t) {
        char sc[] = s.toCharArray();
        char tc[] = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);
        int n = sc.length;
        int i=0,count=0;
        int j=0;
        while(i<n && j<n){
            if(tc[j]==sc[i]){       //a a a c d e o t 
                                    //a c c e i p r t 
                count++;
                j++;
                i++;
            }
            else if(tc[j]<sc[i]){
                j++;
            }
            else if(tc[j]>sc[i]){
                i++;
            }

        }

        return n-count;
    }
}