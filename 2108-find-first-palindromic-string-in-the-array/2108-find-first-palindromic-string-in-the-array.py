class Solution(object):
    def firstPalindrome(self, words):
        for c in words:
            if c==c[::-1]:
                return c
        return ""