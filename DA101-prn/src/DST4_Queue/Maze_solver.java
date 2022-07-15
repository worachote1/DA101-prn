package DST4_Queue;

public class Maze_solver {
	public int maze[][];
	public PointInMaze Pmaze[][];
	
	//find the best path to the exit of the maze
	public void solve(int mazex[][]) {
		MyQueue<PointInMaze> q = new MyQueue<PointInMaze>();
		maze = mazex;
		Pmaze = new PointInMaze[maze.length][maze[0].length];
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				
				Pmaze[i][j]=new PointInMaze();
				Pmaze[i][j].x = j;
				Pmaze[i][j].y = i;
				Pmaze[i][j].count_walk = 0;
				//if that position is a wall x
				//so can't walk through
				if(maze[i][j] == -44) {
					Pmaze[i][j].isValid = false;
				}
				else {
					Pmaze[i][j].isValid = true;
				}
				
				//never visited before
				Pmaze[i][j].isVisited = false;
			}
		}
		
		PointInMaze start = Pmaze[0][0];
		PointInMaze end = Pmaze[maze.length-1][maze[0].length-1];
		
		q.enqueue(start);
		start.isVisited = true;
		
		while(q.size()>0) {
			System.out.print(q.size()+"\t");
			PointInMaze now = q.dequeue();
			System.out.println(q.size());
			
			//can go left ?
			//its left side position is not 'wall x' ? and never visited before ?
			if(now.x>0 && Pmaze[now.y][now.x-1].isValid 
					&& !(Pmaze[now.y][now.x-1].isVisited)) 
			{
				
				Pmaze[now.y][now.x-1].prev = now;
				Pmaze[now.y][now.x-1].count_walk = now.count_walk + 1;
				q.enqueue(Pmaze[now.y][now.x-1]);
			    
				PointInMaze next = Pmaze[now.y][now.x-1];
				next.isVisited = true;
				if(next==end) {
					break;
				}
			}
			
			//can go above ?
			//its above position is not 'wall x' ? and never visited before ?
			if(now.y>0 && Pmaze[now.y-1][now.x].isValid 
					&& !(Pmaze[now.y-1][now.x].isVisited)) 
			{
				Pmaze[now.y-1][now.x].prev = now;
				Pmaze[now.y-1][now.x].count_walk = now.count_walk + 1;
				q.enqueue(Pmaze[now.y-1][now.x]);
				
				PointInMaze next = Pmaze[now.y-1][now.x];
				next.isVisited = true;
				if(next==end) {
					break;
				}
			}
			
			//can go right side ?
			//its right side position is not 'wall x' ? and never visited before ?
			if(now.x< Pmaze[0].length-1 && Pmaze[now.y][now.x+1].isValid 
					&& !(Pmaze[now.y][now.x+1].isVisited)) 
			{
				Pmaze[now.y][now.x+1].prev = now;
				Pmaze[now.y][now.x+1].count_walk = now.count_walk + 1;
				q.enqueue(Pmaze[now.y][now.x+1]);
				
				PointInMaze next = Pmaze[now.y][now.x+1];
				next.isVisited = true;
				if(next==end) {
					break;
				}
			}
			
			//can go bottom ?
			//its bottom position is not 'wall x' ? and never visited before ?
			if(now.y<Pmaze.length-1 && Pmaze[now.y+1][now.x].isValid 
					&& !(Pmaze[now.y+1][now.x].isVisited)) 
			{
				Pmaze[now.y+1][now.x].prev = now;
				Pmaze[now.y+1][now.x].count_walk = now.count_walk + 1;
				q.enqueue(Pmaze[now.y+1][now.x]);
				
				PointInMaze next = Pmaze[now.y+1][now.x];
				next.isVisited = true;
				if(next==end) {
					break;
				}
			}
		}
		
		//After that
		//Track which way have you come
		//Mark that way with number 999
		//with the help of passing parameter by reference
		
		PointInMaze trackPrev = end;
		while(trackPrev.prev != null && trackPrev != start) {
			System.out.println(" tracking.... -> ["+trackPrev.y+"] ["+trackPrev.x+"]");
			//Mark way
			mazex[trackPrev.y][trackPrev.x] = 999;
			
			trackPrev = trackPrev.prev;
		}
	}
}
