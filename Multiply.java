class Solution {
    public String multiply(String num1, String num2) {
            int i;
        int k;
        char t;
        int p;
        long z;
        int s;
        int j=0;
        while(j<num1.length()+num2.length())
        {i=num2.length()-1;
         k=num1.length()-j-1;
         
      
            while(i>=0&&j<num1.length())
            {  if(k>=num1.length())
                   break;
                else
                           t=num1.charAt(k);
             
              
             s+=Integer.parseInt(num2.charAt(i--))*Integer.parseInt(t);
             s+=p;
             k++;
            }
         while(i>=0&&j>=num1.length())
            {
             
                if(k<0)
                    continue;
             else
                 t=num1.charAt(k);
             s+=num2[i--]*t;
             s+=p;
             k++;
            }
         z=z*10+s%10;
         p=s/10;
            j++;
        }
        String se=String.valueOf(z);
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(se);
 
        // reverse StringBuilder input1
        input1.reverse();
 
        // print reversed String
        return input1;
    }
}