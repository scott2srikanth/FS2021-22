package questions.arraylist;
/*
A robot on an infinite XY-plane starts at point (0, 0) and faces north. The robot can receive one of three possible types of commands:

-2: turn left 90 degrees,
-1: turn right 90 degrees, or
1 <= k <= 9: move forward k units.
Some of the grid squares are obstacles. The ith obstacle is at grid point obstacles[i] = (xi, yi).

If the robot would try to move onto them, the robot stays on the previous grid square instead (but still continues following the rest of the route.)

Return the maximum Euclidean distance that the robot will be from the origin squared (i.e. if the distance is 5, return 25).

Note:

North means +Y direction.
East means +X direction.
South means -Y direction.
West means -X direction.


Example 1:

Input: commands = [4,-1,3]
Output: 25
Explanation: The robot starts at (0, 0):
1. Move north 4 units to (0, 4).
2. Turn right.
3. Move east 3 units to (3, 4).
The furthest point away from the origin is (3, 4), which is 32 + 42 = 25 units away.


Constraints:

a) 1 <= commands.length <= 104
b) commands[i] is one of the values in the list [-2,-1,1,2,3,4,5,6,7,8,9].
c) The answer is guaranteed to be less than 231.
 */

public class WalkingRobot {
    public static void main(String[] args) {
        int[] commands = {4,-1,4,-2,4};
        System.out.println(robotSim(commands));
    }
    public static int robotSim(int[] commands) {
        int[] directionX = new int[]{0, 1, 0, -1};
        int[] directionY = new int[]{1, 0, -1, 0};
        int x = 0, y = 0, direction = 0;

        int result = 0;
        for (int cmd: commands) {
            if (cmd == -2)  //left
                direction = (direction + 1) % 4;
            else if (cmd == -1)  //right
                direction = (direction + 3) % 4;
            else {
                for (int k = 0; k < cmd; ++k) {
                    x += directionX[direction];
                    y += directionY[direction];
                }
            }
        }
        result = x*x + y*y;
        return result;
    }
}
