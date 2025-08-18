"""
Runtime: 5ms -> Beats 92.81% of users with Python
Memory: 17.94MB -> Beats 50.06% of user with Python
"""

from collections import Counter

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        counter_s = Counter(s)
        counter_t = Counter(t)
        for char in counter_s.keys() | counter_t.keys():
            if counter_s[char] != counter_t[char]:
                return False
        return True

