"""
Runtime: 0ms -> Beats 100% of users with Python
Memory: 19.19MB -> Beats 96.75% of user with Python
"""

# Note : Highly optimized version

class Solution:
    def strongPasswordCheckerII(self, password: str) -> bool:
        if len(password) < 8:
            return False

        specials = set("!@#$%^&*()-+")

        has_lower = has_upper = has_digit = has_special = False
        pred = None

        for c in password:
            if c == pred:
                return False
            pred = c

            if not has_lower and c.islower():
                has_lower = True
            elif not has_upper and c.isupper():
                has_upper = True
            elif not has_digit and c.isdigit():
                has_digit = True
            elif not has_special and c in specials:
                has_special = True

        return has_lower and has_upper and has_digit and has_special