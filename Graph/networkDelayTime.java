import java.util.PriorityQueue;

class Solution
{
    public static class Pair implements Comparable<Pair>
    {
        int n, wt;

        public Pair(int n, int wt)
        {
            this.n = n;
            this.wt = wt;
        }

        @Override
        public int compareTo(Pair p2)
        {
            return this.wt - p2.wt;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k)
    {
        int[] minTime = new int[n + 1];
        boolean[] isVisited = new boolean[n + 1];

        for(int i = 1 ; i <= n ; i++)
            if(i != k)
                minTime[i] = Integer.MAX_VALUE;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(k, 0));

        while(!pq.isEmpty())
        {
            Pair p = pq.remove();
            int v = p.n;

            if(!isVisited[v])
            {
                for(int[] edge : times)
                {
                    int src = edge[0], des = edge[1], wt = edge[2];
                    int newTime = minTime[src] + wt;

                    if(src == v && !isVisited[des] && newTime < minTime[des])
                    {
                        minTime[des] = newTime;
                        pq.add(new Pair(des, newTime));
                    }
                }

                isVisited[v] = true;
            }
        }

        int finalTime = -1;
        for(int t : minTime)
        {
            if(t == Integer.MAX_VALUE)
            {
                finalTime = -1;
                break;
            }

            else if(t != 0 && t > finalTime)
                finalTime = t;
        }

        return finalTime;
    }
}
