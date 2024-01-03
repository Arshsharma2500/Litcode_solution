class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int laserbeams = 1;
        int totalbeams = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int cell=0;cell<n;cell++){
            char c[] = bank[cell].toCharArray();
            int count=0;
            int flag = 0;
            for(int subcell=0;subcell<c.length;subcell++){
                if(c[subcell]=='1'){
                    count++;
                    flag = 1;
                }
                
            }
            if(flag == 0){
                continue;
            }
            else{
                arr.add(count);
            }


        }

        for(int i=0;i<arr.size()-1;i++){
            int mul = arr.get(i) * arr.get(i+1);
            totalbeams += mul;
        
        }
      return totalbeams;  
    }
}