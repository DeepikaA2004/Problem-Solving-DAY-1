def simpleArraySum(ar):
    # Initialize a variable to store the sum
    total = 0
    
    # Iterate through the elements of the array and add them to the total
    for num in ar:
        total += num
    
    return total

# Read the size of the array from input
n = int(input().strip())

# Read the array elements from input and split them into a list of integers
ar = list(map(int, input().strip().split()))

# Call the simpleArraySum function and print the result
result = simpleArraySum(ar)
print(result)
