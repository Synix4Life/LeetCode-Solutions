"""
Runtime: 0ms -> Beats 100% of users with Python
Memory: 17.69MB -> Beats 89.52% of user with Python
"""

class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        word1 = ''.join(sub1 for sub1 in word1)
        word2 = ''.join(sub2 for sub2 in word2)
        return word1 == word2
