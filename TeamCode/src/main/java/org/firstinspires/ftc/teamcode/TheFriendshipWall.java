package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name="Friendship Wall", group="Iterative Opmode")

public class TheFriendshipWall extends TeleOp_Abstract {
    DcMotor motor1;

    @Override
    public void init() {
        initStuff();
    }

    @Override
    public void loop() {
        rb.setPower(gamepad1.right_stick_y);
        telemetry.addData("Rb Power", rb.getPower());
        telemetry.update();
    }

    //Andy Smithwick
}
