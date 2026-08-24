class Solution(object):
    def containsDuplicate(self, nums):
        dup=set()
        for i in nums:
            if i in dup:
                return True
            dup.add(i)
        return False
        