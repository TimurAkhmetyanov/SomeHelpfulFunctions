#include "ScalesOfNotation.h"
#include "string"

void revers(std::string &s) {
    std::string rev;
    for (int i = s.size() - 1; i >= 0; i--) {
        rev += s[i];
    };
    s = rev;
}

std::string ScalesOfNotation::decimalToBinaryString(int base2) {
    int b;
    std::string num = "";
    while (base2 != 0) {
        b = base2 % 2;
        num += std::to_string(b);
        base2 = base2/2;
    }
    revers(num);
    return num;
}
