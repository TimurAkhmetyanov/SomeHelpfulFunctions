#ifndef FUNCTIONS_SORTS_H
#define FUNCTIONS_SORTS_H

#include "vector"

class Sorts {
public:
    static void sortByBubbleGrowth(std::vector <int> &a);

    static void sortByBubbleDecrease(std::vector <int> &a);

    static void sortBySelectionGrowth(std::vector <int> &a);

    static void sortBySelectionDecrease(std::vector <int> &a);
};


#endif //FUNCTIONS_SORTS_H
