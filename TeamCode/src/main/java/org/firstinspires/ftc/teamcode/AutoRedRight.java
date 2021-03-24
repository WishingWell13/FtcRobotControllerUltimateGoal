package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Auto_Red_Right")
public class AutoRedRight extends Auto_Abstract {



    @Override
    public void runOpMode() {
        generalDefine();

        waitForStart();
        //============

        //Move Forward one square
        drive(0.7, TILE_WIDTH_YES_TEETH *2 - ROBOTLENGTH, FORWARD, false, false);

        //Move left to align with rings

        int target = NO_RING; //change to read ring function

        switch (target){
            case NO_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH *2, FORWARD, false, false);
                drive(0.7, TILE_WIDTH_YES_TEETH *1, STRAFE_RIGHT, false, false);

                break;

            case ONE_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH * 3, FORWARD, false, false);
                break;

            case THREE_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH *4, FORWARD, false, false);
                drive(0.7, TILE_WIDTH_YES_TEETH *1, STRAFE_RIGHT, false, false);
                break;
        }

        wobbleArm(DOWN, (long)0.5, 0.4);
        claw(OPEN);

        switch (target){
            case NO_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH *2, STRAFE_LEFT, false, false);
                drive(0.7, TILE_WIDTH_YES_TEETH *2, BACKWARDS, false, false);
                break;

            case ONE_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH *1, STRAFE_LEFT, false, false);
                drive(0.7, TILE_WIDTH_YES_TEETH * 3, BACKWARDS, false, false);
                break;

            case THREE_RING:
                drive(0.7, TILE_WIDTH_YES_TEETH *2, STRAFE_LEFT, false, false);
                drive(0.7, TILE_WIDTH_YES_TEETH *4, BACKWARDS, false, false);
                break;
        }

        //Read stack

        //Navigate to target zone
        //Park

        // – A pre-placed stack of Rings that corresponds to a selected Target Zone. Zero (0), one (1),
        //or four (4) Rings correspond to Target Zone Goals A, B, or C respectively.
    }
}
