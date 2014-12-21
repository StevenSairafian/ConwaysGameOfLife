package conwaysPack;

class Board
{
   int[][] board;
   public Board(int rmax, int cmax)
   {
      board = new int[rmax][cmax];
   }
   public void print()
   {
      for (int i = 0; i < board.length; ++i)
      {
         for (int j = 0; j < board[i].length; ++j)
         {
            System.out.print(board[i][j]);
         }
         System.out.println();
      }
   }
   public void print(char char0, char char1)
   {
      for (int i = 0; i < board.length; ++i)
      {
         for (int j = 0; j < board[i].length; ++j)
         {
            if (board[i][j] == 0)
            {
               System.out.print(char0);
            } else
            {
               System.out.print(char1);
            }
         }
         System.out.println();
      }
   }
   public Board next()
   {
      Board nextBoard = new Board(50, 50);
      for (int i = 0; i < board.length; ++i)
      {
         for (int j = 0; j < board[i].length; ++j)
         {
            int counter = 0;
            for (int k = i - 1; k <= i + 1; ++k)
            {
               if (i - 1 > 0 && i + 1 < board.length)
               {
                  for (int l = j - 1; l <= j + 1; ++l)
                  {
                     if (j - 1 > 0 && j + 1 < board[i].length)
                     {
                        if (board[k][l] > 0)
                        {
                           ++counter;
                        }
                     }
                  }
               }
            }
            if (counter == 3)
            {
               nextBoard.board[i][j] = 1;
            } else if (counter < 3 || counter > 4)
            {
               nextBoard.board[i][j] = 0;
            } else
            {
               nextBoard.board[i][j] = board[i][j];
            }
         }
      }
      return nextBoard;
   }
   public void set(int r, int c)
   {
      board[r][c] = 1;
   }
   public void reset(int r, int c)
   {
      board[r][c] = 0;
   }
}
