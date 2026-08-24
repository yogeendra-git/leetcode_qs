class Solution(object):
    def findTheDifference(self, s, t):
        res=0
        for char in s+t:
            res^=ord(char)
        return chr(res)
        