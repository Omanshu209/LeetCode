import pandas as pd

def not_boring_movies(cinema: pd.DataFrame) -> pd.DataFrame:
    not_boring: list = []
    np_arr = cinema.values

    for row in np_arr:
        if row[0] % 2 != 0 and row[2] != "boring":
            not_boring.append(row)
    
    return pd.DataFrame(
        not_boring, 
        columns = cinema.columns
    ).sort_values(by = "rating", ascending = False)
