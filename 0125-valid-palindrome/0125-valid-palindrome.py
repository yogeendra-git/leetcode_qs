class Solution(object):
    def isPalindrome(self, s):
        char=[]
        for ch in s:
            if ch.isalnum():
                char.append(ch)
        res=''.join(char).lower()
        return res==res[::-1]
        