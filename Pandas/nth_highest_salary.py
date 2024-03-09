# Solution 1

import pandas as pd

def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
    salary_sorted = employee.salary.sort_values(ascending = False)
    salary_sorted.drop_duplicates(inplace = True)

    if len(salary_sorted) < N or N <= 0:
        return pd.DataFrame(
            [None], 
            columns = [f"getNthHighestSalary({N})"]
        )
    
    return pd.DataFrame(
        [salary_sorted.iloc[N - 1]], 
        columns = [f"getNthHighestSalary({N})"]
    )

# Solution 2

import pandas as pd

def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
    salary_sorted = employee.salary.sort_values(ascending = False)
    salary_sorted.drop_duplicates(inplace = True)

    val = None
    if not (len(salary_sorted) < N or N <= 0):
        val = salary_sorted.iloc[N - 1]

    return pd.DataFrame(
        [val], 
        columns = [f"getNthHighestSalary({N})"]
    )
