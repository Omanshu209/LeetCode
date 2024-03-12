import pandas as pd

def big_countries(world: pd.DataFrame) -> pd.DataFrame:
    big_countries = []
    np_arr = world.values

    for row in np_arr:
        if row[2] >= 3000000 or row[3] >= 25000000:
            big_countries.append([row[0], row[3], row[2]])
    
    return pd.DataFrame(
        big_countries, 
        columns = [
            "name", 
            "population", 
            "area"
        ]
    )
