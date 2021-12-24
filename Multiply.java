class Solution {
    public String multiply(String num1, String num2) {
            int i;
        int k;
        char t;
        int p=0;
        long z=0;
        int s=0;
        int j=0;
        while(j<num1.length()+num2.length())
        {i=num2.length()-1;
         k=num1.length()-j-1;
         
      
            while(i>=0&&j<num1.length())
            {  if(k>=num1.length())
                   break;
                else
                           t=num1.charAt(k);
             
              
             s+=(num2.charAt(i--)-'0')*(t-'0');
             s+=p;
             k++;
            }
         while(i>=0&&j>=num1.length())
            {
             
                if(k<0)
                    continue;
             else
                 t=num1.charAt(k);
             s+=(num2.charAt(i--)-'0')*(t-'0');
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
        String singleString = input1.toString();
        return singleString;
    }
}
