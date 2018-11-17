public class Solution {
    
    /*
     * Complete the function below.
     */
    static String[] findNewPlayers(String[] lastWeek, String[] thisWeek) {
StringBuilder addNew = new StringBuilder("- new!");
        String[] newList = new String[thisWeek.length];
        for(int i=0;i<lastWeek.length;i++)
            for(int j=0; j<thisWeek.length;j++){
                if(thisWeek[i]==lastWeek[j]){
                    
                    thisWeek[i] = thisWeek[i]+"-new!";
                }
            }
        return thisWeek;
    }
    