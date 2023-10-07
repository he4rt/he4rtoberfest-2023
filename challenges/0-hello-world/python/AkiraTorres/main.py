import sys

str = "World"
if len(sys.argv) > 1:
    str = sys.argv[1]
print(f"Hello {str}!")