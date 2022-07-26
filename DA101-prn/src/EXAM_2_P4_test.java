import java.util.ArrayList;
import java.util.Scanner;

public class EXAM_2_P4_test{
	public static void main(String[] args)
        {
			Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int col = sc.nextInt();

            int x = sc.nextInt();
            int y = sc.nextInt();

            int h[][] = new int[row][col];
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    h[i][j] =  sc.nextInt();
                }
            }
            int water[][] = new int[row][col];
            for (int i = 0; i < row; i++)
            {     
                for (int j = 0; j < col; j++)
                {
                    water[i][j] = sc.nextInt();
                }
            }
            
            sc.close();
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++)
                    water[i][j] += h[i][j];

            //----------------------------------------
            ArrayList<int[][]> step = new ArrayList<int[][]>();
            boolean isFinal = false;
            int below, left, right, above, current_cell, count=0;
            while (!isFinal)
            {
                count++;
                //Console.WriteLine("step=" + count);
                int tmp[][] = new int[row][col];
                for (int i = 0; i < row; i++)
                    for (int j = 0; j < col; j++)
                        tmp[i][ j] = -1;

                //cal
                for (int i = 0; i < row; i++)
                {
                    for (int j = 0; j < col; j++)
                    {
                        current_cell = water[i][j];

                        below = i + 1;
                        left = j - 1;
                        right = j + 1;
                        above = i - 1;

                        if (below < row && current_cell >= 2)
                        {
                            if ((current_cell - water[below][ j] >= 2) &&
                                current_cell - 1 >= h[i][j])
                            {
                                current_cell--;
                                if (tmp[i][j] == -1) 
                                	tmp[i][ j] = current_cell;
                                else 
                                	tmp[i][j]--;
                                if (tmp[below][j] == -1) 
                                	tmp[below][j] = water[below][j] + 1;
                                else 
                                	tmp[below][j]++;
                            }
                        }
                        if (left >= 0 && current_cell >= 2)
                        {
                            if ((current_cell - water[i][left] >= 2) &&
                                current_cell - 1 >= h[i][j])
                            {
                                current_cell--;
                                if (tmp[i][j] == -1) 
                                	tmp[i][j] = current_cell;
                                else 
                                	tmp[i][j]--;
                                if (tmp[i][left] == -1) 
                                	tmp[i][left] = water[i][left] + 1;
                                else 
                                	tmp[i][left]++;
                            }
                        }
                        if (right < col && current_cell >= 2)
                        {
                            if ((current_cell - water[i][right] >= 2) &&
                                current_cell - 1 >= h[i][j])
                            {
                                current_cell--;
                                if (tmp[i][j] == -1) 
                                	tmp[i][j] = current_cell;
                                else 
                                	tmp[i][j]--;
                                if (tmp[i][right] == -1) 
                                	tmp[i][right] = water[i][right] + 1;
                                else 
                                	tmp[i][right]++;
                            }
                        }
                        if (above >= 0 && current_cell >= 2)
                        {
                            if ((current_cell - water[above][j] >= 2) &&
                                current_cell - 1 >= h[i][j])
                            {
                                current_cell--;
                                if (tmp[i][j] == -1) 
                                	tmp[i][j] = current_cell;
                                else 
                                	tmp[i][j]--;
                                if (tmp[above][j] == -1) 
                                	tmp[above][j] = water[above][j] + 1;
                                else 
                                	tmp[above][j]++;
                            }
                        }


                    }

                }


                //update
                int tmp2[][] = new int[row][col];
                for (int i = 0; i < row; i++)
                {
                    for (int j = 0; j < col; j++)
                    {
                        if (tmp[i][j] != -1) 
                        	water[i][j] = tmp[i][j];
       
                        tmp2[i][j] = water[i][j];

                        //Console.Write(water[i, j]);
                        //if (j != col - 1) Console.Write(" ");
                        //else Console.WriteLine();
                    }
                }
                step.add(tmp2);
                //Console.WriteLine("-");

                //compare
                if(step.size() > 1)
                {
                    boolean isSame = true;
                    for (int i = 0; i < row; i++)
                        for (int j = 0; j < col; j++)
                            if (step.get(step.size()-2)[i][j] != water[i][j])
                            {
                                isSame = false;
                                break;
                            }

                    if (isSame)
                    {
                        step.remove(step.size() - 1);
                        isFinal = true;
                        break;
                    }
                }
                
            }


            //Console.WriteLine(water[x-1, y-1] - h[x - 1, y - 1]);
            System.out.println(water[x-1][y-1] - h[x - 1][y - 1]);
            for(int w[][] : step)
            {
                for (int i = 0; i < row; i++)
                {
                    for (int j = 0; j < col; j++)
                    {
                    	System.out.print(w[i][j] - h[i][j]);
                        if(j != col-1) System.out.print(" ");
                        else System.out.println();
                    }
                }
                //Console.WriteLine("-");
                System.out.println("-");
            }
            
        }
}
