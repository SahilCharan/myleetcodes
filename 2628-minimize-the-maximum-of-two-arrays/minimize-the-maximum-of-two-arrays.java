class Solution {
    static public long gcd(int a, int b) { return b==0 ? a : gcd(b, a%b); }
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        long gcd=gcd(divisor1,divisor2), lcm=(long)divisor1*(long)divisor2/gcd;
        long divisible1=lcm/divisor1, divisible2=lcm/divisor2;
        long nondivisibleCommon = lcm - divisible1 - divisible2 + 1;
        long batches = (uniqueCnt1+uniqueCnt2)/(lcm-1), remainder = (uniqueCnt1+uniqueCnt2)%(lcm-1);
        long nondiv1=(divisible2-1)*batches, nondiv2=(divisible1-1)*batches, common=nondivisibleCommon*batches;
        nondiv1 += remainder/divisor2;
        nondiv2 += remainder/divisor1;
        common += (remainder-remainder/divisor1-remainder/divisor2);
        long answer = batches * lcm + remainder;
        if (nondiv1<=uniqueCnt1 && nondiv2<=uniqueCnt2) {
            return remainder==0 ? (int)answer - 1 : (int) answer;
        } else {
            long nondiv = nondiv1 >= uniqueCnt1 ? nondiv2 : nondiv1;
            long cnt = nondiv1 >= uniqueCnt1 ? uniqueCnt2 : uniqueCnt1;
            long divisor = nondiv1 >= uniqueCnt1 ? divisor2 : divisor1;
            long remain = cnt - nondiv - common;
            answer += remain/(divisor-1)*divisor;
            remain %= divisor-1;
            if (remain==0) {
                return  answer%divisor==0 ? (int)answer-1: (int)answer;
            } else if (answer%divisor + remain >= divisor) {
                return (int)answer + (int)remain + 1;
            } else {
                return (int)answer + (int)remain;
            }
        }
    }
}