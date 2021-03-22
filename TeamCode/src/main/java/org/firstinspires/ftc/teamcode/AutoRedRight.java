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
        drive(0.7, TILE_WIDTH_YES_TEETH *2, FORWARD, false, false);

        //Read stack

        //Navigate to target zone
        //Park
    }
}
