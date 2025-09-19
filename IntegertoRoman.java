class IntegertoRoman {
    public String intToRoman(int num) {
        String n=String.valueOf(num);
        char[] num1=n.toCharArray();
        int [] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String roman="";

        for(int i=0;i<value.length && num>0;i++)
        {
            while(num>=value[i])
            {
                num-=value[i];
                roman+=symbol[i];
            }

        }
        return roman;
        
    }
    public static void main(String[] args) {
        IntegertoRoman obj = new IntegertoRoman();
        System.out.println(obj.intToRoman(1994));
        System.out.println(obj.intToRoman(58));   
        System.out.println(obj.intToRoman(9));    
    }
}