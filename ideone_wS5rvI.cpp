
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <assert.h>
#include <fstream>
#include <iterator>
#include <cstring>

using namespace std;

template<template<class,class...> class C>
size_t find_xxx(const C<double>& container)
{
    size_t step, idx, first=0, count=container.size();
    if(count == 0) throw invalid_argument("Empty range");

    assert( is_sorted(begin(container), end(container)) );
    assert( all_of(begin(container), end(container), [=](double e){return e >= 0 && e < count;}) );

    while( count > 0 )
    {
        step = count/2;
        idx  = first + step;

        size_t val = static_cast<size_t>(container[idx]);

        if( val == idx ) return idx;

        if( val > idx )
        {
            first = ++idx;
            count-= step+1;
        }
        else count=step;
    }

    if( static_cast<size_t>(container[first]) != first )
        throw invalid_argument("No such element found");

    return first;
}

int main()
{
    // vector<double> v {1.2, 2.4, 3.11, 3.14, 3.44, 5.14};

    // vector<double> v {1.2, 2.4, 3.11, 4.14, 5.44, 5.54, 10.6, 22.4};
    vector<double> v {1.2, 2.4, 3.11, 4.14, 4.44, 6.14};
    size_t idx = find_xxx(v);
    cout << "Found : idx=" << idx << ", val=" << fixed << v[idx];
    return 0;
}
