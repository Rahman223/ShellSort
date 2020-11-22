class ShellSortTest {
    public static void main (String[] args){
        int [] testArray = new int [5];
        testArray[0]=  5;
        testArray[1]=  6;
        testArray[2]=  2;
        testArray[3]=  3;
        testArray[4]=  1;
        displayArray(testArray);
        shellSort(testArray);
        displayArray(testArray);

    }

public static void shellSort (int [] array){
    
    for (int k=2; k<array.length; k=k*2){
        int interval = array.length/k;
        for (int i=0; i<array.length-interval; i++){
            if (array[i]>array[i+interval]){
                int tmp = array[i+interval];
                array[i+interval] = array[i];
                array[i] = tmp;
            }
        }
    }
    insertionSort(array);

}

public static void insertionSort (int [] array){
    for (int i=0; i <array.length; i++){
        int temp = array[i];
        int j = i-1;
        while (j>=0 && array[j]> temp){
            array[j+1]=array[j];
            array[j]=temp;
            j--;
        }
        
    }
}

public static void displayArray (int [] array){
    for (int i=0; i<array.length;i++){
        System.out.println(array[i]);
    }
    System.out.println();
}
}