#include <algorithm>
#include "SomeOperations.h"

void SomeOperations::removeByIndex(std::vector<int> &vec, int idx) {
    vec.erase(vec.begin() + idx);
}

void SomeOperations::removeByValue(std::vector<int> &vec, int val) {
    vec.erase(std::find(vec.begin(), vec.end(), val));
}