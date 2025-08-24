# Last updated: 8/24/2025, 12:32:40 PM
class Solution:
    def reverse(self, x: int) -> int:
        sign = -1 if x < 0 else 1
        temp = abs(x)
        output = 0
        while temp > 0:
            output = (output * 10) + (temp % 10)
            temp = temp // 10
         
        if output < -2**31 or output > 2**31 - 1:
            return 0
        return sign * output