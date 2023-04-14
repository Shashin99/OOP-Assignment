// IT21355196 - K.L.S.Kalpajith
// Malabe - Weekday - Group 07.02
// Assignment 1 - Question_02

package Question_02;

import java.util.Random;

public class RandNum
{
    private int arr[][] = new int[5][5];

    private int max = 0;
    private int min = 0;
    private int sum = 0;
    private double avg = 0.0;
    
    public RandNum()
    {
        Random ran = new Random();
        
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                arr[i][j] = ran.nextInt(100) + 1;
            }
        }
    }
    
    public void maxMinAvgValues()
    {
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                sum = sum + arr[i][j];
            }
        }
        
        avg = sum / 25.0;
        
        
        max = arr[0][0];
        
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                max = max < arr[i][j] ? arr[i][j] : max;
            }
        }
        
        min = arr[0][0];
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                min = min > arr[i][j] ? arr[i][j] : min;
            }
        }
        
    }
    
    public void displayMin_Max_AvgValues()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.print("");
            for(int j = 0; j < 5; j++)
            {
                System.out.print( arr[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("\nMaximum Value : " + max);
        System.out.println("\nMinimum Value : " + min);
        System.out.println("\nAverage Value : " + avg);
    
    }
}
