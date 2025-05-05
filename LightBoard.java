public class LightBoard
{
/** The lights on the board, where true represents on and false represents off.
*/
private boolean[][] lights;
/** Constructs a LightBoard object having numRows rows and numCols columns.
* Precondition: numRows > 0, numCols > 0
* Postcondition: each light has a 40% probability of being set to on.
*/
public LightBoard( boolean[][] light)
{ 
    lights=light;
}

public LightBoard(int numRows, int numCols)
{ 
    int probability =0;
    for(int x=0; x<numRows; x++)
     {
        for(int y=0; y<numCols; y++)
        {
            probability = (int)(Math.random()*10)+1;
            if(probability<=4) lights[numRows][numCols] = true;
            else lights[numRows][numCols] = false;
        }
     }   


}
/** Evaluates a light in row index row and column index col and returns a status
* as described in part (b).
* Precondition: row and col are valid indexes in lights.
*/
public boolean evaluateLight(int r, int c)
{ 
int iseven =0;
int isthree =0;
if(lights[r][c]==true) 
{
    for(int x=0; x<lights.length; x++)
    {
        if(lights[x][c]==true) iseven++; 
    }
    if(iseven%2==0) return false;
}


if(lights[r][c]==false) 
{
    for(int x=0; x<lights.length; x++)
    {
        if(lights[x][c]==true) isthree++; 
    }
    if(isthree%r==0) return true;
}




return lights[r][c];



}
// There may be additional instance variables, constructors, and methods not shown.
}