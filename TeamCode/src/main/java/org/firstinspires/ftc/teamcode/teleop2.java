package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class teleop2 extends LinearOpMode {

    DcMotor leftDrive;
    DcMotor rightDrive;
    DcMotor Intake;
    DcMotor linSlide;
    Servo Carousel;

    @Override
    public void runOpMode() {

        leftDrive = hardwareMap.dcMotor.get("leftDrive");
        rightDrive = hardwareMap.dcMotor.get("rightDrive");
        Intake = hardwareMap.dcMotor.get("Intake");
        linSlide = hardwareMap.dcMotor.get("linSlide");

        waitForStart();

        while (opModeIsActive()) {

            double leftPower;
            double rightPower;



            // Send calculated power to wheels
            leftDrive.setPower(1);
            rightDrive.setPower(1);

            // Show the elapsed game time and wheel power.
            telemetry.addData("Motors", "left (%.2f), right (%.2f)", 1, 1);
            telemetry.update();
        }
    }
}
