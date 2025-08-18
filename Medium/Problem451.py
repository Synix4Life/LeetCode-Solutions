"""
Runtime: 3ms -> Beats 97.70% of users with Python
Memory: 18.66MB -> Beats 99.42% of user with Python
"""

# Counter idea via ChatGPT

from collections import Counter

class Solution:
    def frequencySort(self, s: str) -> str:
        counts = Counter(s)
        return "".join(char * freq for char, freq in counts.most_common())
