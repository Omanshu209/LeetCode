# Solution 1

import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    return students[students.student_id == 101].drop(
        "student_id", 
        axis = "columns"
    )

# Solution 2 

import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    data = []
    np_arr = students.values

    for row in np_arr:
        if row[0] == 101:
            data.append([row[1], row[2]])
    
    return pd.DataFrame(
        data, 
        columns = students.columns[1:]
    )
