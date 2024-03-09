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
