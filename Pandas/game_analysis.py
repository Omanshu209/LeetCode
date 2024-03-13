import pandas as pd

def game_analysis(activity: pd.DataFrame) -> pd.DataFrame:
    np_arr = activity.values
    first_login = {}

    for row in np_arr:
        p_id = row[0]
        date = row[2]

        if p_id not in first_login:
            first_login[p_id] = date
            continue

        first_login[p_id] =date if date < first_login[p_id] else first_login[p_id]
    
    return pd.DataFrame(
        zip(first_login.keys(), first_login.values()), 
        columns = ["player_id", "first_login"]
    )
