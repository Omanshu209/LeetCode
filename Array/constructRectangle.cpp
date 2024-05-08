#include <vector>

class Solution
{
public:

    int nFactor(int n1, int n2)
    {
        for(int i = n1 / 2 ; i > 1 ; i--)
            if(n1 % i == 0 && (n1 / i) >= (n2 * i))
                return i;
        return 1;
    }

    vector<int> constructRectangle(int area)
    {
        vector<int> dim, prevDim;
        dim.push_back(area);
        dim.push_back(1);

        prevDim.resize(2);

        while(dim[0] >= dim[1])
        {
            prevDim[0] = dim[0];
            prevDim[1] = dim[1];

            int factor = nFactor(dim[0], dim[1]);

            if(factor == 1)
                break;
            
            dim[0] /= factor;
            dim[1] *= factor;
        }

        return prevDim;
    }
};
