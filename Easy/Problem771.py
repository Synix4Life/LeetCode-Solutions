"""
Runtime: 2ms -> Beats 12.28% of users with Python
Memory: 17.87MB -> Beats 32.71% of user with Python
"""

class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        return sum(stones.count(char) for char in jewels)
