package algorhitms;
/*
Временная сложность равна O(log(N))
Пространственная сложность O(1)
В худшем случае пространственная сложность O(log(N))
 */
public class BinarySearch {

    public static int binarySearch(int arr[], int elementToSearch) {


        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;


            // если средний элемент больше
            // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }

        return -1;
    }



    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elemetToSearch) {

        // условие прекращения
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;
                    // если средний элемент - целевой элемент, вернуть его индекс.
                    if (arr[mid] == elemetToSearch)
                        return mid;


                    // если средний элемент больше целевого
                    // вызываем метод рекурсивно по суженным данным
                    if (arr[mid] > elemetToSearch)
                        return recursiveBinarySearch(arr, firstElement , mid - 1, elemetToSearch );


                    return recursiveBinarySearch(arr, mid + 1, lastElement,elemetToSearch);

        }

        return  -1;

    }
}
