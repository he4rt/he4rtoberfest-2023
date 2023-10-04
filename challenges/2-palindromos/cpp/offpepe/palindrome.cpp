#include <iostream>
#include <string>


using namespace std;

string toLower(string str) {
    char lowered[46];
    for (int i = 0; i < str.length(); i++) {
        lowered[i] = tolower(str[i]);
    }
    return lowered;
}

string convertBoolean(bool x) {
    if (x) {
        return "true";
    }
    return "false";
}

int main() {
    string in; bool out; string reversed;
    cin >> in;
    in = toLower(in);
    int size = in.length() - 1;
    for (char c : in) {
        reversed = c + reversed;
    }
    cout << convertBoolean(in == reversed) << endl;
}