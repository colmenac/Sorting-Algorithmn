void bubblesorv3(int a[], int n){
        bool swapped; 
        for (int i = 0; i < n; i++) 
    { 
    swapped = false; 
    for (int j = 0; j < n-i-1; j++) 
    { 
        if (a[j] > a[j+1]) 
                        { 
        int tp = a[j];
        a[j] = a[j+1];
        a[j+1] = tp;;
        swapped = true; 
                    } 
            } 
    if (swapped == false) 
                break; 
   }
}

int main(){
    ofstream output("FabFourout.txt");
    int array[150];
    for(int i=0;i<150;i++)
                array[i] = rand()%201;
    output<<"Original Array";
    for(int i=0;i<150;i++)
                output<<" "<<array[i];
    output<<"\n";
    bubblesortv3(array,150);
    output<<"Sorted Array";
    for(int i=0;i<150;i++)
        output<<" "<<array[i];
        return 0;
}
