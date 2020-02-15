#include<iostream>
using namespace std;

class P{
    public:
    void print(){
        cout<<"INSIDE P";
    }
};
class Q:public P{
        public:
        void print(){
            cout<<"Inside Q";
        }
};
class R:public Q{
    
};
int main(void){
    // int i = 5;
    // if(--i){
    //     cout<<i;
    //     main(10);
    // }
    //====================================================
    //second program
    // int *ptr =  new int(5);
    // cout<<*ptr;
    //Third Program
    R r;
    r.print();
    return 0; 
}