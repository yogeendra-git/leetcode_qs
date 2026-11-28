class Solution(object):
    def heightChecker(self, heights):
        count=0
        x=list(heights)
        x.sort()
        for i in range(len(x)):
            if heights[i]!=x[i]:
                count+=1
        return count
        