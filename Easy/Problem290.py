"""
Runtime: 0ms -> Beats 100% of users with Python
Memory: 17.98MB -> Beats 15.05% of user with Python
"""

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(" ")
        if not len(s) == len(pattern):
            return False
        map_ = {}
        for i, element in enumerate(s):
            if pattern[i] in map_:
                if not map_[pattern[i]] == element:
                    return False
            elif element in map_.values():
                return False
            else:
                map_[pattern[i]] = element
        return True
