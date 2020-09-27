package com.hackathon.socgen.unitTest;

import java.util.*;

class test {
    public static void main(String args[] ) {
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   HashMap mp = new HashMap<>();
   List l = new ArrayList();
   int result =0;
	for (int i = 0; i < str.length(); i++) {
		   for (int j = i+1; j <= str.length(); j++) {
    	 if(str.substring(i,j).length()>2)
         {
             char[] ch = str.substring(i,j).toCharArray();
             for(int k =0;k<ch.length;k++)
             {
                 if(mp.containsKey(ch[k]))
                 {
                     mp.put(ch[k], (int) mp.get(ch[k])+1);
                 }
                 else
                 {
                     mp.put(ch[k],1);
                 }
              }
              Iterator<Map.Entry<String,Integer>> it = mp.entrySet().iterator();
              while(it.hasNext())
              {
                  Map.Entry<String,Integer> mp1 = it.next();
                  l.add(mp1.getValue());
              }
              Collections.sort(l);
              int min = (int) l.get(0);
              int max = (int) l.get(l.size()-1);
              result = result +max -min;
              l.removeAll(l);
              mp.clear();

         }

         }  
      }
System.out.println(result);
    }
}
