def remove_duplicates(arr):
    # sort array
    arr.sort()
    # make new array list
    unique_arr = []
    # make a second new array list
    removed_elements = []
    # Loop through array
    for i in range(arr.length()):
        # If any element is not equal to any other add to unique_arr
        if i == 0 or arr[i] != arr[i-1]:
            unique_arr.append(arr[i])
        # Else add to removed_elements
        else:
            removed_elements.append(arr[i])
    return unique_arr, removed_elements

# Test the function
arr = [1, 2, 2, 3, 4, 4, 5]
# Sets unique_arr and removed_elements to the returns from remove_duplicates with the array given
unique_arr, removed_elements = remove_duplicates(arr)
print("Original array:", arr)
print("Unique array:", unique_arr)
print("Removed elements:", removed_elements)
