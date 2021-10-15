package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import java.util.List;

@TeleOp
public class teleop extends LinearOpMode {

    DcMotor motorLeft1;
    DcMotor motorRight1;
    DcMotor motorLeft2;
    DcMotor motorRight2;
    DcMotor Carousel;
    DcMotor Intake;
    DcMotor Lift;
    Servo bucket;

    public void runOpMode() throws InterruptedException {

        motorLeft1 = hardwareMap.dcMotor.get("motorLeft1");
        motorRight1 = hardwareMap.dcMotor.get("motorRight1");
        motorLeft2 = hardwareMap.dcMotor.get("motorLeft2");
        motorRight2 = hardwareMap.dcMotor.get("motorRight2");
        Carousel = hardwareMap.dcMotor.get("Carousel");
        Intake = hardwareMap.dcMotor.get("Intake");
        Lift = hardwareMap.dcMotor.get("Lift");
        bucket = hardwareMap.servo.get("bucket");

        motorLeft1.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("opModeIsActive", opModeIsActive());
            telemetry.update();

            //weird mecanum stuff

            if(gamepad2.a)
            {
                Intake.setPower(-1);
            }
            else
            {
                Intake.setPower(gamepad1.right_trigger);
            }

            if(gamepad2.x)
            {
                bucket.setPosition(0);
            }
            if(gamepad2.b)
            {
                bucket.setPosition(1);
            }

            telemetry.addData("Motors Running", "Cool");
            telemetry.update();


            //idle();
        }
    }
}

            /*if (gamepad1.left_stick_y > 0.8 || gamepad1.left_stick_y < -0.8)
            {
                motorLeft.setPower(gamepad1.left_stick_y);
                motorRight.setPower(gamepad1.left_stick_y);
            }
            else if (gamepad1.left_stick_x > 0.8 || gamepad1.left_stick_x < -0.8)
            {
                motorMiddle.setPower(gamepad1.left_stick_x);
            }
            else
            {
                motorLeft.setPower(gamepad1.left_stick_y);
                motorRight.setPower(gamepad1.left_stick_y);
                motorMiddle.setPower(gamepad1.left_stick_x);
            }*/