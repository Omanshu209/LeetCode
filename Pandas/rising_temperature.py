import pandas as pd
from datetime import timedelta

def rising_temperature(weather: pd.DataFrame) -> pd.DataFrame:
    weather.recordDate = pd.to_datetime(weather.recordDate)
    weather = weather.sort_values(by = "recordDate", ascending = True)

    data = []
    numpy_arr = weather.values
    for i, row in enumerate(numpy_arr):
        if i == 0:
            continue
        if row[2] > numpy_arr[i - 1][2] and numpy_arr[i - 1][1] + timedelta(days = 1) == row[1]:
            data.append(row[0])
    
    return pd.DataFrame(data, columns = ["id"])
