"""
Runtime: 365ms -> Beats 41.97% of users with Python
Memory: 68.89MB -> Beats 17.83% of user with Python
"""

import pandas as pd

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    frame = pd.DataFrame(student_data, columns=["student_id", "age"])
    return frame
