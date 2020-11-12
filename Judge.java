import java.util.*;

public class Judge
{
	public int findJudge (int N, int [][] trust)
	{
		//Array to store trust value
		int [] x = new int[N + 1];
		for (int[] t: trust)
		{
			x[t[0]]--; //If someone is trusts, decrease
			x[t[1]]++; //If someone is trusted, increase
		}

		for (int i = 1; i <= N; i++)
		{
			if (x[i] == N - 1) 
			{
				return i; //returns the town judge ID
			}
		} 
		return -1; //judge not found
	}

	public static void main(String args[])
	{
		Judge judge = new Judge();

		/* EXAMPLE 1 */
		// int trust[][] = {{1, 2}};
		// int n = judge.findJudge(2, trust);

		/* EXAMPLE 2 */
		// int trust[][] = {{1, 3}, {2, 3}};
		// int n = judge.findJudge(3, trust);

		/* EXAMPLE 3 */
		// int trust[][] = {{1, 3}, {2, 3}, {3, 1}};
		// int n = judge.findJudge(3, trust);

		/* EXAMPLE 4 */
		// int trust[][] = {{1, 2}, {2, 3}};
		// int n = judge.findJudge(3, trust);

		/* EXAMPLE 5 */
		int trust[][] = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
		int n = judge.findJudge(4, trust);

		System.out.println(n);
	}
}