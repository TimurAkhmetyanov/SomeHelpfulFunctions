#include <climits>
#include "Sorts.h"

void Sorts::sortByBubbleGrowth(std::vector<int> &a) {
    for (int i = 0; i < a.size() - 1; i++) {
        for (int j = 0; j < a.size() - i - 1; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
}

void Sorts::sortByBubbleDecrease(std::vector<int> &a) {
    for (int i = 0; i < a.size() - 1; i++) {
        for (int j = 0; j < a.size() - i - 1; j++) {
            if (a[j] < a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
}

void Sorts::sortBySelectionGrowth(std::vector<int> &a) {
    for (int i = 0; i < a.size(); i++) {
        int min = INT_MAX;
        int k = 0;
        for (int j = i; j < a.size(); j++) {
            if (a[j] < min){
                min = a[j];
                k = j;
            }
        }
        int t = a[i];
        a[i] = a[k];
        a[k] = t;
    }
}

void Sorts::sortBySelectionDecrease(std::vector<int> &a) {
    for (int i = 0; i < a.size(); i++) {
        int max = INT_MIN;
        int k = 0;
        for (int j = i; j < a.size(); j++) {
            if (a[j] > max){
                max = a[j];
                k = j;
            }
        }
        int t = a[i];
        a[i] = a[k];
        a[k] = t;
    }
}
