# CMP 269: Programming Methods III
# In-Class Assignment: File I/O and API Integration

import requests
import json
import os

"""
INSTRUCTIONS:
Complete the following 5 tasks. Each task builds on the concepts
of context managers (with statement), JSON parsing, and API communication.
"""

def task_1_append_logger():
    """
    TASK 1: The Persistent Logger
    Goal: Use the 'append' mode to add timestamps to a file.
    Instructions:
    1. Open a file named 'session_log.txt' in append mode ('a').
    2. Prompt the user for a short note.
    3. Write that note to the file on a new line.
    4. Read the entire file and print it to show the history.
    """
    print("--- Task 1: Append Logger ---")
    note = input("Enter a note for the log: ")
    # TODO: Implement append logic
    try:
        with open('session_log.txt', 'a') as file:
            file.write(note + "\n")
    except FileNotFoundError:
        print("File not found.")
    except PermissionError:
        print("Permission denied: Unable to append to file.")
    try:
        with open('session_log.txt', 'r') as file:
            print(file.read())
    except FileNotFoundError:
        print("File not found.")
    except PermissionError:
        print("Permission denied: Unable to read file.")



def task_2_word_count_utility():
    """
    TASK 2: The File Analyzer
    Goal: Read a file and perform basic data analysis.
    Instructions:
    1. Create a file 'lehman_motto.txt' with the text:
       "Knowledge is Power. Go Lightning! Python makes data easy."
    2. Read the file and count how many words are in it.
    3. Print the word count.
    """
    print("\n--- Task 2: Word Count Utility ---")
    # TODO: Implement file reading and word counting
    try:
        with open('lehman_motto.txt', 'r') as file:
            words = file.read()
            arr = words.split()
            print(len(arr)) # expected 9
    except FileNotFoundError:
        print("File not found.")
    except PermissionError:
        print("Permission denied: Unable to read file.")




def task_3_api_status_checker():
    """
    TASK 3: API Resilience
    Goal: Handle different HTTP status codes.
    Instructions:
    1. Attempt to fetch data from: https://jsonplaceholder.typicode.com/posts/101
    2. (Note: This ID might not exist or return a specific status).
    3. If status is 200, print the data.
    4. If status is 404, print "Error: Post not found."
    5. Use a try-except block to catch network timeout errors.
    """
    print("\n--- Task 3: API Status Checker ---")
    # TODO: Implement API request with status code logic
    try:
        response = requests.get('https://jsonplaceholder.typicode.com/posts/101', timeout=5)
        if response.status_code == 200:
            print(response.json())
        else:
            print("Error: Post not found.")
    except requests.exceptions.Timeout:
        print("Error: The request timed out.")


def task_4_data_filtering():
    """
    TASK 4: JSON Data Processing
    Goal: Filter specific info from a JSON response.
    Instructions:
    1. Fetch a list of users from: https://jsonplaceholder.typicode.com/users
    2. Loop through the users and print only the names of users
       who live in a suite (check if 'suite' in the address contains "Suite").
    """
    print("\n--- Task 4: Data Filtering ---")
    # TODO: Fetch users and filter by address suite
    response = requests.get('https://jsonplaceholder.typicode.com/users')
    if response.status_code == 200:
        data = response.json()
        for person in data:
            address = person.get('address')
            suites = address.get('suite')
            if "Suite" in suites:
                print(person['name'])
    else:
        print(f"Failed to fetch data. Status code: {response.status_code}")


def task_5_integration_report():
    """
    TASK 5: The Integration Challenge
    Goal: Fetch API data and save it to a local file.
    Instructions:
    1. Fetch data from: https://jsonplaceholder.typicode.com/posts/1
    2. Extract the 'title' and 'body'.
    3. Save this information into a file named 'api_report.txt' in a
       clean, readable format.
    4. Print "Report Generated" once finished.
    """
    print("\n--- Task 5: Integration Report ---")
    # TODO: Combine API fetch and File Write
    response = requests.get('https://jsonplaceholder.typicode.com/posts/1')
    if response.status_code == 200:
        data = response.json()
        info = f"Title:\n{data['title']}\n\nBody:\n{data['body']}"
    else:
        print(f"Failed to fetch data. Status code: {response.status_code}")
    try:
        with open('api_report.txt', 'w') as file:
            file.write(info)
    except FileNotFoundError:
        print("File not found.")
    print("Report generated")




if __name__ == "__main__":
    # You can uncomment these as you complete them to test your code
    task_1_append_logger()
    task_2_word_count_utility()
    task_3_api_status_checker()
    task_4_data_filtering()
    task_5_integration_report()
