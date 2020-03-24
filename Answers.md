What is the complexity of each of the four search methods in terms of array or list size n?
    1. findTeamPositionArray: O(n) grows in a linear fashion and directly proportionate to the size of the array.
    2. findTeamPositionList: O(n) grows in a linear fashion and directly proportionate to the size of the array.
    3. findTeamMinFunding: O(n) grows in a linear fashion and directly proportionate to the size of the array.
    4. findTeamMinFundingFast: O(log n) because we are not searching through each element of the array; rather, we are dividing the number of elements by 2 each time we search until it is no longer possible. The growth peaks at the beginning and flattens out as the size of the data set grows.

What happens in the case of binary search if the array is not sorted?
    Binary search would not work; it works by dividing the number of elements in an array by 2 and comparing the "middle value". With an unsorted array, it would be difficult to determine which half of the array to search in.

What is the purpose of the constructor argument validity checking?
    Validity checking would make the program fail quickly and provide detailed exceptions and error messages. If invalid parameters are not caught in the constructor in the beginning, it can cause errors that are much more difficult to detect and debug later on.

What is the purpose of using keyword final with variables and arguments?
    If there is no reason to modify the variables, it is good practice to use the keyword final so that the compiler can more easily check for illegal assignments and throw exceptions and errors. In doing this, the programmer is stating that the variable should not be altered after its initial assignment.
    
What are alternatives to using Optional and how do they compare?
    Programmers typically use condition statements to verify whether or not a value is null. These checks for null are significant because if a program attempts to reference a value that is null, it will get a NullPointerException and cease to run.
    Optional allows the program to account for an absence of a value and create scenarios in which it would be okay for the value to be null or missing.
    Additionally, Optional clarifies the programmer's intent and may lessen the number of null values that may cause issues in the program later on.
    One disadvantage to using Optional could be that it had the potential to degrade performance when working with a large number of values.
    Instead of using Optional, one may return an int value and return -1 if the value is not present. However, this may cause issues with returning null or non-existent values.