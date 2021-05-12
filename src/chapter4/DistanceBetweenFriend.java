package chapter4;

import java.util.*;

/*
Ramesh’s house is located at a junction from which the places of his four friends
are located at two coordinate points each.
He must be at either one of their houses at the same time.
Help him choose which house to go to by finding out the one
with the nearest distance from his place. The coordinates of their
houses are as follows:
                Name	              Coordinates
              Ramesh	                  (3,2)
              Friend A	                  (2,3)  ----- 0
              Friend B	                  (0,0)  ----- 1
              Friend C	                  (5,8)  ----- 2
              Friend D	                  (1,4)  ----- 3

Do not use Scanner class user static values (only 1 testcase)

output : 0
*/
public class DistanceBetweenFriend {
    public static void main(String[] args) {
        int ramesh_x = 3,ramesh_y=2,i,min,min_index = 0;
        int ramesh[]={3,2};
        int A[]={2,3};
        int B[]={0,0};
        int C[]={5,8};
        int D[]={1,4};

        List<Integer> dist = new ArrayList();
        dist.add((int) Math.sqrt(((A[0]-ramesh[0])*(A[0]-ramesh[0]))+((A[1]-ramesh[1])*(A[1]-ramesh[1]))));
        dist.add((int) Math.sqrt(((B[0]-ramesh[0])*(B[0]-ramesh[0]))+((B[1]-ramesh[1])*(B[1]-ramesh[1]))));
        dist.add((int) Math.sqrt(((C[0]-ramesh[0])*(C[0]-ramesh[0]))+((C[1]-ramesh[1])*(C[1]-ramesh[1]))));
        dist.add((int) Math.sqrt(((D[0]-ramesh[0])*(D[0]-ramesh[0]))+((D[1]-ramesh[1])*(D[1]-ramesh[1]))));

        min=dist.get(0);
        for(i=0;i<dist.size();i++){
            min=Math.min(min,dist.get(i));
        }

        System.out.println("Nearest friend:"+ dist.indexOf(min));
    }
}
