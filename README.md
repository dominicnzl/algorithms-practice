# algorithms-practice

### Introduction
- to optimize an algorithm you need to make assumptions
- a slow performing algorithm is preferable to a fast one that doesn't work
- algorithms can have different best case and worst case performance times
- the worst-case is often the deciding factor

### String algorithms
- one way of searching for a specific letter is to search for it in lowercase and then in uppercase. An alternative is 
to convert the string to all lowercase and then search for it in lowercase form. This is called normalizing
- another option is to limit the input by validation

### Array algorithms
- binary search is a divide-and-conquer algorithm where in each step it halves the number of elements it has to go
through
- binary search requires a sorted collection, so if that assumption cannot be made it might be faster to search linearly

| Search type | assumptions | time complexity |
|------------|-------------|-----------------|
| Linear     | none        | O(n)            |
| Binary     | sorted      | O(log(n))       |

- aggregating valid contents from two arrays
  - merge arrays and then remove invalid items
  - check each element and only keep valid items
  - sort each array and only take valid items

### Linked List Algorithms
- no index
- each element has a node, which contains a piece of data and a reference to the next element
- first node often referred to as "head", last node called "tail"
- size of a linked list can vary over time
- one common strategy to find the middle of a linkedlist is to use two pointers, a fast and a slow one. The fast pointer
iterates twice as fast. When the fast pointer reaches the end of the linkedlist, the slow pointer should be at the middle
- changing the value of the next pointer of a given node to null will make the node become the last node in the linked
list
