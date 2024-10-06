"""
Runtime: 441ms -> Beats 16.43% of users with Python
Memory: 69.33MB -> Beats 18.08% of user with Python
"""

import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    return [players.shape[0], players.shape[1]]
