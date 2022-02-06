public class Dijkstra {
    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        Dijkstra t = new Dijkstra();
        t.dijkstra(graph, 0);
    }
    static final int V = 9;
    int minDistance(int d[], Boolean sptSet[])
    {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int v=0;v<V;v++)
        {
            if(sptSet[v] == false && d[v]<=min)
            {
                min = d[V];
                minIndex = v;
            }
        }
        return minIndex;
    }

    void dijkstra(int g[][], int src)
    {
        int dist[] = new int[V];
        Boolean sptSet[] = new Boolean[V];
        for(int i=0;i<V;i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
        dist[src] = 0;
        for(int count = 0;count<V-1;count++)
        {
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;
            for(int v=0;v<V;v++)
            {
                if(!sptSet[v] && g[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + g[u][v] < dist[v])
                {
                    dist[v] = dist[u] + g[u][v];
                }
            }
        }
        printSolution(dist,V);
    }

    void printSolution(int dist[], int n)
    {
        System.out.println("Vertex Distance from source");
        {
            for(int i=0;i<V;i++)
            {
                System.out.println("  "+i+"            "+dist[i]);
            }
        }
    }
}
