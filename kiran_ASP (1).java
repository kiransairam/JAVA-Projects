package Kiran_heap;


import java.io.*;
import java.util.*;

public class kiran_ASP {

		static int max = 9999, num = 5, s = 0, d = 3, NILL = -1;

		
		static void Dijkstra(int[][] Graph, int _n, int _s, int _d)
		{

			int i, u, v, count;
			int[] dist = new int[num];
			int[] Blackened = new int[num];
			int[] pathlength = new int[num];
			int[] parent = new int[num];

			
			parent[_s] = NILL;

			for (i = 0; i < num; i++)
				dist[i] = max;

			dist[_s] = 0;
			for (count = 0; count < num - 1; count++)
			{
				u = MinimumDistance(dist, Blackened);
				if (u == max)
					break;
				else
				{
					Blackened[u] = 1;
					for (v = 0; v < num; v++)
					{
						if (Blackened[v] == 0 && Graph[u][v] != 0
							&& dist[u] + Graph[u][v] < dist[v])
						{
							parent[v] = u;
							pathlength[v] = pathlength[parent[v]] + 1;
							dist[v] = dist[u] + Graph[u][v];
						}
						else if (Blackened[v] == 0 && Graph[u][v] != 0
								&& dist[u] + Graph[u][v] == dist[v]
								&& pathlength[u] + 1 < pathlength[v])
						{
							parent[v] = u;
							pathlength[v] = pathlength[u] + 1;
						}
					}
				}
			}
			if (dist[_d] != max)
				PrintPath(parent, _d);
			else
				System.out.println("There is not path between vertex " +
									_s + " to vertex " + _d);
		}

		static int MinimumDistance(int[] dist, int[] Blackened)
		{
			int min = max, min_index = -1, v;
			for (v = 0; v < num; v++)
				if (Blackened[v] == 0 && dist[v] < min)
				{
					min = dist[v];
					min_index = v;
				}
			return min == max ? max : min_index;
		}
		static void PrintPath(int[] parent, int _d)
		{
			if (parent[_d] == NILL)
			{
				System.out.print(_d);
				return;
			}
			PrintPath(parent, parent[_d]);
			System.out.print("->" + _d);
		}
		public static void main(String[] args)
		{
			int[][] Graph = { { 0, 1, max, max, 10 },
							{ 1, 0, 4, max, max },
							{ max, 4, 0, 7, max },
							{ max, max, 7, 0, 2 },
							{ 10, max, max, 2, 0 } };
			Dijkstra(Graph, num, s, d);
		}
	}