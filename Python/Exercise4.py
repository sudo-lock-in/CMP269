# CMP 269: Programming Methods III
# In-Class Assignment: Pandas Series and DataFrames

import pandas as pd

"""
INSTRUCTIONS:
Complete the following 4 tasks using the pandas library.
Run your script frequently to see how the DataFrames look in the console!
"""

def task_1_series_creation():
    """
    TASK 1: Create a Series
    1. Create a dictionary mapping 4 Lehman building names to their floor counts.
       (e.g., "Gillet": 4, "Carman": 3, "Music": 3, "Library": 4)
    2. Convert this dictionary into a Pandas Series.
    3. Print the Series.
    """
    print("--- Task 1: Building Series ---")
    # TODO: Implement Series creation
    buildings = {
        "Gillet": 4,
        "Carman": 3,
        "Music": 3,
        "Library": 4
    }
    building_series = pd.series(buildings)
    print(building_series)



def task_2_dataframe_creation():
    """
    TASK 2: Create a DataFrame
    1. Create a dictionary of lists containing data for at least 3 courses:
       - 'CourseCode': ['CMP168', 'CMP269', 'CMP338']
       - 'Credits': [4, 4, 4]
       - 'Enrolled': [25, 30, 20]
    2. Convert this into a Pandas DataFrame.
    3. Print the DataFrame.
    """
    print("\n--- Task 2: Course DataFrame ---")
    # TODO: Implement DataFrame creation
    pass


def task_3_data_manipulation():
    """
    TASK 3: Filtering and Math
    1. Using the same data from Task 2, create the DataFrame here again.
    2. Filter the DataFrame to only show courses with more than 20 students enrolled.
    3. Calculate and print the total number of students across ALL courses (use the .sum() method).
    """
    print("\n--- Task 3: Filtering and Math ---")
    # TODO: Implement filtering and sum
    pass


def task_4_csv_integration():
    """
    TASK 4: The Pandas CSV Advantage
    1. Create a simple DataFrame representing stock data (Symbols and Prices).
    2. Use df.to_csv('stocks.csv', index=False) to save it.
    3. Use pd.read_csv('stocks.csv') to read it back into a new variable called df_loaded.
    4. Print df_loaded to prove it worked!
    """
    print("\n--- Task 4: Easy CSV I/O ---")
    # TODO: Implement DataFrame to CSV saving and reading
    pass


if __name__ == "__main__":
    # Uncomment these as you work through the assignment
    task_1_series_creation()
    # task_2_dataframe_creation()
    # task_3_data_manipulation()
    # task_4_csv_integration()
