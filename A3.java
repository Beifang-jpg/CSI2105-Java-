import java.lang.Thread.State;
import java.util.Scanner;

public class A3 {
    static String State[] = {"Stop/Rest", "Accelerating Forword","Accelerating Backword", 
    "DeAccelerating Forword", "DeAccelerating Backword", "Moving Constant Forward", "Moving Constant BackWord"
    ,"Constant Moving in Highest Spead Forword", "Constant Moving in Highest Spead Backword"};

    
    

    static String ShowBUg = " ";  
    static String CurState = "Stop/Rest" ;
    static int input = 0;
    static int a =0;
    static String Cam_Drill = "idle";
        

    

    public static void main(String[] args) {
        A3 Car = new A3(); 
        Scanner scan = new Scanner(System.in);

        
        while(a ==0 ){
            ShowBUg = " ";
            System.out.println("Enter the pedal you want press");
            System.out.println("-1 for stop this java");
            System.out.println("1 for single press left");
            System.out.println("2 for double press right");
            System.out.println("3 for press left for more than 5 seconds");
            System.out.println("4 for press right for more than 5 seconds");
            System.out.println("5 for press both together for more than 5 seconds");
            System.out.println("6 for don't press anything");
            System.out.println("7 for Button 1 for 5 second");
            System.out.println("8 for Button 1 for 10 second");
            System.out.println("9 for Button 1 for twice");
            System.out.println("10 for Button 2");
            System.out.println("11 for Button 1 single press");

            input = scan.nextInt();
            if (input <= 6 && input != -1){
                Car.Change1(input);
            }else if (input > 6 && input < 12){
                Car.CamAndDrill(input);
            }else{
                ShowBUg = "Something press wrong. State will not change.";
            }
            System.out.println(ShowBUg);
            System.out.println("Current State is: " +CurState + " and "+ Cam_Drill);


            if (input == -1){
                break;
            }
        }
        scan.close();       

        


    }

    public void Change1(int p){     
                
        if(p == 5 && CurState != "Sleeping"){//Break
            CurState = State[0];
        }else if(CurState == State[0]){//Current not moving
            if(p == 1){
                CurState = State[1];//change to acc for
            }else if(p == 3){
                CurState = State[2];//change to acc back
            }else if(p == 0){
                CurState = "Sleeping";
            }else{
                ShowBUg = "State Not Changed. Please Press Correct.111";
            }
        }else if(CurState == State[1]){//Current Acc for
            if (p == 2){
                CurState = State[3];//change to de for
            }else if(p == 4){
                CurState = State[5];//change to constant for
            }else if (p == 6){
                CurState = State[7];
            }else{
                ShowBUg = "State Not Changed. Please Press Correct.";
            }
        }else if(CurState == State[2]){//Current Acc back
            if (p == 2){
                CurState = State[4];
            }else if(p == 4){
                CurState = State[6];
            }else if (p == 6){
                CurState = State[8];
            }else{
                ShowBUg = "State Not Changed. Please Press Correct.";
            }
        }else{
            Change2(p, WhatSatate(CurState));
        }      
    }

    public void Change2(int p ,int i){
        this.CurState = CurState;
        this.ShowBUg = ShowBUg;
        if (i == 3 || i == 4 || i == 5 || i ==6 || i-p > 0){
            CurState = State[i-p];
        }else if(i == 7 && p == 4){
            CurState = State[3];
        }else if(i == 8 && p == 4){
            CurState = State[4];
        }

    }

    // public Boolean StartFire(int p){
    //     this.CurState = CurState;
    //     if(p == 0){
    //         CurState = "Stop/Rest";
    //         return true;
    //     }else {
    //         CurState = "Please StartFire First.";
            
    //         return false;
    //     }
    // }

    public int WhatSatate(String C){
        int num = 0;
        for (int i=0; i <= 8; i++){
            if (C == State[i]){
                num = i;
            }
        }
        return num;       
    }

    public void CamAndDrill(int p){
        this.Cam_Drill = Cam_Drill;
        if (p == 10){
            Cam_Drill = "idle";
        }else if(Cam_Drill == "idle"){
            if (p ==  7){
                Cam_Drill = "Color Camera";
            }else if(p == 8){
                Cam_Drill = "16mm Camera";
            }else if (p == 9){
                Cam_Drill = "Drill_on";
            }else{
                Cam_Drill = "idle";
            }
        }else if (Cam_Drill == "Color Camera" || Cam_Drill == "16mm Camera"){
            if (p == 11){
                Cam_Drill = "Taking picture";
            }else if (p == 7){
                Cam_Drill = "Temporizer";
            }else{
                
            }
        }else if(Cam_Drill == "Drill_on" || Cam_Drill  == "Drill_off"){
            if (p == 9){
                if (Cam_Drill == "Drill_on"){
                    Cam_Drill = "Drill_off";
                }else{
                    Cam_Drill = "Drill_on";
                }
            }else{
                
            }
        }
    }
        


}
