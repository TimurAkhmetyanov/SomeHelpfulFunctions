#include "ScalesOfNotation.h"
#include "string"

void revers(std::string &s) {
    std::string rev;
    for (int i = s.size() - 1; i >= 0; i--) {
        rev += s[i];
    };
    s = rev;
}

std::string ScalesOfNotation::decimalToBinaryString(int base10) {
    int b;
    std::string num = "";
    while (base10 != 0) {
        b = base10 % 2;
        num += std::to_string(b);
        base10 = base10/2;
    }
    revers(num);
    return num;
}

int ScalesOfNotation::decimalToBinaryInt(int base10) {
    int b;
    std::string num = "";
    while (base10 != 0) {
        b = base10 % 2;
        num += std::to_string(b);
        base10 = base10/2;
    }
    revers(num);
    int base2 = std::stoi(num);
    return base2;
}
