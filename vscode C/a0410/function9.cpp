#include <stdio.h>

// Function declaration
int sum(int x);

// The main method
int main() {
  int result = sum(10); // call the function
  printf(" %d\n", result);
  return 0;
}

// Function definition
int sum(int k) {
  if(k > 0){
    return k + sum(k - 1);
  } else {
    return 0;
  }
}