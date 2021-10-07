package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.List;

@TeleOp
public class teleop extends LinearOpMode {

    private DcMotor motorLeft;
    private DcMotor motorRight;
    private DcMotor motorMiddle;

    public void runOpMode() throws InterruptedException {

        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");
        motorMiddle = hardwareMap.dcMotor.get("motorMiddle");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("opModeIsActive", opModeIsActive());
            telemetry.update();

            //motorLeft.setPower(0.5f);
            //motorRight.setPower(0.5f);

            telemetry.addData("Motors Running", "Cool");
            telemetry.update();
            if (gamepad1.left_stick_y > 0.8)
            {
                motorLeft.setPower(gamepad1.left_stick_y);
                motorRight.setPower(gamepad1.left_stick_y);
            }
            else if (gamepad1.left_stick_x > 0.8)
            {
                motorMiddle.setPower(gamepad1.left_stick_x);
            }
            else
            {
                motorLeft.setPower(gamepad1.left_stick_y);
                motorRight.setPower(gamepad1.left_stick_y);
                motorMiddle.setPower(gamepad1.left_stick_x);
            }
            motorLeft.setPower(gamepad1.right_stick_x);
            motorRight.setPower(gamepad1.right_stick_x);
            //idle();
        }
    }
}