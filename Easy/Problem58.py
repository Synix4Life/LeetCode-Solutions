"""
Runtime: 0ms -> Beats 100% of users with Python
Memory: 17.79MB -> Beats 60.68% of user with Python
"""

class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        ar = s.split()
        return len(ar[len(ar)-1])
