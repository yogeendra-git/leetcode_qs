class Solution(object):
    def checkDivisibility(self, n):
        original=n
        sumd=0
        prod=1
        while n>0:
            digit =n%10
            sumd+=digit
            prod*=digit
            n=n//10
        c=sumd+prod
        if original % c==0:
            return True
        else:
            return False

        