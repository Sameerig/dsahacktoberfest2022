# Linear Search in python

def linear_search(arr, element):
  for i in arr:
    if i == element:
      return true
  return false

print(linear_search([1,2,3,5,6], 5))
