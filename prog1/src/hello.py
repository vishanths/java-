import pandas as pd
data = {"name": ["alice", "bob", "charlie", "david"],
        "age": [25, 30, 31, 32],
        "city": ["newyork", "san fransicso", "chaicago", "los angles"]}
df = pd.DataFrame(data)

# COLUMN SELECTION
selected_column = df[['name', 'age']]
print("selected column=\n", selected_column)

# COLUMN ADDITION
print("column addition\n")
df['salary'] = [50000, 60000, 70000, 75000]
print("data after adding is\n:", df)

# COLUMN DELETION
df.drop("city", axis=1, inplace=True)
print("\n data after deleting is\n:", df)

# ROW SELECTION
selected_row = df.loc[1]
print("selected row is=", selected_row)

# ROW ADDITION
new_row = pd.Series(['eva', 28, 'miami'], index=['name', 'age', 'city'])
df = df.append(new_row, ignore_index=True)
print("\n data frame after adding=", df)

# ROW DELETION
df.drop(2, inplace=True)
print("\n data frame after deletion=", df)
