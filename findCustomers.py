import pandas as pd

def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    reg_customers = orders["customerId"].unique()
    names = customers["name"].values
    id = customers["id"].values

    return pd.DataFrame([names[[j - 1 for j in id if id[j - 1] == i][0]] for i in id if i not in reg_customers], columns = ["Customers"])
