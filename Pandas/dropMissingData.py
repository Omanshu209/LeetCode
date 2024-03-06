import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    students.dropna(subset = ["name"], axis = 0, inplace = True)
    return students
