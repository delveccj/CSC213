import os
from collections import defaultdict

# Define the root directory to start the search
root_dir = "."

# Use a defaultdict to store the counts
count = defaultdict(int)

# Iterate over all files in the directory tree
for dirpath, dirnames, filenames in os.walk(root_dir):
&nbsp; &nbsp; for filename in filenames:
&nbsp; &nbsp; &nbsp; &nbsp; # Check if the file has a ".java" extension
&nbsp; &nbsp; &nbsp; &nbsp; if filename.endswith(".java"):
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; # Keep a count of each file name
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; count[filename] += 1

# Iterate over the count dictionary and print the results
for filename, count in count.items():
&nbsp; &nbsp; print(f"{filename}: {count}")


