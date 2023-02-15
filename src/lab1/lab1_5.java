package lab1;

import java.util.Scanner;

public class lab1_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] bluePic = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                bluePic[i][j] = sc.nextInt();
            }
        }

        int width = getW(m,n,bluePic);
        int height = getH(m,bluePic);
        char[][] graph = new char[height][width];
        for(int i =0;i<graph.length;i++){
            for(int j=0;j<graph[0].length;j++){
                graph[i][j] = '.';
            }
        }
        //have construct whole graph with '.';
//        for(int i =0;i<graph.length;i++){
//            for(int j=0;j<graph[0].length;j++){
//                System.out.print(graph[i][j]);
//            }
//            System.out.println();
//        }




    }

    private static int getW(int m,int n,int[][] bluePic) {
        return 4*n+2*m+1;
    }
    private static int getH(int m,int[][] bluePic) {
        int[] maxElements = new int[m];
        for(int i =0;i<bluePic.length;i++){
            int max = bluePic[i][0];
            for(int j=0;j<bluePic[i].length;j++){
                if(bluePic[i][j]>max){
                    max = bluePic[i][j];
                }
            }
            maxElements[i] = max;
        }

        int tempMax = maxElements[0]*3+1+(maxElements.length)*2;
        for(int i=1;i<maxElements.length;i++){
            int num = maxElements[i]*3+1+(maxElements.length-i)*2;
            if(num>tempMax){
                tempMax = num;
            }
        }
        return tempMax;
    }
}

