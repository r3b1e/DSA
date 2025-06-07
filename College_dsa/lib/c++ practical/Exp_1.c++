#include<iostream>
using namespace std;
class about{
    int length;
    int breadth;
    int height;
    public:
    void value(int len, int bre, int hei){
        length = len;
        breadth = bre;
        height = hei;
    }
    int area(){
        return length*breadth;
    }
    int volumn(){
        return length*breadth*height;
    }
};
class Wall{
    public:
    int length, height;
    Wall(int len, int hei){
      length = len;
      height = hei;
    }
    public:
    int area(){
        return length*height;
    }
};


int main(){
//  about room1;
//  room1.value(9, 4, 6);
//  cout<<"The area is :"<<room1.area()<<endl;
//  cout<<"The volumn is :"<<room1.volumn()<<endl;
Wall wall(8, 9);
cout<<"The wall height is :"<<wall.area()<<endl;

 return 0;
}