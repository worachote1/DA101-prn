package DST4_Queue;

public class PointInMaze {
	public int x;
	public int y;
	public int count_walk;
	public PointInMaze prev;
	//can walk through or not ?
	public boolean isValid;
	//Has that position been visited before ? 
	public boolean isVisited;
}
