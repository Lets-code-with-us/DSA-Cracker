## Intution 

* created two vector to store the product
  * one vector store the product from start 
  * second vector store the product from the end
* created another vector to store the result
* run for loop 
  * if the element at index 0 :- result[i] = endproduct[i+1];
  * else if the element at postion n-1 :- result[i] =startproduct[i-1];
  * esle result[i] = startproduct[i-1] * endproduct[i+1];
* return the result vector;