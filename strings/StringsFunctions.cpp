//
// Created by Honor on 06.12.2022.
//

#include "StringsFunctions.h"

void StringsFunctions::revers(std::string &s) {
    std::string rev;
    for (int i = s.size() - 1; i >= 0; i--) {
        rev += s[i];
    }
    s = rev;
}
