"""
Runtime: 427ms -> Beats 12.09% of users with Python
Memory: 16.54MB -> Beats 72.69% of user with Python
"""

class Solution:
    def countSubstrings(self, s: str) -> int:
        result = 0
        for pointer in range(0, len(s)):
            for subpointer in range(pointer + 1, len(s) + 1):
                if s[pointer:subpointer] == s[pointer:subpointer][::-1]:
                    result += 1
        return result