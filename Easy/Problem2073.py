"""
Runtime: 37ms -> Beats 86.96% of users with Python
Memory: 16.74MB -> Beats 15.10% of user with Python
"""

class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        count = 0

        for i in range(len(tickets)):
            if i <= k:
                count += min(tickets[k], tickets[i])
            else:
                count += min(tickets[k]-1, tickets[i])

        return count
