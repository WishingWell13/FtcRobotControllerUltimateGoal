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

        drive(0.4, TILE_WIDTH_YES_TEETH *1.1 - ROBOTLENGTH, FORWARD, false, false);

        //Move left to align with rings

        int target = NO_RING; //change to read ring function

        switch (target){
            case NO_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH *2.6, FORWARD, false, false);


                break;

            case ONE_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH * 3, FORWARD, false, false);
                break;

            case THREE_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH *4, FORWARD, false, false);

                break;
        }

        wobbleArm(DOWN, (long)1300, 0.5);

        claw(OPEN);

        sleep(1000);


        //Go for second wobble goal
        switch (target){
            case NO_RING:
                drive(0.3, TILE_WIDTH_YES_TEETH *1.7, STRAFE_LEFT, false, false);
                drive(0.7, TILE_WIDTH_YES_TEETH *2.24, BACKWARDS, false, false);
                break;

            case ONE_RING:
                drive(0.5, TILE_WIDTH_YES_TEETH *1, STRAFE_LEFT, false, false);
                drive(0.7, TILE_WIDTH_YES_TEETH * 3, BACKWARDS, false, false);
                break;

            case THREE_RING:
                drive(0.5, TILE_WIDTH_YES_TEETH *2, STRAFE_LEFT, false, false);
                drive(0.7, TILE_WIDTH_YES_TEETH *4, BACKWARDS, false, false);
                break;
        }

        wobbleArm(UP, (long)50, 0.8);
        drive(0.4, TILE_WIDTH_YES_TEETH *0.4, STRAFE_RIGHT, false, false);
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
                drive(0.5, TILE_WIDTH_YES_TEETH *2, STRAFE_RIGHT, false, false);
                break;

            case THREE_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH *4, FORWARD, false, false);
                drive(0.5, TILE_WIDTH_YES_TEETH *1, STRAFE_RIGHT, false, false);
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
