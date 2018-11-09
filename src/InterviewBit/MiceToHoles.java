/*
Source: InterviewBit

Problem Statement: There are N Mice and N holes are placed in a straight line.
Each hole can accomodate only 1 mouse.
A mouse can stay at his position, move one step right from x to x + 1, or move one step left from x to x − 1.
Any of these moves consumes 1 minute.
Assign mice to holes so that the time when the last mouse gets inside a hole is minimized.

Example:

positions of mice are:
4 -4 2
positions of holes are:
4 0 5

Assign mouse at position x=4 to hole at position x=4 : Time taken is 0 minutes
Assign mouse at position x=-4 to hole at position x=0 : Time taken is 4 minutes
Assign mouse at position x=2 to hole at position x=5 : Time taken is 3 minutes
After 4 minutes all of the mice are in the holes.

Since, there is no combination possible where the last mouse's time is less than 4,
answer = 4.
Input:

A :  list of positions of mice
B :  list of positions of holes
Output:
single integer value

 */
package InterviewBit;

import java.util.* ;

public class MiceToHoles
{
    // Returns minimum time required to place mice in holes.
    private int assignHole(ArrayList<Integer> mice,
                           ArrayList<Integer> holes)
    {
        if (mice.size() != holes.size())
            return -1;

        /* Sort the lists */
        Collections.sort(mice);
        Collections.sort(holes);

        int size = mice.size();

        /* finding max difference between ith mice and hole */
        int max = 0;
        for (int i=0; i<size; i++)
            if (max < Math.abs(mice.get(i)-holes.get(i)))
                max = Math.abs(mice.get(i)-holes.get(i));

        return Math.abs(max);
    }

    public static void main(String[] args)
    {
        MiceToHoles gfg = new MiceToHoles();
        ArrayList<Integer> mice = new ArrayList<Integer>();
        mice.add(4);
        mice.add(-4);
        mice.add(2);
        ArrayList<Integer> holes= new ArrayList<Integer>();
        holes.add(4);
        holes.add(0);
        holes.add(5);
        System.out.println("The last mouse gets into "+ "the hole in time: "+gfg.assignHole(mice, holes));
    }
}
