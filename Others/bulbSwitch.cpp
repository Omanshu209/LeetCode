#include <vector>

using namespace std;

class Solution
{
public:

    int bulbSwitch(int n)
    {
        vector<bool> bulbs;

        // Round 1
        for(int i = 0 ; i < n ; i++)
            bulbs.push_back(true);

        for(int i = 2 ; i <= n ; i++)
        {
            if(i == n && i > 3)
            {
                bulbs[n - 1] = !bulbs[n - 1];
                break;
            }

            switch(i)
            {
                case 2:
                    for(int j = 1 ; j < n ; j += 2)
                        bulbs[j] = false;
                    break;
                
                case 3:
                    for(int j = 2 ; j < n ; j += 3)
                        bulbs[j] = !bulbs[j];
                    break;
                                
                default:
                    for(int j = i - 1 ; j < n ; j += i)
                        bulbs[j] = !bulbs[j];
                    break;
            }
        }

        int bulbs_on = 0;

        for(int i = 0 ; i < n ; i++)
            bulbs_on += bulbs[i];
        
        return bulbs_on;
    }
};
