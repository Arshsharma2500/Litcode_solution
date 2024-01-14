class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        Set<Character> w1 = new HashSet<>();
        Set<Character> w2 = new HashSet<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        char wo1[] = word1.toCharArray();
        char wo2[] = word2.toCharArray();
        Arrays.sort(wo1);
        Arrays.sort(wo2);
        
        for(int i=0;i<wo1.length;i++){
            w1.add(wo1[i]);
            w2.add(wo2[i]);
        }
        int count1 = 1,count2=1;
        int maxcount1 = 0,maxcount2 = 0;
        for(int i=0;i<wo1.length-1;i++){
           
            if(wo1[i]==wo1[i+1]){
                count1++;
            }
            else{
                l1.add(count1);
                maxcount1 = Math.max(count1,maxcount1);
                count1 = 1;
            }
            
        }
        int i=0,j=1;
        while(j<wo2.length && i<wo2.length){
            if(wo2[i]==wo2[j]){
                count2++;
                j++;
            }
            else{
               l2.add(count2);
                maxcount2 = Math.max(maxcount2,count2);
                count2=1;
                
                i=j;
                j++;
                
            }
        }
        
        maxcount1 = Math.max(count1,maxcount1);
        maxcount2 = Math.max(maxcount2,count2);
        l1.add(count1);
        l2.add(count2);
        Collections.sort(l1);
        Collections.sort(l2);
        
        System.out.print(w1+" ");
        System.out.println("");
        System.out.print(w2+" ");
        if(w1.equals(w2)){
            if(maxcount1==maxcount2)
                if(l1.equals(l2)){
                    return true;
                }
            
        }

        return false;
        
    }
}