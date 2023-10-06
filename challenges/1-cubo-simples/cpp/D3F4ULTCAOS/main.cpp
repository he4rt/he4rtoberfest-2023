#include <iostream>

using namespace std;

int CuboS ( int v1 ){
    
    return v1 * v1 * v1; 
    
}

int main(){

    int num;

    cout<<"Escolha seu numero: ";

    cin>>num;

    int result = CuboS(num);

    cout<<"Seu resultado obtido foi: "<<result<<endl;

    return 0;

}
