class Solution {
public:
    bool isHappy(int n) {
        do{
            int sum = 0;
            while(n > 0){
                int r = n % 10;
                sum += r*r;
                n /= 10;
            }
            n = sum;
        }while(n > 9);
        return (n == 1 || n == 7) ? true : false;
    }
};
