package algorhitms;


/*
*Временная сложность O(N)
* Пространственная сложность O(1)
* Линейный поиск можно использовать для малого,
* несортированного набора данных, который не увеличивается в размерах.
* Несмотря на простоту,
* алгоритм не находит применения в проектах из-за
* линейного увеличения временной сложности.
 */
public class LinearSearch {
    public static int linearSearch(int arr[], int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;

    }
}
