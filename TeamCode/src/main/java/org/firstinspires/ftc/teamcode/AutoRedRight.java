package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Auto_Red_Right")
public class AutoRedRight extends Auto_Abstract {



    @Override
    public void runOpMode() {
        generalDefine();

        waitForStart();
        //============

        claw(CLOSE);
        //Move Forward one square

        drive(0.2, TILE_WIDTH_YES_TEETH *1.35, FORWARD, false, false);

        //Move left to align with rings

        int target = readRings(); //change to read ring function

        //getColorValues();
        //telemetry.addData("Amount of rings ", target);
        telemetry.update();
        //sleep(20000);

        switch (target){
            case NO_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH *2.0, FORWARD, false, false);


                break;

            case ONE_RING:
                drive(0.4, TILE_WIDTH_YES_TEETH *1.0, STRAFE_LEFT, false, false);
                drive(0.7, TILE_WIDTH_YES_TEETH * 3, FORWARD, false, false);
                drive(0.4, TILE_WIDTH_YES_TEETH *1.0, STRAFE_RIGHT, false, false);
                break;

            case FOUR_RING:
                drive(0.4, TILE_WIDTH_YES_TEETH *1.0, STRAFE_LEFT, false, false);
                drive(0.5, TILE_WIDTH_YES_TEETH *3.75, FORWARD, false, false);
                drive(0.3, TILE_WIDTH_YES_TEETH *0.92, STRAFE_RIGHT, false, false);

                break;
        }

        wobbleArm(DOWN, (long)1300, 0.5);

        claw(OPEN);

        sleep(1000);


        //Go for second wobble goal
        switch (target){
            case NO_RING:
                drive(0.3, TILE_WIDTH_YES_TEETH *1.7, STRAFE_LEFT, false, false);
                drive(0.7, TILE_WIDTH_YES_TEETH *2.62, BACKWARDS, false, false);
                break;

            case ONE_RING:
                //drive(0.5, TILE_WIDTH_YES_TEETH *1, STRAFE_LEFT, false, false);
                drive(0.7, TILE_WIDTH_YES_TEETH * 3, BACKWARDS, false, false);
                break;

            case FOUR_RING:
                drive(0.3, TILE_WIDTH_YES_TEETH *2, STRAFE_LEFT, false, false);
                drive(0.7, TILE_WIDTH_YES_TEETH *4.2, BACKWARDS, false, false);
                break;
        }

        wobbleArm(UP, (long)50, 0.8);
        drive(0.28, TILE_WIDTH_YES_TEETH *0.9, STRAFE_RIGHT, false, false);
        claw(CLOSE);
        wobbleArm(UP, (long) 350, 0.8);
        armMotor.setPower(0.2);


        switch (target){
            case NO_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH *2.15, FORWARD, false, false);
                drive(0.5, TILE_WIDTH_YES_TEETH *1.6, STRAFE_RIGHT, false, false);

                break;

            case ONE_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH * 3, FORWARD, false, false);
                drive(0.5, TILE_WIDTH_YES_TEETH *1, STRAFE_RIGHT, false, false);
                break;

            case FOUR_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH *4.62, FORWARD, false, false);
                drive(0.25, TILE_WIDTH_YES_TEETH *1.9, STRAFE_RIGHT, false, false);
                break;
        }

        wobbleArm(DOWN, (long)2, 0.8);

        claw(OPEN);

        drive(0.5, TILE_WIDTH_YES_TEETH * 2.5, STRAFE_LEFT, false, false);





        //Read stack

        //Navigate to target zone
        //Park

        // – A pre-placed stack of Rings that corresponds to a selected Target Zone. Zero (0), one (1),
        //or four (4) Rings correspond to Target Zone Goals A, B, or C respectively.
    }
}
