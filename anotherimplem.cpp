#include <iostream>
#include <stdlib.h>
#include <fstream>
#include<time.h>
using namespace std;

void change(int *a, int *b) {
  int temp;
  temp = *a;
  *a = *b;
  *b = temp;
}

void bsort(int a[], int size) {
  int i, j;
  for(i=0; i<size; i++) {
    for(j=0; j<size-i-1; j++) {
      if (a[j] > a[j+1]) {
        changes(&a[j], &a[j+1]);
      }
    }
  }
}


int main()
{    
ofstream myfile;
myfile.open ("example.txt");
srand(time(0));
int a[150];
    myfile<<"Orginal array: ";
        for(int i = 0; i<150; i++){
            a[i]= 0+(rand()%200);
         myfile<<a[i]<<" ";
        }
myfile<<"\n"<<endl;
bsort(a, 150);  
        
myfile << "Now sorted array: ";
for(int i = 0; i<150; i++){
         myfile<<a[i]<<" ";
}
myfile<<"\n";
           
    myfile.close();
return 0; 
}
