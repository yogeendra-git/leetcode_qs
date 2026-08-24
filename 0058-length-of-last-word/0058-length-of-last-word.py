class Solution(object):
    def lengthOfLastWord(self, s):
        word=s.strip().split()
        return len(word[-1])
