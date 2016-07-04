public class Solution {
    public String intToRoman(int num) {
        StringBuilder ret = new StringBuilder();
        int digit, base = 1000;
        char[]roman = {'I','V','X','L','C','D','M'};
        for (int i = roman.length + 1; i >=0 && num > 0; i-=2,base/=10){
            digit = num / base;
            if (digit == 0){
                continue;
            }else if（digit < 4){
                for (int j = 0; j < digit; j++){
                ret.append(roman[i-2]);
                }
            }else if （digit == 4){
                ret.append(roman[i-2]);
                ret.append(roman[i-1]);
            }else if (digit < 9){
                ret.append(roman[i-1]);
                for (int j = digit - 5; j > 0;j--){
                    ret.append(roman[i-2]);
                }
            }else if (digit == 9){
            ret.append(roman[i-2]);
            ret.append(roman[i]);
            }
            num = num % base;
    }
    return ret;
}
}